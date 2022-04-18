package pack1;
import java.util.Scanner;
public class Ib {
	public static void main(String[] args) {
		System.out.println("enter km");
		System.out.println("enter time");
	Scanner sc=new Scanner(System.in);
	
int k=sc.nextInt();
int t=sc.nextInt();
int r=2000;
int sum=0;
    if(k!=0 && k<=250 && t<=8 )
    {
    	sum=sum+r;
    	System.out.println(sum);
    }
    else if(k>250 && t<8) {
    	sum=sum+((k-250)*20)+r;
    	System.out.println(sum);
    }
    else if(k<250 && t>8){
    	sum=sum+((t-8)*100)+r;
    	System.out.println(sum);

    }
    else if(k>250 && t>8) {
    	sum=sum+((k-250)*20)+r;
    	System.out.println(sum);

    }
    else if(k==0 ||t==0) {
    	System.out.println("Invalid input");
    }
   }
}
