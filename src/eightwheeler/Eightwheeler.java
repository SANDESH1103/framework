package eightwheeler;
import Vehicles.*;
import java.util.Scanner;
public class Eightwheeler extends Vehicles {
	public void brand() {
		System.out.println("Please select brand");
		System.out.println("1.TATA|2.BHARAT BENZ|3.ASHOK LEYLAND");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		TataH t=new TataH();
		BharatBenz b=new BharatBenz();
		AshokLeyland al=new AshokLeyland();
		switch(a)
		{
		case 1:t.type();
		break;
		case 2:b.type();
		break;
		case 3:al.type();
		break;
		default:
			System.out.println("Please enter valid input");
	}
  }
}