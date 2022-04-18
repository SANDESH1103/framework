package pack1;
import java.util.Scanner;

public class P12 {
	 
public static void array(int b) {
	Scanner sc=new Scanner(System.in);
   System.out.println("Enter Elements ");
	int[] a=new int [b];
	for (int i = 0; i < b; i++) {
		a[i]=sc.nextInt();
	}
	//int[]a= {17,4,5,6,10,11,4,-3,-5,3,15,2,7};
	int temp=  a[0];
	
	for (int i = 1; i < a.length; i++) {
		
		for (int j = i+1; j < a.length; j++) {
			if(temp==a[i]+a[j])
		{
			
				System.out.print(a[i]+","+ a[j] );
			 
			
			sc.close();
		}
			
		
    }
		//System.out.println();
  }
 
 
	
}


public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of an array");
	int b=sc.nextInt();
	P12.array(b);
	
}
}