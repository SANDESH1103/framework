package Fourwheeler;

import java.util.Scanner;

public class Scorpio extends Mahindra {
	String varient;
	String engine;
	String transmission;
	int capacity;
	double mileage;
	// no argument constructor
	
	Scorpio(){
		
	}
	Scorpio(String varient,String engine,String transmission,int capacity,double mileage){
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
		   case 1: System.out.println("your amount is 12.49L for payment press 1 |To exit press 2");
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
		   case 2:System.out.println("your amount is 13.11L for payment press 1 |To exit press 2");
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
		  		   case 1: System.out.println("your amount is 12.49L for payment press 1 |To exit press 2");
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
		  		   case 2:System.out.println("your amount is 13.11L for payment press 1 |To exit press 2");
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
		 		  		   case 1: System.out.println("your amount is 13.07L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 13.89L for payment press 1 |To exit press 2");
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
		 		  		   case 1: System.out.println("your amount is 15.36L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 15.95L for payment press 1 |To exit press 2");
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
	 		  		   case 1: System.out.println("your amount is 15.87L for payment press 1 |To exit press 2");
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
	 		  		   case 2:System.out.println("your amount is 16.65L for payment press 1 |To exit press 2");
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
	 		  		   case 1: System.out.println("your amount is 17.14L for payment press 1 |To exit press 2");
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
	 		  		   case 2:System.out.println("your amount is 17.68L for payment press 1 |To exit press 2");
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
		System.out.println("1:S3 PLUS|2:S3 PLUS 9 SEATER|3:S5|4:S7|5:S9|6:S11*");
		Scorpio s=new Scorpio("S3 PLUS","2179cc","Manual",7,16.75);
		Scorpio s1=new Scorpio("S3 PLUS 9 SEATER","2179cc","Manual",9,16.75);
		Scorpio s2=new Scorpio("S5","2179cc","Manual",7,16.75);
		Scorpio s3=new Scorpio("S7 ","2179cc","Manual",7,16.75);
		Scorpio s4=new Scorpio("S9","2179cc","Manual",7,16.75);
		Scorpio s5=new Scorpio("S11","2179cc","Manual",7,16.75);

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
				default:
			System.out.println("Please enter valid option");
					
		}
      }

}
