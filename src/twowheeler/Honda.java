package twowheeler;

import java.util.Scanner;

public class Honda extends Bike  {
	public void model(){
		System.out.println("Please select one option");
		System.out.println("1.Activa|2.Shine");
		System.out.println("=======================");
		Scanner sc=new Scanner(System.in);
		int ab= sc.nextInt(); 
		Activa a=new Activa();
		Shine s=new Shine();
		switch(ab)
		{
		case 1:a.colour();
			break;
		case 2:s.colour();
			break;
		
			default:
				System.out.println("Please provide valid input");
		}
	}

	    }

