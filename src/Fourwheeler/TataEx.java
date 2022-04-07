package Fourwheeler;

import java.util.Scanner;

public class TataEx extends Tata{
	String varient;
	String engine;
	String transmission;
	String capacity;
	double mileage;
	// no argument constructor
	
	TataEx(){
		
	}
	TataEx(String varient,String engine,String transmission,String capacity,double mileage){
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
	
		   int a=sc.nextInt();
		  		   switch(a)
		   {
		   case 1: System.out.println("your amount is 12.41L for payment press 1 |To exit press 2");
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
		   case 2:System.out.println("your amount is 13.45L for payment press 1 |To exit press 2");
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
		
			   int a=sc.nextInt();
			  		   switch(a)
			   {
			   case 1: System.out.println("your amount is 13.12L for payment press 1 |To exit press 2");
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
			   case 2:System.out.println("your amount is 14.56L for payment press 1 |To exit press 2");
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
	
	
	
	
	
	
	//FOR CNG HMV VEHICLES
		 
		public void cngCt() {
			System.out.println("Please select one Varient");
			System.out.println("1:407 EX");
			TataEx s=new TataEx("407 EX","3783cc","Manual","4000kg",25.11);
			
			
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
		
		
		public void cngCt1() {
			System.out.println("Please select one Varient");
			System.out.println("1:609 EX");
			
			TataEx s=new TataEx("PRO TATA 609EX","3783cc","Manual","6000kg",23.69);
			
			Scanner sc=new Scanner(System.in);
			int i=sc.nextInt();
			switch(i) {
			case 1:
				System.out.println("Specifications:"  + "Varient:"+ s.varient  + "Engine:" + s.engine + "Transmission:" + s.transmission + "Pay Load:" + s.capacity+"Anti Lock Breaking System");
				System.out.println("For more details please contact to showroom");
				s.pay1();
			   break;
			
			
			
				default:
				System.out.println("Please enter valid option");
						
			}
	     }
		//FOR DIESEL VARIANTS
		
		// payment method for variant 1
		public void payD() {
			   System.out.println("Otherwise we have new year offer for online payment");
			   System.out.println("If you ready please select one option");
			   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
			   Scanner sc=new Scanner(System.in);
		
			   int a=sc.nextInt();
			  		   switch(a)
			   {
			   case 1: System.out.println("your amount is 13.06L for payment press 1 |To exit press 2");
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
		
		
	 
		// payment method for variant 2
				public void payD1() {
					   System.out.println("Otherwise we have new year offer for online payment");
					   System.out.println("If you ready please select one option");
					   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
					   Scanner sc=new Scanner(System.in);
				
					   int a=sc.nextInt();
					  		   switch(a)
					   {
					   case 1: System.out.println("your amount is 13.06L for payment press 1 |To exit press 2");
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
				
		
   
//FOR DIESEL HMV VEHICLES
		 
		public void dieselCt() {
			System.out.println("Please select one Varient");
			System.out.println("1:PRO TATA 407EX");
			TataEx s=new TataEx("PRO TATA 407EX","3783cc","Manual","4000kg",23.09);
			
			
			Scanner sc=new Scanner(System.in);
			int i=sc.nextInt();
			switch(i) {
			case 1:
				System.out.println("Specifications:"  + "Varient:"+ s.varient  + "Engine:" + s.engine + "Transmission:" + s.transmission + "Pay Load:" + s.capacity+"Anti Lock Breaking System");
				System.out.println("For more details please contact to showroom");
				s.payD();
			   break;
			
			
				default:
				System.out.println("Please enter valid option");
						
			}
	     }
		
		public void dieselCt1() {
			System.out.println("Please select one Varient");
			System.out.println("1:PRO 609EX");
			TataEx s1=new TataEx("PRO TATA 609EX","3783cc","Manual","6000kg",23.69);
			
			Scanner sc=new Scanner(System.in);
			int i=sc.nextInt();
			switch(i) {
			case 1:
				System.out.println("Specifications:"  + "Varient:"+ s1.varient  + "Engine:" + s1.engine + "Transmission:" + s1.transmission + "Pay Load:" + s1.capacity+"Anti Lock Breaking System");
				System.out.println("For more details please contact to showroom");
				s1.payD1();
			   break;
			
			
				default:
				System.out.println("Please enter valid option");
						
			}
	     }
}
