package array;

public class Des {
public static void main(String[] args) {
	int []a= {5,84,392,83,20,92,10,81,87};
	
	for (int i=0;i<a.length-1;i++) {
		int j=i+1;
			if(a[i]<a[j])
			{
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
		    }
	}
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i] + "  ");
  }
 }
}
