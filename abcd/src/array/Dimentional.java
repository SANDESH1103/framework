package array;

public class Dimentional {
	
  public static void main(String[] args) {
	  
	int [] [] a= {{1,0,3},
			      {4,2,1},
			      {3,2,1}};
	int [] [] b= {{0,0,1},{3,2,0},{4,5,3}};
	int [] [] c= new int [3] [3];
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c[i].length; j++) {
			   int sum=0;
			for (int k = 0; k < a[j].length; k++) {
			
				sum=sum+a[i][k]*b[k][j];
				}
			c[i][j]=sum;
			sum=0;
			
		}
	}
	
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c[i].length; j++) {
	       System.out.print(c[i][j]+"  ");
	
	}
		System.out.println();

    }
  }
  
}