package Fourwheeler;

import java.util.Scanner;

public class Tiago extends Tata {
	String varient;
	String engine;
	String transmission;
	int capacity;
	double mileage;
	// no argument constructor
	
   Tiago(){
		
	}
	Tiago(String varient,String engine,String transmission,int capacity,double mileage){
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
		   case 1: System.out.println("your amount is 4.99L for payment press 1 |To exit press 2");
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
		  		   case 1: System.out.println("your amount is 5.72L for payment press 1 |To exit press 2");
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
		  		   case 2:System.out.println("your amount is 5.84L for payment press 1 |To exit press 2");
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
		 		  		   case 1: System.out.println("your amount is 6.12L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 6.22L for payment press 1 |To exit press 2");
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
		 		  		   case 1: System.out.println("your amount is 6.40L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 6.53L for payment press 1 |To exit press 2");
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
	 		  		   case 1: System.out.println("your amount is 6.27L for payment press 1 |To exit press 2");
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
	 		  		   case 2:System.out.println("your amount is 6.38L for payment press 1 |To exit press 2");
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
		  		  
		  		// payment method for variant 6 	
		  		 public void pay5() {
	 		  		   System.out.println("Otherwise we have new year offer for online payment");
	 		  		   System.out.println("If you ready please select one option");
	 		  		   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
	 		  		   Scanner sc=new Scanner(System.in);
	 		  		   //Vehicles v= new Swift();
	 		  		   int a=sc.nextInt();
	 		  		  		   switch(a)
	 		  		   {
	 		  		   case 1: System.out.println("your amount is 6.67L for payment press 1 |To exit press 2");
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
	 		  		   case 2:System.out.println("your amount is 6.74L for payment press 1 |To exit press 2");
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
		System.out.println("1:XE,2:XT|3:XZ|4:XZ PLUS*|5:XTA AMT|6:XZA AMT");
		Tiago s=new Tiago("XE","1199cc","Manual",5,23.84);
		Tiago s1=new Tiago("XT","1199cc","Manual",5,23.84);
		Tiago s2=new Tiago("XZ","1199cc","Automatic",5,23.84);
		Tiago s3=new Tiago("XZ PLUS ","1199cc","Manual",5,23.84);
		Tiago s4=new Tiago("XTA AMT","1199cc","Automatic",5,23.84);
		Tiago s5=new Tiago("XZA AMT","1199cc","Automatic",5,23.84);
		
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
		case 6:System.out.println("Specifications:"  + "Varient:"+ s5.varient  + "Engine:" + s5.engine + "Transmission:" + s5.transmission + "Seating Capacity:" + s5.capacity +"Added features:"+"Fog Lights-Front");
		System.out.println("For more details please contact to showroom");
			s5.pay5();
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
			   case 1: System.out.println("your amount is 5.36L for payment press 1 |To exit press 2");
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
			   case 2:System.out.println("your amount is 5.98L for payment press 1 |To exit press 2");
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
			  		   case 2:System.out.println("your amount is 6.59L for payment press 1 |To exit press 2");
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
			 		  		   case 1: System.out.println("your amount is 6.56L for payment press 1 |To exit press 2");
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
			 		  		   case 2:System.out.println("your amount is 6.89L for payment press 1 |To exit press 2");
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
			 		  		   case 1: System.out.println("your amount is 6.87L for payment press 1 |To exit press 2");
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
			 		  		   case 2:System.out.println("your amount is 7.26L for payment press 1 |To exit press 2");
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
		 		  		   case 1: System.out.println("your amount is 6.89L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 7.86L for payment press 1 |To exit press 2");
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
			  		  
			  		// payment method for variant 6 	
			  		 public void pay5D() {
		 		  		   System.out.println("Otherwise we have new year offer for online payment");
		 		  		   System.out.println("If you ready please select one option");
		 		  		   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
		 		  		   Scanner sc=new Scanner(System.in);
		 		  		   //Vehicles v= new Swift();
		 		  		   int a=sc.nextInt();
		 		  		  		   switch(a)
		 		  		   {
		 		  		   case 1: System.out.println("your amount is 7.23L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 7.89L for payment press 1 |To exit press 2");
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
			System.out.println("1:XE,2:XT|3:XZ|4:XZ PLUS*|5:XTA AMT|6:XZA AMT");
			Tiago s=new Tiago("XE","1047cc","Manual",5,27.28);
			Tiago s1=new Tiago("XT","1047cc","Manual",5,27.28);
			Tiago s2=new Tiago("XZ","1047cc","Automatic",5,27.28);
			Tiago s3=new Tiago("XZ PLUS ","1047cc","Manual",5,27.28);
			Tiago s4=new Tiago("XTA AMT","1047cc","Automatic",5,27.28);
			Tiago s5=new Tiago("XZA AMT","1047cc","Automatic",5,27.28);
			
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
			case 6:System.out.println("Specifications:"  + "Varient:"+ s5.varient  + "Engine:" + s5.engine + "Transmission:" + s5.transmission + "Seating Capacity:" + s5.capacity +"Added features:"+"Fog Lights-Front");
			System.out.println("For more details please contact to showroom");
				s5.pay5D();
				break;
			
				
				default:
				System.out.println("Please enter valid option");
						
			}
	   }
}