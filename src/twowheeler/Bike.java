package twowheeler;
import  Vehicles.*;
import java.util.Scanner;
public class Bike extends Vehicles {
	public void fuel() {
		System.out.println("Please select one option");
		System.out.println("1.Petrol|2.Electric");
		System.out.println("=======================");
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt(); 
		Fueltype ft=new Fueltype();
		switch(a)
		{
		case 1:ft.petrol();
			break;
		case 2:ft.electric();
			break;
		
			default:
				System.out.println("Please provide valid input");
		}
	}

    
	
	
	
   
}
