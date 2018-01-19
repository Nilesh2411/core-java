package Org.Java.Section8.Encapsulation;

public class Chellenge_encap_Printer {
	private double TonerLevel;
	private int pages;
	private String type;
	public Chellenge_encap_Printer(double tonerLevel, int pages, String type) {
		super();
		TonerLevel = tonerLevel;
		this.pages = pages;
		this.type = type;
	}
	public double AddTonaer(double toner){
	if(toner>0 &&toner<=100){
		if(this.TonerLevel+toner>100){
			return -1.0;
		}
		this.TonerLevel+=toner;
		return this.TonerLevel;
	}
	else {
		return -1;
	}
		
		
	}		
	
	public double getTonerLevel() {
		return TonerLevel;
	}
	public int getPages() {
		return pages;
	}
	public String getType() {
		return type;
	}
	
}
