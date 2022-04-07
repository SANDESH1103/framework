package threewheeler;

import java.util.Scanner;

public class PiggioL extends FuelTypeBrand {
	
		public void lpg1() {
			System.out.println("Specification:" +"Engine:Superior 236cc" +"Fuel tank:8L"+"Seating capacity:4 Person");
			System.out.println("Please contact showroom for more details");
			System.out.println("Otherwise We have special offer for you on online payment");
            System.out.println("Please press 1 if yes");
            Payment p=new Payment();
            Scanner sc=new Scanner(System.in);
            int a= sc.nextInt();
            switch(a)
            {
            case 1:p.petrol();
            break;
            default:
            	System.out.println("Thank you for your response");
            }
		 }
	}


