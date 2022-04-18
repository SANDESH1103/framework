package pack1;
//import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
	//System.out.println("Enter first number:");
//	System.out.println("Enter secound number:");
	int a=10;
	int b=99;
	    	
	int num1=0;
	int rev=0;
	//int temp=a;
	for(int i=a;i<=b;i++)
	{ 
		
		 num1=i;
         rev=0;
	    while(num1!=0) {
		
	   
		int d=num1 %10;
		rev=rev*10+d;
		num1=num1/10;
		System.out.println(rev);
		System.out.println(num1);
		System.out.println(i);
	}
		if(i==rev) {
		
	    System.out.println("okk");
		}
	else{
		System.out.println("not okk");
	}
	

        }
      }
}
