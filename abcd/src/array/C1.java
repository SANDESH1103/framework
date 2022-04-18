package array;
//import java.util.LinkedList;
//import java.util.Iterator;
public class C1 {
	
		
	
	//int esum=0;
	//int osum=0;
//	while(n!=0)
//	{
		//int d=n%10;
//	
//		if(d%2==0)
//		{	
//          esum=esum+d;
//		}
//		else {
//			osum=osum+d;
//		}
//		
//          n/=10;
//      }
		//int n=8;
//	for (int i=2;i<n;i++)
//	{
//		if(n/i==0)
//		{
//			System.out.println("not a prime number");
//			return;
//		}
//		
//			System.out.println("prime number");
//		}
		
//		public static void main(String[] args) {
//		int n=676494994;
//		int rev=0;
//		while(n!=0) {
//			int d=n%10;
//			System.out.println(d);
//			rev=rev*10+d;
//			System.out.println(rev);
//			n=n/10;
//			System.out.println(n);
//		}
//		System.out.println(rev);
//	}
	public static void main(String[] args) {
		
	
	int [] a= {5,9,12,16,25};
	
	for(int i=0;i<a.length/2;i++)
	{
		int t=a[i];
		a[i]=a[a.length-1-i];
		a[a.length-1-i]=t;
		//System.out.println(a[i]);
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
		
		
   }
}
	
	
	
	 
 
