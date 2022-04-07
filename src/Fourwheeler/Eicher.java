package Fourwheeler;

import java.util.Scanner;

public class Eicher extends Fourwheeler{
	String varient;
	String engine;
	String transmission;
	String capacity;
	double mileage;
	// no argument constructor
	
   Eicher(){
		
	}
	Eicher(String varient,String engine,String transmission,String capacity,double mileage){
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
		   case 1: System.out.println("your amount is 11.13L for payment press 1 |To exit press 2");
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
		   case 2:System.out.println("your amount is 14.23L for payment press 1 |To exit press 2");
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
	
	
      //FOR CNG HMV FOUR WHEEL VEHICLES
		  		 
		  		public void cngCe() {
		  			System.out.println("Please select one Varient");
		  			System.out.println("1:PRO 2049");
		  			Eicher s=new Eicher("PRO 2049","2000cc","Manual","3000kg",23.09);
		  			
		  			
		  			Scanner sc=new Scanner(System.in);
		  			int i=sc.nextInt();
		  			switch(i) {
		  			case 1:
		  				System.out.println("Specifications:"  + "Varient:"+ s.varient  + "Engine:" + s.engine + "Transmission:" + s.transmission + "Pay Load:" + s.capacity+"Anti Lock Breaking System");
		  				System.out.println("For more details please contact to showroom");
		  				s.pay();
		  			   break;
		  			
		  			
		  				default:
		  				System.out.println("Please enter valid option");
		  						
		  			}
		  	     }
		  		
		  		//FOR DIESEL HMV FOUR WHEEL VEHICLES
		  		
		  	// payment method for variant 1
		  		public void pay1() {
		  			   System.out.println("Otherwise we have new year offer for online payment");
		  			   System.out.println("If you ready please select one option");
		  			   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
		  			   Scanner sc=new Scanner(System.in);
		  			   //Vehicles v= new Swift();
		  			   int a=sc.nextInt();
		  			  		   switch(a)
		  			   {
		  			   case 1: System.out.println("your amount is 11.60L for payment press 1 |To exit press 2");
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
		  			   case 2:System.out.println("your amount is 14.68L for payment press 1 |To exit press 2");
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
		  		public void pay2() {
		  			   System.out.println("Otherwise we have new year offer for online payment");
		  			   System.out.println("If you ready please select one option");
		  			   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
		  			   Scanner sc=new Scanner(System.in);
		  			   //Vehicles v= new Swift();
		  			   int a=sc.nextInt();
		  			  		   switch(a)
		  			   {
		  			   case 1: System.out.println("your amount is 14.11L for payment press 1 |To exit press 2");
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
		  			   case 2:System.out.println("your amount is 15.13L for payment press 1 |To exit press 2");
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
		  		
		  		
		  		
		  	      //FOR DIESEL HMV FOUR WHEEL VEHICLES
		  			  		 
		  			  		public void dieselChe() {
		  			  			System.out.println("Please select one Varient");
		  			  			System.out.println("1:PRO 2049|2:PRO 2059");
		  			  			Eicher s=new Eicher("PRO 2049","2000cc","Manual","3000kg",22.25);
		  			  		    Eicher s1=new Eicher("PRO 2059","2000cc","Manual","3500kg",18.09);
		  			  			
		  			  			Scanner sc=new Scanner(System.in);
		  			  			int i=sc.nextInt();
		  			  			switch(i) {
		  			  			case 1:
		  			  				System.out.println("Specifications:"  + "Varient:"+ s.varient  + "Engine:" + s.engine + "Transmission:" + s.transmission + "Pay Load:" + s.capacity+"Anti Lock Breaking System");
		  			  				System.out.println("For more details please contact to showroom");
		  			  				s.pay1();
		  			  			   break;
		  			  		     case 2:
	  			  				System.out.println("Specifications:"  + "Varient:"+ s.varient  + "Engine:" + s.engine + "Transmission:" + s.transmission + "Pay Load:" + s.capacity+"Anti Lock Breaking System");
	  			  				System.out.println("For more details please contact to showroom");
	  			  				s1.pay2();
	  			  			   break;
		  			  			
		  			  				default:
		  			  				System.out.println("Please enter valid option");
		  			  						
		  			  			}
		  			  	     }
}
