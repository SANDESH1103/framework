package Fourwheeler;

import java.util.Scanner;

public class Hyundai implements Petrol,Diesel, Electric{
	public void petrolH() {
		System.out.println("Please select One");
		  System.out.println("1:Hatchback|2:Sydan|3.SUV");
		  Scanner sc=new Scanner(System.in);
		  int a = sc.nextInt();
		  Hyundai h=new Hyundai();
		 
		  
		  switch(a)
		  {
		  case 1:h.hat();
			  break;
		  case 2:h.sy();
		  break;
		  case 3:h.su();
		  break;
			  default:
				  System.out.println("Please select valid option");
		  }
	}
	       public void hat() {
	    	   System.out.println("Please select One");
	    		  System.out.println("1:Grand i20|2:Santro|3:Grand i10 Nios");
	    		  Scanner sc=new Scanner(System.in);
	    		  int a = sc.nextInt();
	    		  Grandi20 g=new Grandi20();
	    		  Santro s=new Santro();
	    		  Grandi10 gr=new Grandi10();
	    		 
	    		  switch(a)
	    		  {
	    		  case 1:g.vari();
	    			  break;
	 		      case 2:s.vari();
	    		  break;
	    		  case 3:gr.vari();
	    		  break;
	  		     
//	    		  break;
//	    		  case 7:mg.petrolMg();
//	    		  break;

	    			  default:
	    				  System.out.println("Please select valid option");
	    		  }
	       }
	       public void sy() {
	    	   System.out.println("Please select One");
	    		  System.out.println("1:Verna|2:Aura|3:Elantra|4:Xcent Prime");
	    		  Scanner sc=new Scanner(System.in);
	    		  int a = sc.nextInt();
	    		  Verna v=new Verna();
	    		  Aura c=new Aura();
	    		  Elantra e=new Elantra();
	    		  Xcent x=new Xcent();
	    		  
	    		  switch(a)
	    		  {
	    		  case 1:v.vari();
	    			  break;
	   		      case 2:c.vari();
	    		  break;
	    		  case 3:e.vari();
	    		  break;
	    		  case 4:x.vari();
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
	      public void su() {
	    	   System.out.println("Please select One");
	  		  System.out.println("1:CRETA|2:VENUE|3:ALCAZAR|4:TUCSON");
			  Scanner sc=new Scanner(System.in);
	  		  int a = sc.nextInt();
	  		  Creta c=new Creta();
	  		  Venue v=new Venue();
	  		  Alcazar al=new Alcazar();
	  		  Tucson t=new Tucson();
	  		    switch(a)
	  		  {
	    		  case 1:c.vari();
	    			  break;
	  		  case 2:v.vari();
	   		  break;
    		  case 3:al.vari();
    		  break;
  		      case 4:t.vari();
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
	      
	      //For Diesel variants
	      public void dieselH() {
	  		System.out.println("Please select One");
	  		  System.out.println("1:Hatchback|2:Sydan|3.SUV");
	  		  Scanner sc=new Scanner(System.in);
	  		  int a = sc.nextInt();
	  		  Hyundai h=new Hyundai();
	  		 
	  		  
	  		  switch(a)
	  		  {
	  		  case 1:h.hat1();
	  			  break;
	  		  case 2:h.sy1();
	  		  break;
	  		  case 3:h.su1();
	  		  break;
	  			  default:
	  				  System.out.println("Please select valid option");
	  		  }
	  	}
	  	       public void hat1() {
	  	    	   System.out.println("Please select One");
	  	    		  System.out.println("1:Grand i20|2:Santro|3:Grand i10 Nios");
	  	    		  Scanner sc=new Scanner(System.in);
	  	    		  int a = sc.nextInt();
	  	    		  Grandi20 g=new Grandi20();
	  	    		  Santro s=new Santro();
	  	    		  Grandi10 gr=new Grandi10();
	  	    		 
	  	    		  switch(a)
	  	    		  {
	  	    		  case 1:g.vari();
	  	    			  break;
	  	 		      case 2:s.vari();
	  	    		  break;
	  	    		  case 3:gr.vari();
	  	    		  break;
	  	  		     
//	  	    		  break;
//	  	    		  case 7:mg.petrolMg();
//	  	    		  break;

	  	    			  default:
	  	    				  System.out.println("Please select valid option");
	  	    		  }
	  	       }
	  	       public void sy1() {
	  	    	   System.out.println("Please select One");
	  	    		  System.out.println("1:Verna|2:Aura|3:Elantra");
	  	    		  Scanner sc=new Scanner(System.in);
	  	    		  int a = sc.nextInt();
	  	    		  Verna v=new Verna();
	  	    		  Aura c=new Aura();
	  	    		  Elantra e=new Elantra();
	  	    		  Xcent x=new Xcent();
	  	    		  
	  	    		  switch(a)
	  	    		  {
	  	    		  case 1:v.vari1();
	  	    			  break;
	  	   		      case 2:c.vari1();
	  	    		  break;
	  	    		  case 3:e.vari1();
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
	  	      public void su1() {
	  	    	   System.out.println("Please select One");
	  	  		  System.out.println("1:CRETA|2:VENUE|3:ALCAZAR|4:TUCSON");
	  			  Scanner sc=new Scanner(System.in);
	  	  		  int a = sc.nextInt();
	  	  		  Creta c=new Creta();
	  	  		  Venue v=new Venue();
	  	  		  Alcazar al=new Alcazar();
	  	  		  Tucson t=new Tucson();
	  	  		    switch(a)
	  	  		  {
	  	    		  case 1:c.vari1();
	  	    			  break;
	  	  		  case 2:v.vari1();
	  	   		  break;
	      		  case 3:al.vari1();
	      		  break;
	    		  case 4:t.vari1();
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
	  	      
	  	// FOR ELECTRIC VARIANTS
	  	      
	  	   
		      public void electricH() {
		  		System.out.println("Please select One");
		  		  System.out.println("1.SUV");
		  		  Scanner sc=new Scanner(System.in);
		  		  int a = sc.nextInt();
		  		  Hyundai h=new Hyundai();
		  		 
		  		  
		  		  switch(a)
		  		  {
		  		  case 1:h.su2();
		  			  break;
		  		 default:
		  			 System.out.println("please select valid option");
		  		  }
		  		  
		      }
		  	      public void su2() {
		  	    	   System.out.println("Please select One");
		  	  		  System.out.println("1:KONA");
		  			  Scanner sc=new Scanner(System.in);
		  	  		  int a = sc.nextInt();
		  	  		  Kona k=new Kona();
		  	  		 
		  	  		    switch(a)
		  	  		  {
		  	    		  case 1:k.vari1E();
		  	    			  break;
		  	  		  
//		  	    		  case 5:k.petrolK();
//		  	    		  break;
//		  	    		  case 6:to.petrolTo();
//		  	    		  break;
//		  	    		  case 7:mg.petrolMg();
//		  	    		  break;

		  	    			  default:
		  	    				  System.out.println("Please select valid option");
		  	    		  }
		  	    		  
		  	      }
}
