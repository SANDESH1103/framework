package threewheeler;
import java.util.Scanner;
public class FuelTypeBrand extends Auto implements Cng,Lpg,Electric{
  public void brand() {
	  System.out.println("Please select brand");
	  System.out.println("1:Bajaj|2:Piggio");
	  Scanner sc=new Scanner(System.in);
	  int a = sc.nextInt();
	  Bajaj b=new Bajaj();
	  PiggioC c=new PiggioC();
	  
	  
	  switch(a)
	  {
	  case 1:b.cng();
		  break;
	  case 2:c.cng1();
		  break;
		  default:
			  System.out.println("Please select valid option");
	  }
  }
	  public void brand1() {
		  System.out.println("Please select brand");
		  System.out.println("1:Bajaj|2:Piggio");
		  Scanner sc=new Scanner(System.in);
		  int a = sc.nextInt();
		  BajajL d=new BajajL();
		  PiggioL e=new PiggioL();
		  switch(a)
		  {
		  case 1:d.lpg();
			  break;
		  case 2: e.lpg1();
		    break;
		  default:
			  System.out.println("Please select valid option");
		  }
		  }
	  public void brand2() {
		  System.out.println("Please select brand");
		  System.out.println("1:MiniMetro");
		  Scanner sc=new Scanner(System.in);
		  int a = sc.nextInt();
		  MiniMetro f=new MiniMetro();
		  
		  switch(a)
		  {
		  case 1:f.elec();
			  break;
		  default:
			  System.out.println("Please select valid option");
		  }
	  }
	  public void petrol() {
		  System.out.println("Please select brand");
		  System.out.println("1:Suzuki|2:Piggio");
		  Scanner sc=new Scanner(System.in);
		  int a = sc.nextInt();
		  Suzukipcv b=new Suzukipcv();
		  Piggiopcv c=new Piggiopcv();
		  
		  
		  switch(a)
		  {
		  case 1:b.petro1();
			  break;
		  case 2:c.petrol2();
			  break;
			  default:
				  System.out.println("Please select valid option");
		  }
	  }
		  public void diesel() {
			  System.out.println("Please select brand");
			  System.out.println("1:Bajaj|2:Piggio");
			  Scanner sc=new Scanner(System.in);
			  int a = sc.nextInt();
			  Bajajdcv d=new Bajajdcv();
			  Piggiodcv e=new Piggiodcv();
			  switch(a)
			  {
			  case 1:d.diesel1();
				  break;
			  case 2: e.diesel2();
			    break;
			  default:
				  System.out.println("Please select valid option");
			  }
			  }
		 
}
