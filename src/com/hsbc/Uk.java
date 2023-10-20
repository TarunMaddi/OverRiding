package com.hsbc;

public class Uk extends Usa{
	public void oilExport() {
		super.oilExport();
		System.out.println("Export oil to Ukraine");
	}
	public void oilPrice() {
		super.oilPrice();
		System.out.println("Oil price for a Barell is: 20000$");
		System.out.println("git Hub");
		System.out.println("Hun");
	}
	public static void main(String [] args) {
		Uk o=new Uk();
		o.oilExport();
		o.oilPrice();
				
	}

}
