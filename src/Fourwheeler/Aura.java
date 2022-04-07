package Fourwheeler;

import java.util.Scanner;

public class Aura extends Hyundai {
	String varient;
	String engine;
	String transmission;
	int capacity;
	double mileage;
	// no argument constructor
	
	Aura(){
		
	}
	Aura(String varient,String engine,String transmission,int capacity,double mileage){
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
		   case 1: System.out.println("your amount is 5.99L for payment press 1 |To exit press 2");
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
		   case 2:System.out.println("your amount is 6.15L for payment press 1 |To exit press 2");
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
		  		   case 1: System.out.println("your amount is 6.78L for payment press 1 |To exit press 2");
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
		  		   case 2:System.out.println("your amount is 6.94L for payment press 1 |To exit press 2");
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
		 		  		   case 1: System.out.println("your amount is 7.47L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 7.85L for payment press 1 |To exit press 2");
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
	// payment method for variant 4
		  		 
		  		 public void pay3() {
		 		  		   System.out.println("Otherwise we have new year offer for online payment");
		 		  		   System.out.println("If you ready please select one option");
		 		  		   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
		 		  		   Scanner sc=new Scanner(System.in);
		 		  		   //Vehicles v= new Swift();
		 		  		   int a=sc.nextInt();
		 		  		  		   switch(a)
		 		  		   {
		 		  		   case 1: System.out.println("your amount is 7.28L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 7.65L for payment press 1 |To exit press 2");
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
		System.out.println("1:E|2:S|3:S4|4:S AMT");
		Aura s=new Aura("E","1107cc","Manual",5,20.50);
		Aura s1=new Aura("S","1107cc","Manual",5,20.50);
		Aura s2=new Aura("S4","1107cc","Manual",5,20.50);
		Aura s3=new Aura("S AMT","1107cc","Automatic",5,20.50);
		
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		switch(i) {
		case 1:
			System.out.println("Specifications:"  + "Varient:"+ s.varient  + "Engine:" + s.engine + "Transmission:" + s.transmission + "Seating Capacity:" + s.capacity);
			System.out.println("For more details please contact to showroom");
			s.pay();
		   break;
		case 2:
			System.out.println("Specifications:"  + "Varient:"+ s1.varient  + "Engine:" + s1.engine + "Transmission:" + s1.transmission + "Seating Capacity:" + s1.capacity +"Added features:"+"Driver Airbag"+"Power steering"+"Air conditioner");
			System.out.println("For more details please contact to showroom");
			s1.pay1();
			break;
		case 3:System.out.println("Specifications:"  + "Varient:"+ s2.varient  + "Engine:" + s2.engine + "Transmission:" + s2.transmission + "Seating Capacity:" + s2.capacity +"Added features:"+"Power window front"+"Wheel covers");
		System.out.println("For more details please contact to showroom");
			s2.pay2();
			break;
		case 4:System.out.println("Specifications:"  + "Varient:"+ s3.varient  + "Engine:" + s3.engine + "Transmission:" + s3.transmission + "Seating Capacity:" + s3.capacity +"Added features:"+"Power window front"+"Wheel covers");
		System.out.println("For more details please contact to showroom");
			s3.pay3();
			break;
				default:
			System.out.println("Please enter valid option");
					
		}
    }
	
	//For Diesel Variants
	// payment method for variant 1
		public void payD() {
			   System.out.println("Otherwise we have new year offer for online payment");
			   System.out.println("If you ready please select one option");
			   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
			   Scanner sc=new Scanner(System.in);
			   //Vehicles v= new Swift();
			   int a=sc.nextInt();
			  		   switch(a)
			   {
			   case 1: System.out.println("your amount is 5.99L for payment press 1 |To exit press 2");
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
			   case 2:System.out.println("your amount is 6.15L for payment press 1 |To exit press 2");
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
			  		 public void pay1D() {
			  		   System.out.println("Otherwise we have new year offer for online payment");
			  		   System.out.println("If you ready please select one option");
			  		   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
			  		   Scanner sc=new Scanner(System.in);
			  		   //Vehicles v= new Swift();
			  		   int a=sc.nextInt();
			  		  		   switch(a)
			  		   {
			  		   case 1: System.out.println("your amount is 6.78L for payment press 1 |To exit press 2");
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
			  		   case 2:System.out.println("your amount is 6.94L for payment press 1 |To exit press 2");
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
			  		 
			  		 public void pay2D() {
			 		  		   System.out.println("Otherwise we have new year offer for online payment");
			 		  		   System.out.println("If you ready please select one option");
			 		  		   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
			 		  		   Scanner sc=new Scanner(System.in);
			 		  		   //Vehicles v= new Swift();
			 		  		   int a=sc.nextInt();
			 		  		  		   switch(a)
			 		  		   {
			 		  		   case 1: System.out.println("your amount is 7.47L for payment press 1 |To exit press 2");
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
			 		  		   case 2:System.out.println("your amount is 7.85L for payment press 1 |To exit press 2");
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
		// payment method for variant 4
			  		 
			  		 public void pay3D() {
			 		  		   System.out.println("Otherwise we have new year offer for online payment");
			 		  		   System.out.println("If you ready please select one option");
			 		  		   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
			 		  		   Scanner sc=new Scanner(System.in);
			 		  		   //Vehicles v= new Swift();
			 		  		   int a=sc.nextInt();
			 		  		  		   switch(a)
			 		  		   {
			 		  		   case 1: System.out.println("your amount is 7.28L for payment press 1 |To exit press 2");
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
			 		  		   case 2:System.out.println("your amount is 7.65L for payment press 1 |To exit press 2");
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
			  
		public void vari1() {
			System.out.println("Please select one Varient");
			System.out.println("1:E|2:S|3:S4|4:S AMT");
			Aura s=new Aura("E","1107cc","Manual",5,20.50);
			Aura s1=new Aura("S","1107cc","Manual",5,20.50);
			Aura s2=new Aura("S4","1107cc","Manual",5,20.50);
			Aura s3=new Aura("S AMT","1107cc","Automatic",5,20.50);
			
			Scanner sc=new Scanner(System.in);
			int i=sc.nextInt();
			switch(i) {
			case 1:
				System.out.println("Specifications:"  + "Varient:"+ s.varient  + "Engine:" + s.engine + "Transmission:" + s.transmission + "Seating Capacity:" + s.capacity);
				System.out.println("For more details please contact to showroom");
				s.payD();
			   break;
			case 2:
				System.out.println("Specifications:"  + "Varient:"+ s1.varient  + "Engine:" + s1.engine + "Transmission:" + s1.transmission + "Seating Capacity:" + s1.capacity +"Added features:"+"Driver Airbag"+"Power steering"+"Air conditioner");
				System.out.println("For more details please contact to showroom");
				s1.pay1D();
				break;
			case 3:System.out.println("Specifications:"  + "Varient:"+ s2.varient  + "Engine:" + s2.engine + "Transmission:" + s2.transmission + "Seating Capacity:" + s2.capacity +"Added features:"+"Power window front"+"Wheel covers");
			System.out.println("For more details please contact to showroom");
				s2.pay2D();
				break;
			case 4:System.out.println("Specifications:"  + "Varient:"+ s3.varient  + "Engine:" + s3.engine + "Transmission:" + s3.transmission + "Seating Capacity:" + s3.capacity +"Added features:"+"Power window front"+"Wheel covers");
			System.out.println("For more details please contact to showroom");
				s3.pay3D();
				break;
					default:
				System.out.println("Please enter valid option");
						
			}
	}
	
}
