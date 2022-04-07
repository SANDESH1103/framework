package Fourwheeler;

import java.util.Scanner;

public class Alcazar extends Hyundai {
	String varient;
	String engine;
	String transmission;
	int capacity;
	double mileage;
	// no argument constructor
	
	Alcazar(){
		
	}
	Alcazar(String varient,String engine,String transmission,int capacity,double mileage){
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
		   case 1: System.out.println("your amount is 16.30L for payment press 1 |To exit press 2");
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
		   case 2:System.out.println("your amount is 16.98L for payment press 1 |To exit press 2");
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
		  		   case 1: System.out.println("your amount is 18.22L for payment press 1 |To exit press 2");
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
		  		   case 2:System.out.println("your amount is 18.98L for payment press 1 |To exit press 2");
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
		 		  		   case 1: System.out.println("your amount is 18.70L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 19.40L for payment press 1 |To exit press 2");
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
		 		  		   case 1: System.out.println("your amount is 18.70L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 19.02L for payment press 1 |To exit press 2");
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
		 		  		   case 1: System.out.println("your amount is 19.84L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 20.21L for payment press 1 |To exit press 2");
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
		System.out.println("1:PRESTIGE 7SEAT|2:PLATINUM |3:SIGNATURE|4:PLATINUM ATM|5:SIGNATURE AMT|");
		Alcazar s=new Alcazar("PRESTIGE 7SEAT","1999cc","Manual",7,19.20);
		Alcazar s1=new Alcazar("PLATINUM","1999cc","Manual",7,19.20);
		Alcazar s2=new Alcazar("SIGNATURE","1999cc","Automatic",5,19.20);
		Alcazar s3=new Alcazar("PLATINUM ATM","1999cc","Automatic",5,19.20);
		Alcazar s4=new Alcazar("SIGNATURE AMT","1999cc","Automatic",5,19.20);
		
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
		case 5:System.out.println("Specifications:"  + "Varient:"+ s4.varient  + "Engine:" + s4.engine + "Transmission:" + s4.transmission + "Seating Capacity:" + s4.capacity +"Added features:"+"Power window front"+"Wheel covers");
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
			   case 1: System.out.println("your amount is 16.53L for payment press 1 |To exit press 2");
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
			   case 2:System.out.println("your amount is 17.04L for payment press 1 |To exit press 2");
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
			  		   case 1: System.out.println("your amount is 16.68L for payment press 1 |To exit press 2");
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
			  		   case 2:System.out.println("your amount is 17.02L for payment press 1 |To exit press 2");
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
			 		  		   case 1: System.out.println("your amount is 17.84L for payment press 1 |To exit press 2");
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
			 		  		   case 2:System.out.println("your amount is 18.30L for payment press 1 |To exit press 2");
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
			 		  		   case 1: System.out.println("your amount is 18.50L for payment press 1 |To exit press 2");
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
			 		  		   case 2:System.out.println("your amount is 19.10L for payment press 1 |To exit press 2");
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
			 		  		   case 1: System.out.println("your amount is 19.84L for payment press 1 |To exit press 2");
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
			 		  		   case 2:System.out.println("your amount is 20.54L for payment press 1 |To exit press 2");
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
			System.out.println("1:STD,2:LXI|3:VXI AMT");
			Alcazar s=new Alcazar("PRESTIGE 7SEAT","1493cc","Manual",7,20.40);
			Alcazar s1=new Alcazar("PLATINUM","1493cc","Manual",7,20.40);
			Alcazar s2=new Alcazar("SIGNATURE","1493cc","Automatic",5,20.40);
			Alcazar s3=new Alcazar("PLATINUM ATM","1493cc","Automatic",5,20.40);
			Alcazar s4=new Alcazar("SIGNATURE AMT","1493cc","Automatic",5,20.40);

			
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
			case 5:System.out.println("Specifications:"  + "Varient:"+ s4.varient  + "Engine:" + s4.engine + "Transmission:" + s4.transmission + "Seating Capacity:" + s4.capacity +"Added features:"+"Power window front"+"Wheel covers");
			System.out.println("For more details please contact to showroom");
				s4.pay4D();
				break;
			
			
					default:
				System.out.println("Please enter valid option");
						
			}
	}
}
