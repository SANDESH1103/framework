package twowheeler;

import java.util.Scanner;

public class Activa extends Honda implements Colour{
	public void colour() {
	
			System.out.println("Please select one option");
			System.out.println("1.Red|2.Yellow|3.Blue|4:White");
			System.out.println("=======================");
			Scanner sc=new Scanner(System.in);
			int a= sc.nextInt(); 
			Activa av=new Activa();
			switch(a)
			{
			case 1:av.priceR();
				break;
			case 2:av.priceY();
				break;
			case 3:av.priceB();
			break;
			case 4:av.priceW();
				default:
					System.out.println("Please provide valid input");
			}
		}

	
	
//	public void colour() {
//		 System.out.println("Please select colour");
//		 System.out.println("1:Red");
//		 System.out.println("2:White");
//		 System.out.println("3:Black");
//	}
	 public void priceR() {
	 System.out.println("Please select price");
	 System.out.println("1:80000-83000");
	 System.out.println("2:85000-87000");
	    }
	 public void priceB() {
		 System.out.println("Please select price");
		 System.out.println("1:82000-85000");
		 System.out.println("2:85000-88000");
	 }
	 public void priceW() {
		 System.out.println("Please select price");
		 System.out.println("1:85000-87000");
		 System.out.println("2:87000-90000");
	 }
	 public void priceY() {
		 System.out.println("Please select price");
		 System.out.println("1:82000-85000");
		 System.out.println("2:85000-88000");
	 }
//	 public void payment1() {
//		 System.out.println("1.UPI(10% OFF)|2.INTERNET BANKING(5% OFF)");
//	 }
}
