package Fourwheeler;

import java.util.Scanner;

public class Hecter extends Mg {
	String varient;
	String engine;
	String transmission;
	int capacity;
	double mileage;
	// no argument constructor
	
	Hecter(){
		
	}
	Hecter(String varient,String engine,String transmission,int capacity,double mileage){
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
		   case 1: System.out.println("Your amount is 13.49L for payment press 1 |To exit press 2");
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
		   case 2:System.out.println("your amount is 14.98L for payment press 1 |To exit press 2");
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
		  		   case 1: System.out.println("your amount is 14.51L for payment press 1 |To exit press 2");
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
		  		   case 2:System.out.println("your amount is 15.02L for payment press 1 |To exit press 2");
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
		 		  		   case 1: System.out.println("your amount is 15.71L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 16.12L for payment press 1 |To exit press 2");
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
		 		  		   case 1: System.out.println("your amount is 17.07L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 17.91L for payment press 1 |To exit press 2");
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
	 		  		   case 1: System.out.println("your amount is 17.07L for payment press 1 |To exit press 2");
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
	 		  		   case 2:System.out.println("your amount is 17.91L for payment press 1 |To exit press 2");
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
	 		  		   case 1: System.out.println("your amount is 17.77L for payment press 1 |To exit press 2");
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
	 		  		   case 2:System.out.println("your amount is 18.21L for payment press 1 |To exit press 2");
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
		  		// payment method for variant 7	
		  		  	
		  		  	
		  		  public void pay6() {
	 		  		   System.out.println("Otherwise we have new year offer for online payment");
	 		  		   System.out.println("If you ready please select one option");
	 		  		   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
	 		  		   Scanner sc=new Scanner(System.in);
	 		  		   //Vehicles v= new Swift();
	 		  		   int a=sc.nextInt();
	 		  		  		   switch(a)
	 		  		   {
	 		  		   case 1: System.out.println("your amount is 18.77L for payment press 1 |To exit press 2");
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
	 		  		   case 2:System.out.println("your amount is 19.12L for payment press 1 |To exit press 2");
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
		System.out.println("1:STYLE MT|2:SHINE|3:HYBRID SMART|4:HYBRID SMART|5:SHINE CVT|6:SMART CVT|7:SHARP CVT*");
		Hecter s=new Hecter("STYLE MT","1451cc","Manual",5,17.09);
		Hecter s1=new Hecter("SHINE","1451cc","Manual",5,17.09);
		Hecter s2=new Hecter("HYBRID SMART","1451cc","Automatic",5,17.09);
		Hecter s3=new Hecter("HYBRID SMART","1451cc","Manual",5,17.09);
		Hecter s4=new Hecter("SHINE CVT","1451cc","Automatic",5,17.09);
		Hecter s5=new Hecter("SMART CVT","1451cc","Automatic",5,17.09);
		Hecter s6=new Hecter("SHARP CVT","1451cc","Automatic",5,17.09);
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		switch(i) {
		case 1:
			System.out.println("Specifications:"  + "Varient:"+ s.varient  + "Engine:" + s.engine + "Transmission:" + s.transmission + "Seating Capacity:" + s.capacity +"Added features:"+"Power windows"+"Power Steering"+"Air conditioner");
			System.out.println("For more details please contact to showroom");
			s.pay();
		   break;
		case 2:
			System.out.println("Specifications:"  + "Varient:"+ s1.varient  + "Engine:" + s1.engine + "Transmission:" + s1.transmission + "Seating Capacity:" + s1.capacity +"Added features:"+"AntiLock Breaking system"+"Wheel covers");
			System.out.println("For more details please contact to showroom");
			s1.pay1();
			break;
		case 3:System.out.println("Specifications:"  + "Varient:"+ s2.varient  + "Engine:" + s2.engine + "Transmission:" + s2.transmission + "Seating Capacity:" + s2.capacity +"Added features:"+"Automatic Transmission");
		System.out.println("For more details please contact to showroom");
			s2.pay2();
			break;
		case 4:System.out.println("Specifications:"  + "Varient:"+ s3.varient  + "Engine:" + s3.engine + "Transmission:" + s3.transmission + "Seating Capacity:" + s3.capacity +"Added features:"+"Multi-funcational Steering wheel"+" touchscreen"+ "Fog Lights-Front"+"Passanger Airbags");
		System.out.println("For more details please contact to showroom");
			s3.pay3();
			break;
		case 5:System.out.println("Specifications:"  + "Varient:"+ s4.varient  + "Engine:" + s4.engine + "Transmission:" + s4.transmission + "Seating Capacity:" + s4.capacity +"Added features:"+"Automatic Transmission");
		System.out.println("For more details please contact to showroom");
			s4.pay4();
			break;
		case 6:System.out.println("Specifications:"  + "Varient:"+ s5.varient  + "Engine:" + s5.engine + "Transmission:" + s5.transmission + "Seating Capacity:" + s5.capacity +"Added features:"+"Automatic Transmission");
		System.out.println("For more details please contact to showroom");
			s5.pay5();
			break;
		case 7:System.out.println("Specifications:"  + "Varient:"+ s6.varient  + "Engine:" + s6.engine + "Transmission:" + s6.transmission + "Seating Capacity:" + s6.capacity +"Added features:"+"Automatic Transmission");
		System.out.println("For more details please contact to showroom");
			s6.pay6();
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
			   case 1: System.out.println("Your amount is 13.49L for payment press 1 |To exit press 2");
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
			   case 2:System.out.println("your amount is 14.98L for payment press 1 |To exit press 2");
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
			  		   case 1: System.out.println("your amount is 14.51L for payment press 1 |To exit press 2");
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
			  		   case 2:System.out.println("your amount is 15.02L for payment press 1 |To exit press 2");
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
			 		  		   case 1: System.out.println("your amount is 15.71L for payment press 1 |To exit press 2");
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
			 		  		   case 2:System.out.println("your amount is 16.12L for payment press 1 |To exit press 2");
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
			 		  		   case 1: System.out.println("your amount is 17.07L for payment press 1 |To exit press 2");
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
			 		  		   case 2:System.out.println("your amount is 17.91L for payment press 1 |To exit press 2");
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
		 		  		   case 1: System.out.println("your amount is 17.07L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 17.91L for payment press 1 |To exit press 2");
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
		 		  		   case 1: System.out.println("your amount is 17.77L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 18.21L for payment press 1 |To exit press 2");
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
			  		// payment method for variant 7	
			  		  	
			  		  	
			  		  public void pay6D() {
		 		  		   System.out.println("Otherwise we have new year offer for online payment");
		 		  		   System.out.println("If you ready please select one option");
		 		  		   System.out.println("1:Credit Card (30% off)|2:Internet Banking (10% off)");
		 		  		   Scanner sc=new Scanner(System.in);
		 		  		   //Vehicles v= new Swift();
		 		  		   int a=sc.nextInt();
		 		  		  		   switch(a)
		 		  		   {
		 		  		   case 1: System.out.println("your amount is 18.77L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 19.12L for payment press 1 |To exit press 2");
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
			System.out.println("1:STYLE MT|2:SHINE|3:HYBRID SMART|4:HYBRID SMART|5:SHINE CVT|6:SMART CVT|7:SHARP CVT*");
			Hecter s=new Hecter("STYLE MT","1451cc","Manual",5,17.09);
			Hecter s1=new Hecter("SHINE","1451cc","Manual",5,17.09);
			Hecter s2=new Hecter("HYBRID SMART","1451cc","Automatic",5,17.09);
			Hecter s3=new Hecter("HYBRID SMART","1451cc","Manual",5,17.09);
			Hecter s4=new Hecter("SHINE CVT","1451cc","Automatic",5,17.09);
			Hecter s5=new Hecter("SMART CVT","1451cc","Automatic",5,17.09);
			Hecter s6=new Hecter("SHARP CVT","1451cc","Automatic",5,17.09);
			Scanner sc=new Scanner(System.in);
			int i=sc.nextInt();
			switch(i) {
			case 1:
				System.out.println("Specifications:"  + "Varient:"+ s.varient  + "Engine:" + s.engine + "Transmission:" + s.transmission + "Seating Capacity:" + s.capacity +"Added features:"+"Power windows"+"Power Steering"+"Air conditioner");
				System.out.println("For more details please contact to showroom");
				s.payD();
			   break;
			case 2:
				System.out.println("Specifications:"  + "Varient:"+ s1.varient  + "Engine:" + s1.engine + "Transmission:" + s1.transmission + "Seating Capacity:" + s1.capacity +"Added features:"+"AntiLock Breaking system"+"Wheel covers");
				System.out.println("For more details please contact to showroom");
				s1.pay1D();
				break;
			case 3:System.out.println("Specifications:"  + "Varient:"+ s2.varient  + "Engine:" + s2.engine + "Transmission:" + s2.transmission + "Seating Capacity:" + s2.capacity +"Added features:"+"Automatic Transmission");
			System.out.println("For more details please contact to showroom");
				s2.pay2D();
				break;
			case 4:System.out.println("Specifications:"  + "Varient:"+ s3.varient  + "Engine:" + s3.engine + "Transmission:" + s3.transmission + "Seating Capacity:" + s3.capacity +"Added features:"+"Multi-funcational Steering wheel"+" touchscreen"+ "Fog Lights-Front"+"Passanger Airbags");
			System.out.println("For more details please contact to showroom");
				s3.pay3D();
				break;
			case 5:System.out.println("Specifications:"  + "Varient:"+ s4.varient  + "Engine:" + s4.engine + "Transmission:" + s4.transmission + "Seating Capacity:" + s4.capacity +"Added features:"+"Automatic Transmission");
			System.out.println("For more details please contact to showroom");
				s4.pay4D();
				break;
			case 6:System.out.println("Specifications:"  + "Varient:"+ s5.varient  + "Engine:" + s5.engine + "Transmission:" + s5.transmission + "Seating Capacity:" + s5.capacity +"Added features:"+"Automatic Transmission");
			System.out.println("For more details please contact to showroom");
				s5.pay5D();
				break;
			case 7:System.out.println("Specifications:"  + "Varient:"+ s6.varient  + "Engine:" + s6.engine + "Transmission:" + s6.transmission + "Seating Capacity:" + s6.capacity +"Added features:"+"Automatic Transmission");
			System.out.println("For more details please contact to showroom");
				s6.pay6D();
				break;
					default:
				System.out.println("Please enter valid option");
						
			}
	      }
	
	
	
}
