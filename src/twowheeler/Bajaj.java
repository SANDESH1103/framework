package twowheeler;

import java.util.Scanner;

public class Bajaj extends Bike {
	public void  model() {
		System.out.println("Please select one option");
		System.out.println("1.Pulser|2.CT-100");
		System.out.println("=======================");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt(); 
		
	
		switch(a)
		{
		case 1:
			break;
		case 2:
			break;
		
			default:
				System.out.println("Please provide valid input");
		}
	}



}
