package Fourwheeler;

import java.util.Scanner;

public class Xuv300 extends Mahindra{
	String varient;
	String engine;
	String transmission;
	int capacity;
	double mileage;
	// no argument constructor
	
	Xuv300(){
		
	}
	Xuv300(String varient,String engine,String transmission,int capacity,double mileage){
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
		   case 1: System.out.println("your amount is 7.95L for payment press 1 |To exit press 2");
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
		   case 2:System.out.println("your amount is 8.23L for payment press 1 |To exit press 2");
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
		  		   case 2:System.out.println("your amount is 10.21L for payment press 1 |To exit press 2");
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
		 		  		   case 1: System.out.println("your amount is 10.57L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 10.95L for payment press 1 |To exit press 2");
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
		 		  		   case 1: System.out.println("your amount is 12.48L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 12.75L for payment press 1 |To exit press 2");
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
		System.out.println("1:W4,2:W6 SUNROOF|3:W4 SUNROOF AMT|4:W8");
		Xuv300 s=new Xuv300("W4","1197cc","Manual",5,17);
		Xuv300 s1=new Xuv300("W6 SUNROOF","1197cc","Manual",5,17);
		Xuv300 s2=new Xuv300("W4 SUNROOF AMT","1197cc","Automatic",5,17);
		Xuv300 s3=new Xuv300("WB ","1197cc","Manual",5,17);
		

		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		switch(i) {
		case 1:
			System.out.println("Specifications:"  + "Varient:"+ s.varient + "\n"  + "Engine:" + s.engine + "\n"  + "Transmission:" + s.transmission + "\n"  + "Seating Capacity:" + s.capacity + "\n"  + "Added features:"+"Power windows"+"Power Steering"+"Air conditioner");
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
		
				default:
			System.out.println("Please enter valid option");
					
		}
      }
	
	//For Diedel Variants
	
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
		   case 1: System.out.println("your amount is 9.09L for payment press 1 |To exit press 2");
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
		   case 2:System.out.println("your amount is 9.98L for payment press 1 |To exit press 2");
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
		  		   case 1: System.out.println("your amount is 10.63L for payment press 1 |To exit press 2");
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
		  		   case 2:System.out.println("your amount is 11.23L for payment press 1 |To exit press 2");
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
		 		  		   case 1: System.out.println("your amount is 11.28L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 12.21L for payment press 1 |To exit press 2");
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
		 		  		   case 1: System.out.println("your amount is 12.69L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 13.54L for payment press 1 |To exit press 2");
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
		System.out.println("1:W4,2:W6 SUNROOF|3:W4 SUNROOF AMT|4:W8");
		Xuv300 s=new Xuv300("W4","1497cc","Manual",5,20);
		Xuv300 s1=new Xuv300("W6 SUNROOF","1497cc","Manual",5,20);
		Xuv300 s2=new Xuv300("W4 SUNROOF AMT","1497cc","Automatic",5,20);
		Xuv300 s3=new Xuv300("WB ","1497cc","Manual",5,20);
		

		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		switch(i) {
		case 1:
			System.out.println("Specifications:"  + "Varient:"+ s.varient + "\n"  + "Engine:" + s.engine + "\n"  + "Transmission:" + s.transmission + "\n"  + "Seating Capacity:" + s.capacity + "\n"  + "Added features:"+"Power windows"+"Power Steering"+"Air conditioner");
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
		
				default:
			System.out.println("Please enter valid option");
					
		}
      }


}
