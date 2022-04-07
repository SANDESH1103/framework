package threewheeler;
import java.util.Scanner;
public class Payment extends ThreeWheeler implements petrolp,dieselp{
	public void petrol() {
		System.out.println("Please select one option");
		System.out.println("1.CREDIT CARD (20%)2.UPI(10%)|3.INTERNET BANKING (5%)");
		ThreeWheeler tw= new ThreeWheeler();
		Scanner st=new Scanner(System.in);
		int a=st.nextInt();
		switch(a)
		{
		case 1:tw.payment();
		break;
		case 2:tw.payment();
			break;
		case 3:tw.payment();
		break;
			default:
				System.out.println("Please select valid input");
		}
	}
	public void petrolcv() {
		System.out.println("Please select one option");
		System.out.println("1.CREDIT CARD (20%)2.UPI(10%)|3.INTERNET BANKING (5%)");
		ThreeWheeler tw= new ThreeWheeler();
		Scanner st=new Scanner(System.in);
		int a=st.nextInt();
		switch(a)
		{
	case 1:tw.payment();
	break;
	case 2:tw.payment();
		break;
	case 3:tw.payment();
	break;
		default:
			System.out.println("Please select valid input");
	}
	}
	public  void electric() {
		System.out.println("Please select one option");
		System.out.println("1.CREDIT CARD (20%)2.UPI(10%)|3.INTERNET BANKING (5%)");
		ThreeWheeler tw= new ThreeWheeler();
		Scanner st=new Scanner(System.in);
		int a=st.nextInt();
		switch(a)
		{
	
	case 1:tw.payment();
	break;
	case 2:tw.payment();
		break;
	case 3:tw.payment();
	break;
		default:
			System.out.println("Please select valid input");
		
		}
		}
	public void diesel() {
		System.out.println("Please select one option");
		
		System.out.println("1.CREDIT CARD (20%)2.UPI(10%)|3.INTERNET BANKING (5%)");
		ThreeWheeler tw= new ThreeWheeler();
		Scanner st=new Scanner(System.in);
		int a=st.nextInt();
		switch(a)
		{
case 1:tw.payment();
break;
case 2:tw.payment();
	break;
case 3:tw.payment();
break;
	default:
		System.out.println("Please select valid input");
		}
     }
	public void dieselcv() {
		System.out.println("Please select one option");
		System.out.println("1.CREDIT CARD (20%)2.UPI(10%)|3.INTERNET BANKING (5%)");
		ThreeWheeler tw= new ThreeWheeler();
		Scanner st=new Scanner(System.in);
		int a=st.nextInt();
		switch(a)
		{
	
	case 1:tw.payment();
	break;
	case 2:tw.payment();
		break;
	case 3:tw.payment();
	break;
		default:
			System.out.println("Please select valid input");
	}
	}
 
}
