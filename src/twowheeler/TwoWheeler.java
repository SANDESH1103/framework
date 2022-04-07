package twowheeler;
import java.util.Scanner;

import Vehicles.*;
public class TwoWheeler extends Vehicles{
	public void option() {
		System.out.println("Two wheeler");
		System.out.println("=============================");
		System.out.println("1:Bike|2:Cycle");
	    System.out.println("Please select one option");
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    Fueltype ft=new Fueltype();
	    
	    switch(a)
	    {
	    case 1:ft.fuel();
	    break;
	    case 2: ft.fuel();
	    break;
	    default :
	    	System.out.println("Please select valid option");
	    }
}
}