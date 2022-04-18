package pack1;
import java.util.Scanner;

public class Encapsulation {
private double money=100000;

public void withdrawl() {
	System.out.println("You can withdrawl");
}
public double getMoney() {
	
	return money;
}

public void setMoney(double money) {
	this.money=money;
	
}
public void checkBalance(double b) {
	Encapsulation e= new Encapsulation();
	System.out.println("You want to see your balance");
	Scanner sc=new Scanner(System.in);
	System.out.println("1:YES|2:NO");
	int c=sc.nextInt();
	switch(c)
	{
	case 1:
		System.out.println(e.getMoney()-b); 
		break;
	case 2:
		System.out.println("Thank you for your response");
		break;
		default:
		System.out.println("Please enter valid input");
		
	}
	
	
	}

public static void main(String[] args) {
	boolean done=true;

	do{
	Encapsulation e= new Encapsulation();
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter your pin");
	int a=sc.nextInt();
	    
		switch(a)
	
	{
	case 1234:
		e.withdrawl();
		System.out.println("Please enter amount");
		int b=sc.nextInt();
		if(b<e.getMoney()) {
			e.setMoney(b);
			e.checkBalance(b);
		}
		else {
			System.out.println("please enter valid amount");
			
		}
		break;
		default:
			done=false;
			System.out.println("Please enter valid pin");
	}
	}while(!done);
	
  }
}
