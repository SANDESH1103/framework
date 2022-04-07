package Fourwheeler;

import java.util.Scanner;

public class Mahindra implements Petrol,Diesel, Electric{
	public void petrolM() {
		System.out.println("Please select One");
		  System.out.println("1:Hatchback|2.SUV");
		  Scanner sc=new Scanner(System.in);
		  int a = sc.nextInt();
		  Mahindra m=new Mahindra();
		 
		  
		  switch(a)
		  {
		  case 1:m.hat();
			  break;
		  
		  case 2:m.su();
		  break;
			  default:
				  System.out.println("Please select valid option");
		  }
	}
	       public void hat() {
	    	   System.out.println("Please select One");
	    		  System.out.println("1:KUV 100");
	    		  Scanner sc=new Scanner(System.in);
	    		  int a = sc.nextInt();
	    		  Kuv100 s=new Kuv100();
	    		  
	    		  switch(a)
	    		  {
	    		  case 1:s.vari();
	    			  break;
	 		     
	    			  default:
	    				  System.out.println("Please select valid option");
	    		  }
	       }
//	       public void sy() {
//	    	   System.out.println("Please select One");
//	    		  System.out.println("1:Dzire|2:Ciaz");
//	    		  Scanner sc=new Scanner(System.in);
//	    		  int a = sc.nextInt();
//	    		  SwiftDzire s=new SwiftDzire();
//	    		  Ciaz c=new Ciaz();
//	    		  
//	    		  
//	    		  switch(a)
//	    		  {
//	    		  case 1:s.vari();
//	    			  break;
//	   		      case 2:c.vari();
//	    		  break;
//	    		  case 3:h.petrolH();
//	    		  break;
//	    		  case 4:m.petrolM();
//	    		  break;
//	    		  case 5:k.petrolK();
//	    		  break;
//	    		  case 6:to.petrolTo();
//	    		  break;
//	    		  case 7:mg.petrolMg();
//	    		  break;

//	    			  default:
//	    				  System.out.println("Please select valid option");
//	    		  }
//	       }
	      public void su() {
	    	   System.out.println("Please select One");
	  		  System.out.println("1:XUV300|2:XUV700|3:THAR");
			  Scanner sc=new Scanner(System.in);
	  		  int a = sc.nextInt();
	  		  Xuv300 x=new Xuv300();
	  		  Xuv700 v=new Xuv700();
	  		  
	  		  Thar t=new Thar();
	  		    switch(a)
	  		  {
	    	  case 1:x.vari();
	    	  break;  
	  		  case 2:v.vari();
	   		  break;
    		  case 3:t.vari();
    		  break;
    		  
//	    		  case 5:k.petrolK();
//	    		  break;
//	    		  case 6:to.petrolTo();
//	    		  break;
//	    		  case 7:mg.petrolMg();
//	    		  break;

	    			  default:
	    				  System.out.println("Please select valid option");
	    		  }
	    		  
	      }
	      public void dieselM() {
	  		System.out.println("Please select One");
	  		  System.out.println("1:Hatchback|2.SUV");
	  		  Scanner sc=new Scanner(System.in);
	  		  int a = sc.nextInt();
	  		  Mahindra m=new Mahindra();
	  		 
	  		  
	  		  switch(a)
	  		  {
	  		  case 1:m.hat1();
	  			  break;
	  		  
	  		  case 2:m.su1();
	  		  break;
	  			  default:
	  				  System.out.println("Please select valid option");
	  		  }
	  	}
	  	       public void hat1() {
	  	    	   System.out.println("Please select One");
	  	    		  System.out.println("1:KUV 100");
	  	    		  Scanner sc=new Scanner(System.in);
	  	    		  int a = sc.nextInt();
	  	    		  Kuv100 s=new Kuv100();
	  	    		  
	  	    		  switch(a)
	  	    		  {
	  	    		  case 1:s.vari();
	  	    			  break;
	  	 		     
	  	    			  default:
	  	    				  System.out.println("Please select valid option");
	  	    		  }
	  	       }
//	  	       public void sy() {
//	  	    	   System.out.println("Please select One");
//	  	    		  System.out.println("1:Dzire|2:Ciaz");
//	  	    		  Scanner sc=new Scanner(System.in);
//	  	    		  int a = sc.nextInt();
//	  	    		  SwiftDzire s=new SwiftDzire();
//	  	    		  Ciaz c=new Ciaz();
//	  	    		  
//	  	    		  
//	  	    		  switch(a)
//	  	    		  {
//	  	    		  case 1:s.vari();
//	  	    			  break;
//	  	   		      case 2:c.vari();
//	  	    		  break;
//	  	    		  case 3:h.petrolH();
//	  	    		  break;
//	  	    		  case 4:m.petrolM();
//	  	    		  break;
//	  	    		  case 5:k.petrolK();
//	  	    		  break;
//	  	    		  case 6:to.petrolTo();
//	  	    		  break;
//	  	    		  case 7:mg.petrolMg();
//	  	    		  break;

//	  	    			  default:
//	  	    				  System.out.println("Please select valid option");
//	  	    		  }
//	  	       }
	  	      public void su1() {
	  	    	   System.out.println("Please select One");
	  	  		  System.out.println("1:XUV300|2:XUV700|3:THAR|4:SCORPIO");
	  			  Scanner sc=new Scanner(System.in);
	  	  		  int a = sc.nextInt();
	  	  		  Xuv300 x=new Xuv300();
	  	  		  Xuv700 v=new Xuv700();
	  	  		  Thar t=new Thar();
	  	  		  Scorpio s=new Scorpio();
	  	  		    switch(a)
	  	  		  {
	  	    	  case 1:x.vari1();
	  	    	  break;  
	  	  		  case 2:v.vari1();
	  	   		  break;
	      		  case 3:t.vari1();
	      		  break;
	      		  case 4:s.vari1();
	      		  break;
//	  	    		  case 5:k.petrolK();
//	  	    		  break;
//	  	    		  case 6:to.petrolTo();
//	  	    		  break;
//	  	    		  case 7:mg.petrolMg();
//	  	    		  break;

	  	    			  default:
	  	    				  System.out.println("Please select valid option");
	  	    		  }
	  	    	}
	  	      
	  	    //For LMV PETROL/CNG COMMERTIAL VARIANT 
	 	      public void petrolCm() {
		    	   System.out.println("Please select One");
		    	   System.out.println("1:JEETO");
		    		 
		    		  Scanner sc=new Scanner(System.in);
		    		  int a = sc.nextInt();
		    		 Jeeto j= new Jeeto();
		    		  switch(a)
		    		  {
		    		  case 1:j.vari1();
		    		  break;
		   		      
//		    		  case 3:h.petrolH();
//		    		  break;
//		    		  case 4:m.petrolM();
//		    		  break;
//		    		  case 5:k.petrolK();
//		    		  break;
//		    		  case 6:to.petrolTo();
//		    		  break;
//		    		  case 7:mg.petrolMg();
//		    		  break;

		    			  default:
		    				  System.out.println("Please select valid option");
		    		  }
		       }
	 	      
	 	   //For LMV DIESEL COMMERTIAL VARIANT 
	 	      public void dieselCm() {
		    	   System.out.println("Please select One");
		    	   System.out.println("1:JEETO|2:SUPRO|3:BOLERO PICK-UP");
		    		 
		    		  Scanner sc=new Scanner(System.in);
		    		  int a = sc.nextInt();
		    		 Jeeto j= new Jeeto();
		    		 Supro s=new Supro();
		    		 Bolero b=new Bolero();
		    		  switch(a)
		    		  {
		    		  case 1:j.vari1();
		    		  break;
		   		      
		    		  case 2:s.vari();
		    		  break;
		    		  case 3:b.vari();
		    		  break;
//		    		  case 5:k.petrolK();
//		    		  break;
//		    		  case 6:to.petrolTo();
//		    		  break;
//		    		  case 7:mg.petrolMg();
//		    		  break;

		    			  default:
		    				  System.out.println("Please select valid option");
		    		  }
		       }

	  	      
}
