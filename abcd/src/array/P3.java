package array;

public class P3 {
public static void main(String[] args) {                         //role of i iterates row by row ie horizontally
	int [][]a= {{1,2,3},                                         //role of j iterates col by col ie vertically
			    {4,5,6}};                                        //role of k combo of both in a matrix copy i and in b matrix copy j 
	int [][]b= {{7,8},{9,10},{11,12}};
	int [][]c=new int[2][2];
	
	for (int i = 0; i < a.length; i++) {       //it will give right result because iteration of i required length of 3 & length of a[0],a[1],a[3] is 3  matching 
		                                          
		for (int j = 0; j < b[i].length; j++) { //it will right result because iteration of j required length of 2 & length of b[0],b[1] is 2  matching 
			int sum=0; 
			for (int k = 0; k < a[i].length; k++) { //it will give right result because iteration of k required length of 3 travelling vertically ie columnswise in b matrix and rowwise in a matrix  
				                             //& length of a[0],a[1],a[2] is 3  matching
				 sum=sum + a[i][k]*b[k][j];
				 
				 c[i][j]=sum;
			}
			
			 
			System.out.print(c[i][j] +"  ");
		 }
		System.out.println();
	  }
	
	}
  }

