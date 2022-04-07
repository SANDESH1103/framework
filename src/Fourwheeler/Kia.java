package Fourwheeler;

import java.util.Scanner;

public class Kia implements Petrol,Diesel, Electric{
	public void petrolK() {
		System.out.println("Please select One");
		  System.out.println("1.SUV");
		  Scanner sc=new Scanner(System.in);
		  int a = sc.nextInt();
		  Kia k=new Kia();
		 
		  
		  switch(a)
		  {
		 
		  case 1:k.su();
		  break;
			  default:
				  System.out.println("Please select valid option");
		  }
	}
	       public void su() {
	    	   System.out.println("Please select One");
	    		  System.out.println("1:Sonet|2:Seltos");
	    		  Scanner sc=new Scanner(System.in);
	    		  int a = sc.nextInt();
	    		  Seltos s=new Seltos();
	    		  Sonet so=new Sonet();
	    		 
	    		  
	    		  switch(a)
	    		  {
	    		  case 1:s.vari();
	    			  break;
	 		      case 2:so.vari();
	    		  break;
	    		  

	    			  default:
	    				  System.out.println("Please select valid option");
	    		  }
	       }
	       public void dieselK() {
	   		System.out.println("Please select One");
	   		  System.out.println("1.SUV");
	   		  Scanner sc=new Scanner(System.in);
	   		  int a = sc.nextInt();
	   		  Kia k=new Kia();
	   		 
	   		  
	   		  switch(a)
	   		  {
	   		 
	   		  case 1:k.su1();
	   		  break;
	   			  default:
	   				  System.out.println("Please select valid option");
	   		  }
	   	}
	   	       public void su1() {
	   	    	   System.out.println("Please select One");
	   	    		  System.out.println("1:Sonet|2:Seltos");
	   	    		  Scanner sc=new Scanner(System.in);
	   	    		  int a = sc.nextInt();
	   	    		  Seltos s=new Seltos();
	   	    		  Sonet so=new Sonet();
	   	    		 
	   	    		  
	   	    		  switch(a)
	   	    		  {
	   	    		  case 1:s.vari1();
	   	    			  break;
	   	 		      case 2:so.vari1();
	   	    		  break;
	   	    		  

	   	    			  default:
	   	    				  System.out.println("Please select valid option");
	   	    		  }
	   	       }
	   	      
	      
}
