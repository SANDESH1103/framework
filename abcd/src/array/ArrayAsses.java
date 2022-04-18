package array;

public class ArrayAsses {
	public static void main(String[] args) {
		int [] a= {20,40,10,84,03,84};
		System.out.println(a.length);
//		//for loop
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
//		
//		//for each loop
//		for(int i:a)
//		{
//			System.out.println(i);
//		}
		
		int search=84;
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		
//		for (int i = 0; i < a.length; i++) {
//			if(search==a[i])
//			{
//				System.out.println("Index possition is:"+i);
//				
//				break;//  No compulsion for break if we want search another same value in array you can remove break
//			}
			while(li<=hi)
			{
				if(search==a[mi])
				{
					System.out.println(mi);
				}
				else if(search>a[mi])
				{
					li=mi+1;
					System.out.println(li);
				}
				else if(search<a[mi]) 
				{
		         hi=mi-1;
		         System.out.println(hi);
		        }
				mi=(li+hi)/2;
				System.out.println(mi);
				break;
			}
				if(li>hi)
				{
					System.out.println("Element not found");
				}
	


}
}