import java.util.Scanner;

public class Ders {
	static int tie = 0;
	static int win = 0;
	static int lose = 0;
	static int gamecount;
	static Scanner scan = new Scanner(System.in);
	
	//Babakodlarincelenecek
	static final String RESET = "\u001B[0m";
    static final String KIRMIZI = "\u001B[31m";
    static final String YANIP_SON = "\u001B[5m";
    //Babakodlarsaglammis
	
public static void main(String[] args) throws InterruptedException{
	System.out.print("C=clear E=exit");
	while(true){
		System.out.println(YANIP_SON + KIRMIZI + "---------" + RESET);
		oyun();
}
}
public static void oyun() throws InterruptedException{
	int a = gamer();
	int b = computer();
	
	if(a == b) {
		tie++;
		System.out.println("Berabere");}
	else if(a == 1 && b == 3 || a == 2 && b==1 || a == 3 && b == 2) {
		System.out.println("Kazandin");
		win++;}
	else if(b == 1 && a == 3 || b == 2 && a==1 || b == 3 && a == 2 ){ 
		System.out.println("Kaybettin");
		lose++;}
	System.out.print("Win:" + win + " Lose:"+ lose + " Tie:" + tie + " ");
	gamecount = tie+win+lose;
	System.out.println("Total:" + gamecount);
}
public static int rastgele(){
	return (int) (Math.random()*3+1);}
public static int computer(){
	int a = rastgele();
	return a;}
public static int gamer() throws InterruptedException{
	System.out.print("\nChoose bitte T/K/M:");
	Thread.sleep(200);
	System.out.print("\rChoose bitte T|K|M:");
	Thread.sleep(200);
	System.out.print("\rChoose bitte T\\K\\M:");
	Thread.sleep(200);
	char a = Character.toUpperCase(scan.next().charAt(0));
	int p = 0;
	switch (a){
	case 'T':
		p = 1;
		break;
	  
	case 'K':
		p = 2;
		break;
	
	case 'M':
		p = 3;
		break;
	case 'C':
		System.out.print("\033[H\033[2J");
        System.out.flush();
        break;
	case 'E':
		System.exit(0);
	default:
		System.out.println("\nAnani ariyorum");}
	return p;
}
}

