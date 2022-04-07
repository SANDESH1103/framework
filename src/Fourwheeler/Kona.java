package Fourwheeler;

import java.util.Scanner;

public class Kona extends Mg{

	String varient;
	String engine;
	String transmission;
	int capacity;
	double mileage;
	// no argument constructor
	
   Kona(){
		
	}
	Kona(String varient,String engine,String transmission,int capacity,double mileage){
		this.varient=varient;
		this.engine=engine;
		this.transmission=transmission;
		this.capacity=capacity;
		this.mileage=mileage;
	}
	
	
	
	//FOR ELECTRIC VARIANTS
	
	
	
			// payment method for variant 1
				public void payE() {
					   System.out.println("Otherwise we have new year offer for online payment");
					   System.out.println("If you ready please select one option");
					   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
					   Scanner sc=new Scanner(System.in);
					   //Vehicles v= new Swift();
					   int a=sc.nextInt();
					  		   switch(a)
					   {
					   case 1: System.out.println("your amount is 23.79L for payment press 1 |To exit press 2");
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
					   case 2:System.out.println("your amount is 24.85L for payment press 1 |To exit press 2");
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
					  		 public void pay1E() {
					  		   System.out.println("Otherwise we have new year offer for online payment");
					  		   System.out.println("If you ready please select one option");
					  		   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
					  		   Scanner sc=new Scanner(System.in);
					  		   //Vehicles v= new Swift();
					  		   int a=sc.nextInt();
					  		  		   switch(a)
					  		   {
					  		   case 1: System.out.println("your amount is 23.97L for payment press 1 |To exit press 2");
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
					  		   case 2:System.out.println("your amount is 25.38L for payment press 1 |To exit press 2");
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
					  		  		
					  		 
					  	
					  		
				public void vari1E() {
					System.out.println("Please select one Varient");
					System.out.println("1:PREMIUM|2:PREMIUM DUAL TONE");
					Kona s=new Kona("PREMIUM","134.14","Automatic",5,300);
					Kona s1=new Kona("PREMIUM DUAL TONE","134.14","Automatic",5,300);
					
					Scanner sc=new Scanner(System.in);
					int i=sc.nextInt();
					switch(i) {
					case 1:
						System.out.println("Specifications:"  + "Varient:"+ s.varient  + "BHP:" + s.engine + "Transmission:" + s.transmission + "Seating Capacity:" + s.capacity+"Range:"+s.mileage +" Anti Lock Breaking System");
						System.out.println("For more details please contact to showroom");
						s.payE();
					   break;
					case 2:
						System.out.println("Specifications:"  + "Varient:"+ s1.varient  + "BHP:" + s1.engine + "Transmission:" + s1.transmission + "Seating Capacity:" + s1.capacity +"Range:"+s1.mileage+"Added features:"+"Multi funcation Steering"+"Alloy Wheels");
						System.out.println("For more details please contact to showroom");
						s1.pay1E();
						break;
					
					
						default:
						System.out.println("Please enter valid option");
								
					}
			   }
}
