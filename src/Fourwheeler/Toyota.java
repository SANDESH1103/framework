package Fourwheeler;

import java.util.Scanner;

public class Toyota implements Petrol,Diesel, Electric{
	public void petrolTo() {
		System.out.println("Please select One");
		  System.out.println("1:Hatchback|2:Sydan|3.SUV");
		  Scanner sc=new Scanner(System.in);
		  int a = sc.nextInt();
		  Toyota t=new Toyota();
		 
		  
		  switch(a)
		  {
		  case 1:t.hat();
			  break;
		  case 2:t.sy();
		  break;
		  case 3:t.su();
		  break;
			  default:
				  System.out.println("Please select valid option");
		  }
	}
	       public void hat() {
	    	   System.out.println("Please select One");
	    		  System.out.println("1:GLANZA");
	    		  Scanner sc=new Scanner(System.in);
	    		  int a = sc.nextInt();
	    		  Glanza s=new Glanza();
	    		  
	    		  switch(a)
	    		  {
	    		  case 1:s.vari();
	    			  break;
	 		      
	    			  default:
	    				  System.out.println("Please select valid option");
	    		  }
	       }
	       public void sy() {
	    	   System.out.println("Please select One");
	    		  System.out.println("1:Camry");
	    		  Scanner sc=new Scanner(System.in);
	    		  int a = sc.nextInt();
	    		  Camry s=new Camry();
	    		  
	    		  
	    		  
	    		  switch(a)
	    		  {
	    		  case 1:s.vari();
	    			  break;
	   		      

	    			  default:
	    				  System.out.println("Please select valid option");
	    		  }
	       }
	      public void su() {
	    	   System.out.println("Please select One");
	  		  System.out.println("1:FORTUNER|2:URBAN CRUISER|3:INNOVA CRYSTA");
			  Scanner sc=new Scanner(System.in);
	  		  int a = sc.nextInt();
	  		  Fortuner s=new Fortuner();
	  		  Urban v=new Urban();
	  		  Innova n=new Innova();
	  		    switch(a)
	  		  {
	    		  case 1:s.vari();
	    			  break;
	  		      case 2:v.vari();
	   		       break;
	    		  case 3:n.vari();
	    		  break;
//	    		  case 4:m.petrolM();
//	    		  break;
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
	      
	      // For Diesel Variants
	      
	      public void dieselTo() {
	  		System.out.println("Please select One");
	  		  System.out.println("1.SUV");
	  		  Scanner sc=new Scanner(System.in);
	  		  int a = sc.nextInt();
	  		  Toyota t=new Toyota();
	  		 
	  		  
	  		  switch(a)
	  		  {
	  		  case 1:t.su1();
	  			  break;
	  		
	  			  default:
	  				  System.out.println("Please select valid option");
	  		  }
	  	}
	  	      
	  	       
	  	      public void su1() {
	  	    	   System.out.println("Please select One");
	  	  		  System.out.println("1:FORTUNER|2:INNOVA CRYSTA");
	  			  Scanner sc=new Scanner(System.in);
	  	  		  int a = sc.nextInt();
	  	  		  Fortuner s=new Fortuner();
	  	  		 Innova n=new Innova();
	  	  		    switch(a)
	  	  		  {
	  	    		  case 1:s.vari1();
	  	    			  break;
	  	  		      
	  	    		  case 2:n.vari1();
	  	    		  break;
//	  	    		  case 4:m.petrolM();
//	  	    		  break;
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
}
