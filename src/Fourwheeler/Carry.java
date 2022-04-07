package Fourwheeler;

import java.util.Scanner;

public class Carry extends Suzuki {
	String varient;
	String engine;
	String transmission;
	int capacity;
	double mileage;
	// no argument constructor
	
	Carry(){
		
	}
	Carry(String varient,String engine,String transmission,int capacity,double mileage){
		this.varient=varient;
		this.engine=engine;
		this.transmission=transmission;
		this.capacity=capacity;
		this.mileage=mileage;
	}
	
	
	
	// payment method for variant 1
	public void pay() {
		   System.out.println("Otherwise we have new year offer for online payment");
		   System.out.println("If you ready please select one option");
		   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
		   Scanner sc=new Scanner(System.in);
		   //Vehicles v= new Swift();
		   int a=sc.nextInt();
		  		   switch(a)
		   {
		   case 1: System.out.println("your amount is 4.28L for payment press 1 |To exit press 2");
		        int b=sc.nextInt();

		       switch(b) {
		       case 1: System.out.println("Thank you for your response we will contact you for more details");
			   break;
		       case 2:	 System.out.println("Thank you for  visit our website");
		       break;
		       default:
		    	   System.out.println("Please enter valid option");
		       }
		  break;
		   case 2:System.out.println("your amount is 5.12L for payment press 1 |To exit press 2");
		   int c=sc.nextInt();
	       switch(c) {
	       case 1: System.out.println("Thank you for your response we will contact you for more details");
		   break;
	       case 2:	 System.out.println("Thank you for  visit our website");
	       break;
	       default:
	    	   System.out.println("Please enter valid option");
	       }
		   break;
		   
		   default:
			   System.out.println("Thank you for  visit our website");
		   }
	}
	
	// payment method for variant 2
		  		 public void pay1() {
		  		   System.out.println("Otherwise we have new year offer for online payment");
		  		   System.out.println("If you ready please select one option");
		  		   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
		  		   Scanner sc=new Scanner(System.in);
		  		   //Vehicles v= new Swift();
		  		   int a=sc.nextInt();
		  		  		   switch(a)
		  		   {
		  		   case 1: System.out.println("your amount is 4.32L for payment press 1 |To exit press 2");
		  		        int b=sc.nextInt();

		  		       switch(b) {
		  		       case 1: System.out.println("Thank you for your response we will contact you for more details");
		  			   break;
		  		       case 2:	 System.out.println("Thank you for  visit our website");
		  		       break;
		  		       default:
		  		    	   System.out.println("Please enter valid option");
		  		       }
		  		  break;
		  		   case 2:System.out.println("your amount is 5.01L for payment press 1 |To exit press 2");
		  		   int c=sc.nextInt();
		  	       switch(c) {
		  	       case 1: System.out.println("Thank you for your response we will contact you for more details");
		  		   break;
		  	       case 2:	 System.out.println("Thank you for  visit our website");
		  	       break;
		  	       default:
		  	    	   System.out.println("Please enter valid option");
		  	       }
		  		   break;
		  		   
		  		   default:
		  			   System.out.println("Thank you for  visit our website");
		  		   }
		  	 }
		  		  		
		  		 
		  	// payment method for variant 3
		  		 
		  		 public void pay2() {
		 		  		   System.out.println("Otherwise we have new year offer for online payment");
		 		  		   System.out.println("If you ready please select one option");
		 		  		   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
		 		  		   Scanner sc=new Scanner(System.in);
		 		  		   //Vehicles v= new Swift();
		 		  		   int a=sc.nextInt();
		 		  		  		   switch(a)
		 		  		   {
		 		  		   case 1: System.out.println("your amount is 5.18L for payment press 1 |To exit press 2");
		 		  		        int b=sc.nextInt();

		 		  		       switch(b) {
		 		  		       case 1: System.out.println("Thank you for your response we will contact you for more details");
		 		  			   break;
		 		  		       case 2:	 System.out.println("Thank you for  visit our website");
		 		  		       break;
		 		  		       default:
		 		  		    	   System.out.println("Please enter valid option");
		 		  		       }
		 		  		  break;
		 		  		   case 2:System.out.println("your amount is 5.56L for payment press 1 |To exit press 2");
		 		  		   int c=sc.nextInt();
		 		  	       switch(c) {
		 		  	       case 1: System.out.println("Thank you for your response we will contact you for more details");
		 		  		   break;
		 		  	       case 2:	 System.out.println("Thank you for  visit our website");
		 		  	       break;
		 		  	       default:
		 		  	    	   System.out.println("Please enter valid option");
		 		  	       }
		 		  		   break;
		 		  		   
		 		  		   default:
		 		  			   System.out.println("Thank you for  visit our website");
		 		  		   }
		  		   
	                     }
		  		 
		  
	public void vari() {
		System.out.println("Please select one Varient");
		System.out.println("1:CNG STANDARD|2:PETROL CHASIS|3:PETROL STANDARD");
		Carry s=new Carry("CNG STANDARD","1196Cc","Manual",1600,22.30);
		Carry s1=new Carry("PETROL CHASIS","1196cc","Manual",1600,18.50);
		Carry s2=new Carry("PETROL STANDARD","1196cc","ManualL",1600,18.50);
		
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		switch(i) {
		case 1:
			System.out.println("Specifications:"  + "Varient:"+ s.varient  + "Engine:" + s.engine + "Transmission:" + s.transmission + "Pay Load:" + s.capacity);
			System.out.println("For more details please contact to showroom");
			s.pay();
		   break;
		case 2:
			System.out.println("Specifications:"  + "Varient:"+ s1.varient  + "Engine:" + s1.engine + "Transmission:" + s1.transmission + "Pay Load:" + s1.capacity +"Added features:"+"Driver Airbag"+"Power steering"+"Air conditioner");
			System.out.println("For more details please contact to showroom");
			s1.pay1();
			break;
		case 3:System.out.println("Specifications:"  + "Varient:"+ s2.varient  + "Engine:" + s2.engine + "Transmission:" + s2.transmission + "Pay Load:" + s2.capacity +"Added features:"+"Power window front"+"Wheel covers");
		System.out.println("For more details please contact to showroom");
			s2.pay2();
			break;
		  default:
			System.out.println("Please enter valid option");
					
		}
     }
}
