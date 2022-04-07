package twowheeler;

import java.util.Scanner;

public class Shine extends Honda {
 
	public void colour() {
		
		System.out.println("Please select one option");
		System.out.println("1.Grey|2.Black");
		System.out.println("=======================");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt(); 
		Shine s=new Shine();
		switch(a)
		{
		case 1:s.priceG();
			break;
		case 2:s.priceB();
			break;
		default:
				System.out.println("Please provide valid input");
		}
	}



//public void colour() {
//	 System.out.println("Please select colour");
//	 System.out.println("1:Red");
//	 System.out.println("2:White");
//	 System.out.println("3:Black");
//}
 public void priceG() {
 System.out.println("Please select price");
 System.out.println("1:83000-87000");
 System.out.println("2:87000-90000");
    }
 public void priceB() {
	 System.out.println("Please select price");
	 System.out.println("1:80000-83000");
	 System.out.println("2:83000-85000");
 }

 public void payment() {
	 System.out.println("1.UPI(10% OFF)|2.INTERNET BANKING(5% OFF)");
 }
}