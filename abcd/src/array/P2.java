package array;

public class P2 {
	public static void main(String[] args) {
	
	 
		int [] [] a= {{1,0,3},
				      {4,2,1},
				      {3,2,1}};
		int [] [] b= {{0,0,1},{3,2,0},{4,5,3}};
		int [] [] c= new int [3] [3];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				int sum=0;
				for (int k = 0; k < a[i].length; k++) {
					
					sum=sum+a[i][k]*b[k][j];
					
					//sum=0;
					}
				c[i][j]=sum;

				System.out.print(c[i][j]+"  ");
				
				
			}
			System.out.println();
		}
		
  }
}
