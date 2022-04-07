package Fourwheeler;

import java.util.Scanner;

public class Glanza extends Toyota{
	String varient;
	String engine;
	String transmission;
	int capacity;
	double mileage;
	// no argument constructor
	
   Glanza(){
		
	}
	Glanza(String varient,String engine,String transmission,int capacity,double mileage){
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
		   case 1: System.out.println("your amount is 7.49L for payment press 1 |To exit press 2");
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
		   case 2:System.out.println("your amount is 8.02L for payment press 1 |To exit press 2");
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
		  		   case 1: System.out.println("your amount is 8.25L for payment press 1 |To exit press 2");
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
		  		   case 2:System.out.println("your amount is 8.98L for payment press 1 |To exit press 2");
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
		 		  		   case 1: System.out.println("your amount is 8.14L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 8.98L for payment press 1 |To exit press 2");
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
		 		  		   case 1: System.out.println("your amount is 8.69L for payment press 1 |To exit press 2");
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
		 		  		   case 2:System.out.println("your amount is 7.12L for payment press 1 |To exit press 2");
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
	 		  		   case 1: System.out.println("your amount is 9.45L for payment press 1 |To exit press 2");
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
	 		  		   case 2:System.out.println("your amount is 10.11L for payment press 1 |To exit press 2");
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
	System.out.println("1:G|2:V|3:G SMART HYBRID|4:G CVT|5:V CVT");
	Glanza s=new Glanza("G","1197cc","Manual",5,19.56);
	Glanza s1=new Glanza("V","1197cc","Manual",5,19.56);
	Glanza s2=new Glanza("G SMART HYBRID","1197cc","Automatic",5,19.56);
	Glanza s3=new Glanza("G CVT ","1197cc","Manual",5,19.56);
	Glanza s4=new Glanza("V CVT","1197cc","Automatic",5,19.56);
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
}