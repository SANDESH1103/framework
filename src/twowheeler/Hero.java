package twowheeler;

import java.util.Scanner;

public class Hero extends Bike{
	public void  model() {
		System.out.println("Please select one option");
		System.out.println("1.Passionpro|2.SplenderPlus");
		System.out.println("=======================");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt(); 
		
		PassionPro pp=new PassionPro();
		SplenderPlus sp=new SplenderPlus ();
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
