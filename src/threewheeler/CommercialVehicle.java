package threewheeler;

import java.util.Scanner;

public class CommercialVehicle extends ThreeWheeler {
	
		
	
		public void type()
		{
			System.out.println("Please select one option");
			System.out.println("1:Petrol|2:Diesel");
			FuelTypeBrand ft=new FuelTypeBrand();
			Scanner sc=new Scanner (System.in);
			int a=sc.nextInt();
			switch(a)
			{
			case 1:ft.petrol();
				break;
			case 2:ft.diesel();
				break;
				default:
					System.out.println("Please enter valid input");
			}
         }
	}