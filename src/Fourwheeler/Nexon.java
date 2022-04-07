package Fourwheeler;

import java.util.Scanner;

public class Nexon extends Tata{
	String varient;
	String engine;
	String transmission;
	int capacity;
	double mileage;
	// no argument constructor
	
   Nexon(){
		
	}
	Nexon(String varient,String engine,String transmission,int capacity,double mileage){
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
		   case 1: System.out.println("your amount is 7.29L for payment press 1 |To exit press 2");
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
		   case 2:System.out.println("your amount is 7.62L for payment press 1 |To exit press 2");
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
		  		   case 1: System.out.println("your amount is 8.29L for payment press 1 |To exit press 2");
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
		  		   case 2:System.out.println("your amount is 8.57L for payment press 1 |To exit press 2");
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
		 		  		   case 1: System.out.println("your amount is 9.36L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 9.84L for payment press 1 |To exit press 2");
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
		 		  		   case 1: System.out.println("your amount is 9.99L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 10.22L for payment press 1 |To exit press 2");
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
		  		  	
		  		// payment method for variant 5  	
		  		  	
		  		  	
		  		  public void pay4() {
	 		  		   System.out.println("Otherwise we have new year offer for online payment");
	 		  		   System.out.println("If you ready please select one option");
	 		  		   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
	 		  		   Scanner sc=new Scanner(System.in);
	 		  		   //Vehicles v= new Swift();
	 		  		   int a=sc.nextInt();
	 		  		  		   switch(a)
	 		  		   {
	 		  		   case 1: System.out.println("your amount is 8.94L for payment press 1 |To exit press 2");
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
	 		  		   case 2:System.out.println("your amount is 9.15L for payment press 1 |To exit press 2");
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
		System.out.println("1:XE|2:XM|3:XZ|4:XZ PLUS|5:XMA AMT");
		Nexon s=new Nexon("XE","1199cc","Manual",5,17.20);
		Nexon s1=new Nexon("XM","1199cc","Manual",5,17.20);
		Nexon s2=new Nexon("XZ","1199cc","Manual",5,17.20);
		Nexon s3=new Nexon("XZ PLUS ","1199cc","Manual",5,17.20);
		Nexon s4=new Nexon("XMA AMT","1199cc","Automatic",5,17.20);
		
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		switch(i) {
		case 1:
			System.out.println("Specifications:"  + "Varient:"+ s.varient  + "Engine:" + s.engine + "Transmission:" + s.transmission + "Seating Capacity:" + s.capacity+"Anti Lock Breaking System");
			System.out.println("For more details please contact to showroom");
			s.pay();
		   break;
		case 2:
			System.out.println("Specifications:"  + "Varient:"+ s1.varient  + "Engine:" + s1.engine + "Transmission:" + s1.transmission + "Seating Capacity:" + s1.capacity +"Added features:"+"Multi funcation Steering"+"Alloy Wheels");
			System.out.println("For more details please contact to showroom");
			s1.pay1();
			break;
		case 3:System.out.println("Specifications:"  + "Varient:"+ s2.varient  + "Engine:" + s2.engine + "Transmission:" + s2.transmission + "Seating Capacity:" + s2.capacity +"Added features:"+"Electronic Stability Programme"+"Keyless entry"+ "Hill-hold assist");
		System.out.println("For more details please contact to showroom");
			s2.pay2();
			break;
		case 4:System.out.println("Specifications:"  + "Varient:"+ s3.varient  + "Engine:" + s3.engine + "Transmission:" + s3.transmission + "Seating Capacity:" + s3.capacity +"Added features:"+"Power Steering");
		System.out.println("For more details please contact to showroom");
			s3.pay3();
			break;
		case 5:System.out.println("Specifications:"  + "Varient:"+ s4.varient  + "Engine:" + s4.engine + "Transmission:" + s4.transmission + "Seating Capacity:" + s4.capacity +"Added features:"+"Fog Lights-Front");
		System.out.println("For more details please contact to showroom");
			s4.pay4();
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
			   case 1: System.out.println("your amount is 7.29L for payment press 1 |To exit press 2");
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
			   case 2:System.out.println("your amount is 7.62L for payment press 1 |To exit press 2");
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
			  		   case 1: System.out.println("your amount is 8.29L for payment press 1 |To exit press 2");
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
			  		   case 2:System.out.println("your amount is 8.57L for payment press 1 |To exit press 2");
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
			 		  		   case 1: System.out.println("your amount is 9.36L for payment press 1 |To exit press 2");
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
			 		  		   case 2:System.out.println("your amount is 9.84L for payment press 1 |To exit press 2");
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
			 		  		   case 1: System.out.println("your amount is 9.99L for payment press 1 |To exit press 2");
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
			 		  		   case 2:System.out.println("your amount is 10.22L for payment press 1 |To exit press 2");
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
			  		  	
			  		// payment method for variant 5  	
			  		  	
			  		  	
			  		  public void pay4D() {
		 		  		   System.out.println("Otherwise we have new year offer for online payment");
		 		  		   System.out.println("If you ready please select one option");
		 		  		   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
		 		  		   Scanner sc=new Scanner(System.in);
		 		  		   //Vehicles v= new Swift();
		 		  		   int a=sc.nextInt();
		 		  		  		   switch(a)
		 		  		   {
		 		  		   case 1: System.out.println("your amount is 8.94L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 9.15L for payment press 1 |To exit press 2");
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
			System.out.println("1:XE|2:XM|3:XZ|4:XZ PLUS|5:XMA AMT");
			Nexon s=new Nexon("XE","1199cc","Manual",5,17.20);
			Nexon s1=new Nexon("XM","1199cc","Manual",5,17.20);
			Nexon s2=new Nexon("XZ","1199cc","Manual",5,17.20);
			Nexon s3=new Nexon("XZ PLUS ","1199cc","Manual",5,17.20);
			Nexon s4=new Nexon("XMA AMT","1199cc","Automatic",5,17.20);
			
			Scanner sc=new Scanner(System.in);
			int i=sc.nextInt();
			switch(i) {
			case 1:
				System.out.println("Specifications:"  + "Varient:"+ s.varient  + "Engine:" + s.engine + "Transmission:" + s.transmission + "Seating Capacity:" + s.capacity+"Anti Lock Breaking System");
				System.out.println("For more details please contact to showroom");
				s.payD();
			   break;
			case 2:
				System.out.println("Specifications:"  + "Varient:"+ s1.varient  + "Engine:" + s1.engine + "Transmission:" + s1.transmission + "Seating Capacity:" + s1.capacity +"Added features:"+"Multi funcation Steering"+"Alloy Wheels");
				System.out.println("For more details please contact to showroom");
				s1.pay1D();
				break;
			case 3:System.out.println("Specifications:"  + "Varient:"+ s2.varient  + "Engine:" + s2.engine + "Transmission:" + s2.transmission + "Seating Capacity:" + s2.capacity +"Added features:"+"Electronic Stability Programme"+"Keyless entry"+ "Hill-hold assist");
			System.out.println("For more details please contact to showroom");
				s2.pay2D();
				break;
			case 4:System.out.println("Specifications:"  + "Varient:"+ s3.varient  + "Engine:" + s3.engine + "Transmission:" + s3.transmission + "Seating Capacity:" + s3.capacity +"Added features:"+"Power Steering");
			System.out.println("For more details please contact to showroom");
				s3.pay3D();
				break;
			case 5:System.out.println("Specifications:"  + "Varient:"+ s4.varient  + "Engine:" + s4.engine + "Transmission:" + s4.transmission + "Seating Capacity:" + s4.capacity +"Added features:"+"Fog Lights-Front");
			System.out.println("For more details please contact to showroom");
				s4.pay4D();
				break;
			
				default:
				System.out.println("Please enter valid option");
						
			}
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
				   case 1: System.out.println("your amount is 14.24L for payment press 1 |To exit press 2");
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
				   case 2:System.out.println("your amount is 15.69L for payment press 1 |To exit press 2");
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
				  		   case 1: System.out.println("your amount is 15.66L for payment press 1 |To exit press 2");
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
				  		   case 2:System.out.println("your amount is 16.89L for payment press 1 |To exit press 2");
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
				  		 
				  		 public void pay2E() {
				 		  		   System.out.println("Otherwise we have new year offer for online payment");
				 		  		   System.out.println("If you ready please select one option");
				 		  		   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
				 		  		   Scanner sc=new Scanner(System.in);
				 		  		   //Vehicles v= new Swift();
				 		  		   int a=sc.nextInt();
				 		  		  		   switch(a)
				 		  		   {
				 		  		   case 1: System.out.println("your amount is 15.99L for payment press 1 |To exit press 2");
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
				 		  		   case 2:System.out.println("your amount is 17.01L for payment press 1 |To exit press 2");
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
				  		  	public void pay3E() {
				 		  		   System.out.println("Otherwise we have new year offer for online payment");
				 		  		   System.out.println("If you ready please select one option");
				 		  		   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
				 		  		   Scanner sc=new Scanner(System.in);
				 		  		   //Vehicles v= new Swift();
				 		  		   int a=sc.nextInt();
				 		  		  		   switch(a)
				 		  		   {
				 		  		   case 1: System.out.println("your amount is 16.65L for payment press 1 |To exit press 2");
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
				 		  		   case 2:System.out.println("your amount is 17.98L for payment press 1 |To exit press 2");
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
				  		  	
				  		// payment method for variant 5  	
				  		  	
				  		  	
				  		  public void pay4E() {
			 		  		   System.out.println("Otherwise we have new year offer for online payment");
			 		  		   System.out.println("If you ready please select one option");
			 		  		   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
			 		  		   Scanner sc=new Scanner(System.in);
			 		  		   //Vehicles v= new Swift();
			 		  		   int a=sc.nextInt();
			 		  		  		   switch(a)
			 		  		   {
			 		  		   case 1: System.out.println("your amount is 16.85L for payment press 1 |To exit press 2");
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
			 		  		   case 2:System.out.println("your amount is 17.52L for payment press 1 |To exit press 2");
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
				System.out.println("1:XM|2:XZ PLUS|3:XZ PLUS DARK EDITION|4:XZ PLUS LUX|5:XZ PLUS LUX DARK EDITION");
				Nexon s=new Nexon("XE","127","Automatic",5,300);
				Nexon s1=new Nexon("XM","127","Automatic",5,300);
				Nexon s2=new Nexon("XZ","127","Automatic",5,300);
				Nexon s3=new Nexon("XZ PLUS ","127","Automatic",5,250);
				Nexon s4=new Nexon("XMA AMT","127","Automatic",5,250);
				
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
				case 3:System.out.println("Specifications:"  + "Varient:"+ s2.varient  + "BHP:" + s2.engine + "Transmission:" + s2.transmission + "Seating Capacity:" + s2.capacity+"Range:"+s2.mileage +"Added features:"+"Electronic Stability Programme"+"Keyless entry"+ "Hill-hold assist");
				System.out.println("For more details please contact to showroom");
					s2.pay2E();
					break;
				case 4:System.out.println("Specifications:"  + "Varient:"+ s3.varient  + "BHP:" + s3.engine + "Transmission:" + s3.transmission + "Seating Capacity:" + s3.capacity+"Range:"+s3.mileage +"Added features:"+"Power Steering");
				System.out.println("For more details please contact to showroom");
					s3.pay3E();
					break;
				case 5:System.out.println("Specifications:"  + "Varient:"+ s4.varient  + "BHP:" + s4.engine + "Transmission:" + s4.transmission + "Seating Capacity:" + s4.capacity +"Range:"+s4.mileage+"Added features:"+"Fog Lights-Front");
				System.out.println("For more details please contact to showroom");
					s4.pay4E();
					break;
				
					default:
					System.out.println("Please enter valid option");
							
				}
		   }
}