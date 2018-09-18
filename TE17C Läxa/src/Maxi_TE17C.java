
import java.awt.event.InputEvent;
import java.util.Scanner;


public class Maxi_TE17C {

	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);
	System.out.println("Vad heter du?");
	String name=input.nextLine();
	System.out.println("Vad är din adress?");
	String adress=input.nextLine();
	System.out.println("Vad är ditt nummer?");
	String nummer=input.nextLine();
	System.out.println("Vilken klass går du i?");
	String klass=input.nextLine();
	
	System.out.println("Namn:" + name);
	System.out.println("Adress:" + adress);
	System.out.println("TelNr:" + nummer);
	System.out.println("Klass:" + klass);
	
	}

}
