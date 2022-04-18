package array;

public class LargeElement {
public static void main(String[] args) {
	int [] a= {5,3,8,29,74,39,93,20,68};
	int large=Integer.MIN_VALUE;
	int large2=Integer.MIN_VALUE;;
	int large3=Integer.MIN_VALUE;;
	for (int i=0;i<a.length;i++)
	{
		if(a[i]>large)
		{
	large3=large2;
	large2=large;
	     large=a[i];
	   
     }
		
		
		else  if(a[i]>large2 && a[i]!=large){
			large3=large2;
			large2=a[i];
		}
//		if(a[i]>large2) {
//			large3=large2;
//			large2=a[i];
		
//		}
		else if(a[i]>large3 &&a[i]!=large && a[i]!=large2) {
				large3=a[i];
			}
				
				
		
     }
	System.out.println("The larger number:"+ large);
	System.out.println("The 2nd larger number:"+ large2);
	System.out.println("The 3rd larger number:"+ large3);
	
  }
}