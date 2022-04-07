package threewheeler;
import java.util.Scanner;
public class PublicTransport extends ThreeWheeler {
public void type() {
	System.out.println("Please Select one option");
	System.out.println("=======================");
	System.out.println("1:Auto");
	System.out.println("Please Select one option");
	Scanner sc=new Scanner (System.in);
	int a=sc.nextInt();
	Auto at=new Auto();
	switch(a)
	{
	case 1:at.type();
		break;
	default:
		System.out.println("Please enter valid input");
	
	}
	
	
	
	
	
	
	
	
}

}
