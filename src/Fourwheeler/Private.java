package Fourwheeler;

import java.util.Scanner;



public class Private extends Fourwheeler {
	public void fuel() {
		System.out.println("Please select one option");
		System.out.println("1.Petrol|2.Diesel|3.Electric");
		System.out.println("=======================");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt(); 
		FuelType ft=new FuelType();
		switch(a)
		{
		case 1:ft.petrol();
			break;
		case 2:ft.diesel();
			break;
		case 3:ft.electric();
			default:
				System.out.println("Please provide valid input");
		}
	}

}
