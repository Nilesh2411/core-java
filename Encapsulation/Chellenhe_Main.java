package Org.Java.Section8.Encapsulation;

public class Chellenhe_Main {
	public static void main(String[] args) {
		Chellenge_encap_Printer P = new Chellenge_encap_Printer(25.5,200,"double side");
		P.AddTonaer(100.5);
		System.out.println("your Current Toner level is   "+P.getTonerLevel());
	
	}
	

}
