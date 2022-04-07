package Fourwheeler;

import java.util.Scanner;



public class FuelType extends Fourwheeler implements Petrol,Diesel, Electric{
  public void petrol() {
		  System.out.println("Please select One");
		  System.out.println("1:Suzuki|2:Tata|3:Hyundai|4:Mahindra|5:Kia|6:Toyota|7:Mg");
		  Scanner sc=new Scanner(System.in);
		  int a = sc.nextInt();
		  Suzuki s=new Suzuki();
		  Tata t=new Tata();
		  Hyundai h=new Hyundai();
		  Mahindra m=new Mahindra();
		  Kia k=new Kia();
		  Toyota to=new Toyota();
		  Mg mg=new Mg();
		  
		  
		  switch(a)
		  {
		  case 1:s.petrolS();
			  break;
		  case 2:t.petrolT();
		  break;
		  case 3:h.petrolH();
		  break;
		  case 4:m.petrolM();
		  break;
		  case 5:k.petrolK();
		  break;
		  case 6:to.petrolTo();
		  break;
		  case 7:mg.petrolMg();
		  break;

			  default:
				  System.out.println("Please select valid option");
		  }
	  }
		 
		  public void diesel() {
			 
			  System.out.println("Please select One");
			  System.out.println("1:Tata|2:Hyundai|3:Mahindra|4:Kia|5:Toyota|6:Mg");
			  Scanner sc=new Scanner(System.in);
			  int a = sc.nextInt();
			  Suzuki s=new Suzuki();
			  Tata t=new Tata();
			  Hyundai h=new Hyundai();
			  Mahindra m=new Mahindra();
			  Kia k=new Kia();
			  Toyota to=new Toyota();
			  Mg mg=new Mg();
			  
			  
			  switch(a)
			  {
			 
			  case 1:t.dieselT();
			  break;
			  case 2:h.dieselH();
			  break;
			  case 3:m.dieselM();
			  break;
			  case 4:k.dieselK();
			  break;
			  case 5:to.dieselTo();
			  break;
			  case 6:mg.dieselMg();
			  break;

				  default:
					  System.out.println("Please select valid option");
			  }
		  }
		  public void electric() {
				 
			  System.out.println("Please select One");
			  System.out.println("1:Tata|2:Hyundai|3:Mg");
			  Scanner sc=new Scanner(System.in);
			  int a = sc.nextInt();
			 
			  Tata t=new Tata();
			  Hyundai h=new Hyundai();
	           Mg mg=new Mg();
			  
			  
			  switch(a)
			  {
			  case 1:t.electricT();
				  break;
			  case 2:h.electricH();
			  break;
			  case 3:mg.electricM();
			  break;
			 

				  default:
					  System.out.println("Please select valid option");
			  }
		  }
		  
		  //FOR PETROL/CNG LMV COMMERTIAL VEHICLES BRAND
		  
		  public void petrolC() {
				 
			  System.out.println("Please select One");
			  System.out.println("1:Tata|2:Suzuki|3:Mahindra");
			  Scanner sc=new Scanner(System.in);
			  int a = sc.nextInt();
			 
			  Tata t=new Tata();
			  Suzuki s=new Suzuki();
	           Mahindra m=new Mahindra();
			  
			  
			  switch(a)
			  {
			  case 1:t.petrolCt();
			   break;
		      case 2:s.petrolCs();
		       break;
		      case 3:m.petrolCm();
		      break;
		 

				  default:
					  System.out.println("Please select valid option");
			  }
		  }
		  
//FOR DIESEL LMV COMMERTIAL VEHICLES BRAND
		  
		  public void dieselC() {
				 
			  System.out.println("Please select One");
			  System.out.println("1:Tata|2:Suzuki|3:Mahindra");
			  Scanner sc=new Scanner(System.in);
			  int a = sc.nextInt();
			 
			  Tata t=new Tata();
			  Suzuki s=new Suzuki();
	           Mahindra m=new Mahindra();
			  
			  
			  switch(a)
			  {
			  case 1:t.dieselCt();
			   break;
		      case 2:s.dieselCs();
		       break;
		      case 3:m.dieselCm();
		      break;
		 

				  default:
					  System.out.println("Please select valid option");
			  }
		  }
//FOR  HMV CNG COMMERTIAL VEHICLES BRAND
		  
		  public void cngCh() {
				 
			  System.out.println("Please select One");
			  System.out.println("1:EICHER|2:Tata");
			  Scanner sc=new Scanner(System.in);
			  int a = sc.nextInt();
			 
			  Tata t=new Tata();
			  Eicher e=new Eicher();
			  
			  
			  switch(a)
			  {
			   case 1:e.cngCe();
		        break;
			   case 2:t.cngCt();
		        break;
			  
		      		     
		        default:
			     System.out.println("Please select valid option");
			  }
		  }
//FOR  HMV DIESEL COMMERTIAL VEHICLES BRAND
		  
		  public void dieselCh() {
				 
			  System.out.println("Please select One");
			  System.out.println("1:TATA|2:EICHER");
			  Scanner sc=new Scanner(System.in);
			  int a = sc.nextInt();
			 
			  Tata t=new Tata();
			  Eicher e=new Eicher();
			  
			  
			  switch(a)
			  {
			   case 1:t.dieselCht();
		        break;
			   case 2:e.dieselChe();
		        break;
			    

		      		     
		        default:
			     System.out.println("Please select valid option");
			  }
		  }
}	  

