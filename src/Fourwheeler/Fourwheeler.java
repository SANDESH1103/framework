package Fourwheeler;

import Vehicles.*;
import java.util.Scanner;
public class Fourwheeler extends Vehicles {
	
	//FOR FOURWHEEL TYPES
public void brand() {
	System.out.println("Please select one option");
	System.out.println("1.Private vehicles|2.Commercial vehicles");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	
	Fourwheeler fr=new Fourwheeler();
	switch(a)
	{
	case 1:fr.fuel();
	break;
	
	case 2:fr.fuelC();
	default:
		System.out.println("Please select valid option");
	
		
	}
	
}

//FOR  PRIVATE VEHICLES FUEL TYPE
public void fuel() {
	System.out.println("Please select fuel Option");
	System.out.println("1.Petrol/Cng|2.Diesel|3.Electric");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	
	FuelType fr=new FuelType();
	switch(a)
	{
	case 1:fr.petrol();
	break;
	
	case 2:fr.diesel();
	break;
	case 3:fr.electric();
	break;
	default:
		System.out.println("Please select valid option");
	
		
	}
  }

//FOR COMMERTIAL  VEHICLES TYPES

public void fuelC() {
	System.out.println("Please select one Option");
	System.out.println("1.LCV|2.HCV");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	
	Fourwheeler fr=new Fourwheeler();
	switch(a)
	{
	case 1:fr.fuel1();
	break;
	
	case 2:fr.fuel2();
	break;
	
	default:
		System.out.println("Please select valid option");
	
		
	}
}

//FOR LCV  VEHICLES FUEL TYPE

public void fuel1() {
	System.out.println("Please select fuel Option");
	System.out.println("1.Petrol/Cng|2.Diesel");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	
	FuelType fr=new FuelType();
	switch(a)
	{
	case 1:fr.petrolC();
	break;
	
	case 2:fr.dieselC();
	break;
	
	default:
		System.out.println("Please select valid option");
	
		
	}
  }
//FOR HCV  VEHICLES

public void fuel2() {
	System.out.println("Please select fuel Option");
	System.out.println("1.CNG|2:DIESEL");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	FuelType fr=new FuelType();
	
	switch(a)
	{
	case 1:fr.cngCh();
	break;
	case 2:fr.dieselCh();
	break;
	
	
	default:
		System.out.println("Please select valid option");
	
		
	}
  }
}
