package threewheeler;
import java.util.Scanner;
public class Auto extends PublicTransport {
public void type() {
	System.out.println("Please select fuel type");
	System.out.println("1.CNG|2.LPG|3.ELECTRIC");
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	FuelTypeBrand ft=new FuelTypeBrand();
		switch(i)
	{
	
	case 1:ft.brand();
	break;
	case 2:ft.brand1();
	break;
	case 3:ft.brand2();
	break;
	default:
		System.out.println("Please select valid option");
	}
}
}
