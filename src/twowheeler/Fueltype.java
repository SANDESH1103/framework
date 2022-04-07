package twowheeler;

import java.util.Scanner;


public class Fueltype extends Bike implements Petrol,Electric {
	public void petrol() {
		System.out.println("Please select brand");
		  System.out.println("1:Hero|2:Honda|3.Bajaj");
		  Scanner sc=new Scanner(System.in);
		  int a = sc.nextInt();
		  Hero h=new Hero();
		  Honda hd=new Honda();
		  Bajaj b=new Bajaj();
		  
		  
		  switch(a)
		  {
		  case 1:h.model();
			  break;
		  case 2:hd.model();
			  break;
		  case 3:b.model();
			  default:
				  System.out.println("Please select valid option");
		  }
	  }
		 
	
	public  void electric() {
		System.out.println("Please select one option");
		System.out.println("1.Hero|2.Bajaj|3.Ola");
		System.out.println("=======================");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt(); 
		Hero h=new Hero();
		Bajaj b=new Bajaj();
		//Ola o=new Ola();
		switch(a)
		{
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
			default:
				System.out.println("Please provide valid input");
		}
	}


}
