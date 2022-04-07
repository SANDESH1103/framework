package threewheeler;
import Vehicles.*;
import java.util.*;
public class ThreeWheeler extends Vehicles {
	public void type() {
		System.out.println("Please select one");
		System.out.println("1.Public transport|2.Commercial vehicles");
		System.out.println("Please select one option");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		PublicTransport pt=new PublicTransport();
		CommercialVehicle cv= new CommercialVehicle();
		switch(a)
		{
		case 1:pt.type();
		break;
		case 2:cv.type();
		break;
		default:
			System.out.println("Please provide valid option");
		       
		}
		
}

public void payment(){
	System.out.println("Thank you for ypor payment We will contact you for delivery");
}
}