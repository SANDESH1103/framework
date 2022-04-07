package Fourwheeler;

import java.util.Scanner;

public class Tata implements Petrol,Diesel, Electric {
	
	//FOR PRIVATE PETROL VEHICLES
	public void petrolT() {
		System.out.println("Please select One");
		  System.out.println("1:Hatchback|2:Sydan|3.SUV");
		  Scanner sc=new Scanner(System.in);
		  int a = sc.nextInt();
		  Tata t=new Tata();
		 
		  
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
	    		  System.out.println("1:Tiago|2:Altroz");
	    		  Scanner sc=new Scanner(System.in);
	    		  int a = sc.nextInt();
	    		  Tiago ta=new Tiago();
	    		  Altroz at=new Altroz();
	    		 
	    		  
	    		  
	    		  switch(a)
	    		  {
	    		  case 1:ta.vari();
	    		  break;
	 		      case 2:at.vari();
	    		  break;
	    		 
	    		  //case 5:p.vari();
	    		 // break;
	   		    // case 6:to.petrolTo();
//	    		  break;
//	    		  case 7:mg.petrolMg();
//	    		  break;

	    			  default:
	    				  System.out.println("Please select valid option");
	    		  }
	       }
	       public void sy() {
	    	   System.out.println("Please select One");
	    		  System.out.println("1:Tigor");
	    		  Scanner sc=new Scanner(System.in);
	    		  int a = sc.nextInt();
	    		  Tigor t=new Tigor();
	    		  
	    		  switch(a)
	    		  {
	    		  case 1:t.vari();
	    			  break;
	   		     // case 2:c.vari();
	    		 // break;
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

	    			  default:
	    				  System.out.println("Please select valid option");
	    		  }
	       }
	      public void su() {
	    	   System.out.println("Please select One");
	  		  System.out.println("1:Punch|2:Nexon");
			  Scanner sc=new Scanner(System.in);
	  		  int a = sc.nextInt();
//	  		  Harrier h=new Harrier();
//	  		  Safari s=new Safari();
	  	      Nexon n=new Nexon();
	  		  Punch p=new Punch();
	  		 
	  		 
	  		   switch(a)
	  		  {
	    		  case 1:p.vari();
	    			  break;
	  		     case 2:n.vari();
	   		      break;
//    		     case 3:p.vari();
//   		          break;
// 		          case 4:n.vari();
//    		      break;
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
	      
	      //FOR PRIVATE DIESEL VEHICLES
	      public void dieselT() {
	  		System.out.println("Please select One");
	  		  System.out.println("1:Hatchback|2:Sydan|3.SUV");
	  		  Scanner sc=new Scanner(System.in);
	  		  int a = sc.nextInt();
	  		  Tata t=new Tata();
	  		 
	  		  
	  		  switch(a)
	  		  {
	  		  case 1:t.hat1();
	  			  break;
	  		  case 2:t.sy1();
	  		  break;
	  		  case 3:t.su1();
	  		  break;
	  			  default:
	  				  System.out.println("Please select valid option");
	  		  }
	  	}
	  	       public void hat1() {
	  	    	   System.out.println("Please select One");
	  	    		  System.out.println("1:Tiago|2:Altroz");
	  	    		  Scanner sc=new Scanner(System.in);
	  	    		  int a = sc.nextInt();
	  	    		  Tiago ta=new Tiago();
	  	    		  Altroz at=new Altroz();
	  	    		 
	  	    		  
	  	    		  
	  	    		  switch(a)
	  	    		  {
	  	    		  case 1:ta.vari1();
	  	    		  break;
	  	 		      case 2:at.vari1();
	  	    		  break;
	  	    		 
	  	    		  //case 5:p.vari();
	  	    		 // break;
	  	   		    // case 6:to.petrolTo();
//	  	    		  break;
//	  	    		  case 7:mg.petrolMg();
//	  	    		  break;

	  	    			  default:
	  	    				  System.out.println("Please select valid option");
	  	    		  }
	  	       }
	  	       public void sy1() {
	  	    	   System.out.println("Please select One");
	  	    		  System.out.println("1:Tigor");
	  	    		  Scanner sc=new Scanner(System.in);
	  	    		  int a = sc.nextInt();
	  	    		  Tigor t=new Tigor();
	  	    		  
	  	    		  switch(a)
	  	    		  {
	  	    		  case 1:t.vari1();
	  	    			  break;
	  	   		     // case 2:c.vari();
	  	    		 // break;
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

	  	    			  default:
	  	    				  System.out.println("Please select valid option");
	  	    		  }
	  	       }
	  	      public void su1() {
	  	    	   System.out.println("Please select One");
	  	  		  System.out.println("1:Punch|2:Nexon|3:Harrier|4:SAFARI");
	  			  Scanner sc=new Scanner(System.in);
	  	  		  int a = sc.nextInt();
	  	  		  Harrier h=new Harrier();
	  	  		  Safari s=new Safari();
	  	  	      Nexon n=new Nexon();
	  	  		  Punch p=new Punch();
	  	  		 
	  	  		 
	  	  		   switch(a)
	  	  		  {
	  	    		   case 1:p.vari1();
	  	    			  break;
	  	  		      case 2:n.vari1();
	  	   		      break;
	      		      case 3:h.vari1();
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
	  	      
	  	    //For electric vehicles
	  	      
	  	    public void electricT() {
		  		System.out.println("Please select One");
		  		  System.out.println("1:Sydan|2.SUV");
		  		  Scanner sc=new Scanner(System.in);
		  		  int a = sc.nextInt();
		  		  Tata t=new Tata();
		  		 
		  		  
		  		  switch(a)
		  		  {
		  		  case 1:t.sy2();
		  			  break;
		  		  case 2:t.suv2();
		  		  break;
		  		  
		  			  default:
		  				  System.out.println("Please select valid option");
		  		  }
		  	}
	  	  public void sy2() {
 	    	   System.out.println("Please select One");
 	    		  System.out.println("1:Tiago");
 	    		  Scanner sc=new Scanner(System.in);
 	    		  int a = sc.nextInt();
 	    		  Tigor t=new Tigor();
 	    		   switch(a)
 	    		  {
 	    		  case 1:t.vari1E();
 	    		  break;
 	 		     
 	    		 
 	    		  //case 5:p.vari();
 	    		 // break;
 	   		    // case 6:to.petrolTo();
// 	    		  break;
// 	    		  case 7:mg.petrolMg();
// 	    		  break;

 	    			  default:
 	    				  System.out.println("Please select valid option");
 	    		  }
 	       }
 	       public void suv2() {
 	    	   System.out.println("Please select One");
 	    		  System.out.println("1:Nexon");
 	    		  Scanner sc=new Scanner(System.in);
 	    		  int a = sc.nextInt();
 	    		  Nexon n=new Nexon();
 	    		  
 	    		  switch(a)
 	    		  {
 	    		  case 1:n.vari1E();
 	    			  break;
 	   		     // case 2:c.vari();
 	    		 // break;
// 	    		  case 3:h.petrolH();
// 	    		  break;
// 	    		  case 4:m.petrolM();
// 	    		  break;
// 	    		  case 5:k.petrolK();
// 	    		  break;
// 	    		  case 6:to.petrolTo();
// 	    		  break;
// 	    		  case 7:mg.petrolMg();
// 	    		  break;

 	    			  default:
 	    				  System.out.println("Please select valid option");
 	    		  }
 	       }
 	       
 	      //For LMV PETROL/CNG COMMERTIAL VARIANT 
 	      public void petrolCt() {
	    	   System.out.println("Please select One");
	    	   System.out.println("1:TATA ACE|2:INTRA");
	    		 
	    		  Scanner sc=new Scanner(System.in);
	    		  int a = sc.nextInt();
	    		  Ace ac=new Ace();
	    		  Intra i=new Intra();
	    		  
	    		  switch(a)
	    		  {
	    		  case 1:ac.variA();
	    			  break;
	   		      case 2:i.variI();
	    		  break;
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

	    			  default:
	    				  System.out.println("Please select valid option");
	    		  }
	       }
 	      
 	      
 	     //For LMV DIESEL COMMERTIAL VARIANT 
 	      public void dieselCt() {
	    	   System.out.println("Please select One");
	    	   System.out.println("1:TATA ACE|2:INTRA");
	    		 
	    		  Scanner sc=new Scanner(System.in);
	    		  int a = sc.nextInt();
	    		  Ace ac=new Ace();
	    		  Intra i=new Intra();
	    		  
	    		  switch(a)
	    		  {
	    		  case 1:ac.variA();
	    		  break;
	   		      case 2:i.variI();
	    		  break;
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

	    			  default:
	    				  System.out.println("Please select valid option");
	    		  }
	       }
 	      
 	     //For HMV CNG COMMERTIAL VARIANT 
 	      public void cngCt() {
	    	   System.out.println("Please select One");
	    	   System.out.println("1:TATA 407EX|2:TATA 609EX");
	    		 
	    		  Scanner sc=new Scanner(System.in);
	    		  int a = sc.nextInt();
	    		  Ace ac=new Ace();
	    		  TataEx t=new TataEx();
	    		  
	    		  switch(a)
	    		  {
	    		  case 1:t.cngCt();
	    			  break;
	    		  case 2:t.cngCt1();
	   		      default:
	    	     System.out.println("Please select valid option");
	    		  }
	       }
 	      
 	      
 	     //For HMV DIESEL COMMERTIAL VARIANT 
 	      public void dieselCht() {
	    	   System.out.println("Please select One");
	    	   System.out.println("1:TATA 407EX|2:TATA 609EX");
	    		 
	    		  Scanner sc=new Scanner(System.in);
	    		  int a = sc.nextInt();
	    		  TataEx t=new TataEx();
	    		  switch(a)
	    		  {
	    		  case 1:t.dieselCt();
	    		  break;
	    		  case 2:t.dieselCt1();
	    		  break;
	   		      default:
	    				  System.out.println("Please select valid option");
	    		  }
	       }
 	  
}
