package Fourwheeler;

import java.util.Scanner;

public class Suzuki extends FuelType implements Petrol,Diesel, Electric {
	 public void petrolS() {
	System.out.println("Please select One");
	  System.out.println("1:Hatchback|2:Sydan|3.SUV");
	  Scanner sc=new Scanner(System.in);
	  int a = sc.nextInt();
	  Suzuki s=new Suzuki();
	 
	  
	  switch(a)
	  {
	  case 1:s.hat();
		  break;
	  case 2:s.sy();
	  break;
	  case 3:s.su();
	  break;
		  default:
			  System.out.println("Please select valid option");
	  }
}
       public void hat() {
    	   System.out.println("Please select One");
    		  System.out.println("1:Swift|2:Alto|3:Wagon R|4:Baleno|5:S-Presso|6:Ertiga");
    		  Scanner sc=new Scanner(System.in);
    		  int a = sc.nextInt();
    		  Swift s=new Swift();
    		  Alto al=new Alto();
    		  Wagon w=new Wagon();
    		  Baleno ba=new Baleno();
    		  Spreeso sp=new Spreeso();
    		  Ertiga e=new Ertiga();
    		  
    		  switch(a)
    		  {
    		  case 1:s.vari();
    			  break;
 		      case 2:al.vari();
    		  break;
    		  case 3:w.vari();
    		  break;
  		      case 4:ba.vari();
    		  break;
    		  case 5:sp.vari();
    		  break;
   		     case 6:e.vari();
  		      break;
//    		  case 7:mg.petrolMg();
//    		  break;

    			  default:
    				  System.out.println("Please select valid option");
    		  }
       }
       public void sy() {
    	   System.out.println("Please select One");
    		  System.out.println("1:Dzire|2:Ciaz");
    		  Scanner sc=new Scanner(System.in);
    		  int a = sc.nextInt();
    		  SwiftDzire s=new SwiftDzire();
    		  Ciaz c=new Ciaz();
    		  
    		  
    		  switch(a)
    		  {
    		  case 1:s.vari();
    			  break;
   		      case 2:c.vari();
    		  break;
//    		  case 3:h.petrolH();
//    		  break;
//    		  case 4:m.petrolM();
//    		  break;
//    		  case 5:k.petrolK();
//    		  break;
//    		  case 6:to.petrolTo();
//    		  break;
//    		  case 7:mg.petrolMg();
//    		  break;

    			  default:
    				  System.out.println("Please select valid option");
    		  }
       }
      public void su() {
    	   System.out.println("Please select One");
  		  System.out.println("1:S-cross|2:Vitara Brezza");
		  Scanner sc=new Scanner(System.in);
  		  int a = sc.nextInt();
  		  Scross s=new Scross();
  		  Vitara v=new Vitara();
  		    switch(a)
  		  {
    		  case 1:s.vari();
    			  break;
  		      case 2:v.vari();
   		          break;
//    		  case 3:h.petrolH();
//    		  break;
//    		  case 4:m.petrolM();
//    		  break;
//    		  case 5:k.petrolK();
//    		  break;
//    		  case 6:to.petrolTo();
//    		  break;
//    		  case 7:mg.petrolMg();
//    		  break;

    			  default:
    				  System.out.println("Please select valid option");
    		  }
    		  
      }
      
      
      //For LMV PETROL/CNG COMMERTIAL VARIANT 
	      public void petrolCs() {
    	   System.out.println("Please select One");
    	   System.out.println("1:SUPER CARRY");
    		 
    		  Scanner sc=new Scanner(System.in);
    		  int a = sc.nextInt();
    		  Carry c=new Carry();
    		  
    		  switch(a)
    		  {
    		  case 1:c.vari();
    			  break;
   		     
//    		  case 3:h.petrolH();
//    		  break;
//    		  case 4:m.petrolM();
//    		  break;
//    		  case 5:k.petrolK();
//    		  break;
//    		  case 6:to.petrolTo();
//    		  break;
//    		  case 7:mg.petrolMg();
//    		  break;

    			  default:
    				  System.out.println("Please select valid option");
    		  }
       }
	      //For LMV DIESEL COMMERTIAL VARIANT 
	      public void dieselCs() {
    	   System.out.println("Please select One");
    	   System.out.println("1:SUPER CARRY");
    		 
    		  Scanner sc=new Scanner(System.in);
    		  int a = sc.nextInt();
    		  Carry c=new Carry();
    		  
    		  switch(a)
    		  {
    		  case 1:c.vari();
    			  break;
   		     
//    		  case 3:h.petrolH();
//    		  break;
//    		  case 4:m.petrolM();
//    		  break;
//    		  case 5:k.petrolK();
//    		  break;
//    		  case 6:to.petrolTo();
//    		  break;
//    		  case 7:mg.petrolMg();
//    		  break;

    			  default:
    				  System.out.println("Please select valid option");
    		  }
       }
   
//public void dieselS() {
//	System.out.println("Please select One");
//	  System.out.println("1:Hatchback|2:Sydan|3.SUV");
//	  Scanner sc=new Scanner(System.in);
//	  int a = sc.nextInt();
//	  Suzuki s=new Suzuki();
//	 
//	  
//	  switch(a)
//	  {
//	  case 1:s.hat1();
//		  break;
//	  case 2:s.sy1();
//	  break;
//	  case 3:s.su1();
//	  break;
//		  default:
//			  System.out.println("Please select valid option");
//	  }
//}
//      public void hat1() {
//   	   System.out.println("Please select One");
//   		  System.out.println("1:Swift|2:Ertiga");
//   		  Scanner sc=new Scanner(System.in);
//   		  int a = sc.nextInt();
//   		  Swift s=new Swift();
//   	      
//   		  Ertiga e=new Ertiga();
//   		  
//   		  switch(a)
//   		  {
//   		  case 1:s.vari1();
//   			  break;
//          case 2:sp.vari1();
//   		     break;
//   		  case 3:e.vari1();
//   		   break;
//// 		  case 4:ba.vari1();
////   		  break;
////   		  case 5:sp.vari1();
////   		  break;
////  		     case 6:e.vari1();
//// 		      break;
////   		  case 7:mg.petrolMg();
////   		  break;
//
//   			  default:
//   				  System.out.println("Please select valid option");
//   		  }
//      }
//      public void sy1() {
//   	   System.out.println("Please select One");
//   		  System.out.println("1:Ciaz");
//   		  Scanner sc=new Scanner(System.in);
//   		  int a = sc.nextInt();
//   		  
//   		  Ciaz c=new Ciaz();
//   		  
//   		  
//   		  switch(a)
//   		  {
//   		  case 1:c.vari1();
//   			  break;
//  		      
////   		  case 3:h.petrolH();
////   		  break;
////   		  case 4:m.petrolM();
////   		  break;
////   		  case 5:k.petrolK();
////   		  break;
////   		  case 6:to.petrolTo();
////   		  break;
////   		  case 7:mg.petrolMg();
////   		  break;
//
//   			  default:
//   				  System.out.println("Please select valid option");
//   		  }
//      }
//     public void su1() {
//   	   System.out.println("Please select One");
// 		  System.out.println("1:S-cross|2:Vitara Brezza");
//		  Scanner sc=new Scanner(System.in);
// 		  int a = sc.nextInt();
// 		  Scross s=new Scross();
// 		  Vitara v=new Vitara();
// 		    switch(a)
// 		  {
//   		  case 1:s.vari1();
//   			  break;
// 		      case 2:v.vari1();
//  		          break;
////   		  case 3:h.petrolH();
////   		  break;
////   		  case 4:m.petrolM();
////   		  break;
////   		  case 5:k.petrolK();
////   		  break;
////   		  case 6:to.petrolTo();
////   		  break;
////   		  case 7:mg.petrolMg();
////   		  break;
//
//   			  default:
//   				  System.out.println("Please select valid option");
//   		  }
//   		  
//     }
}