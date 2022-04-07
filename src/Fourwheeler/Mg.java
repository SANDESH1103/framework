package Fourwheeler;

import java.util.Scanner;

public class Mg implements Petrol,Diesel, Electric{
	public void petrolMg() {
		System.out.println("Please select One");
		  System.out.println("1:SUV");
		  Scanner sc=new Scanner(System.in);
		  int a = sc.nextInt();
		  Mg m=new Mg();
		 
		  
		  switch(a)
		  {
		  case 1:m.su();
			  break;
		 
			  default:
				  System.out.println("Please select valid option");
		  }
	}
	       
	      public void su() {
	    	   System.out.println("Please select One");
	  		  System.out.println("1:HECTER|2:ASTER");
			  Scanner sc=new Scanner(System.in);
	  		  int a = sc.nextInt();
	  		 Hecter h=new Hecter();
	  		 Aster as= new Aster();
	  		    switch(a)
	  		  {
	    		  case 1:h.vari();
	    			  break;
	  		    
  		        case 2:as.vari();
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
	      
	      //For Diesel Variant........
	      public void dieselMg() {
	  		System.out.println("Please select One");
	  		  System.out.println("1:SUV");
	  		  Scanner sc=new Scanner(System.in);
	  		  int a = sc.nextInt();
	  		  Mg m=new Mg();
	  		 
	  		  
	  		  switch(a)
	  		  {
	  		  case 1:m.su1();
	  			  break;
	  		 
	  			  default:
	  				  System.out.println("Please select valid option");
	  		  }
	  	}
	  	       
	  	      public void su1() {
	  	    	   System.out.println("Please select One");
	  	  		  System.out.println("1:HECTER|2:GLOSTER");
	  			  Scanner sc=new Scanner(System.in);
	  	  		  int a = sc.nextInt();
	  	  		 Hecter h=new Hecter();
	  	  		 Gloster g=new Gloster();
	  	  		    switch(a)
	  	  		  {
	  	    		  case 1:h.vari1();
	  	    			  break;
	  	    		  case 2:g.vari1();
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
	  	      
	  	  // FOR ELECTRIC VARIANTS
	  	      
	  	    public void electricM() {
	  			System.out.println("Please select One");
	  			  System.out.println("1:SUV");
	  			  Scanner sc=new Scanner(System.in);
	  			  int a = sc.nextInt();
	  			  Mg m=new Mg();
	  			 
	  			  
	  			  switch(a)
	  			  {
	  			  case 1:m.su2();
	  				  break;
	  			 
	  				  default:
	  					  System.out.println("Please select valid option");
	  			  }
	  		}
	  		       
	  		      public void su2() {
	  		    	   System.out.println("Please select One");
	  		  		  System.out.println("1:ZS");
	  				  Scanner sc=new Scanner(System.in);
	  		  		  int a = sc.nextInt();
	  		  		 
	  		  		 Zs z=new Zs();
	  		  		    switch(a)
	  		  		  {
	  		    		  case 1:z.variE();
	  		    	      break;
	  		  		    
	  	  		      default:
	  		    	     System.out.println("Please select valid option");
	  		    		  }
	  		    		  
	  		      }
}
