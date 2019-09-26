package booking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import register.Registration;
public class Booking {
	static int roomno=0,d=0,bf=0;
    private	String ac;
    private	String cot;
    private	String cable;
    private	String wifi;
    private	String laundry;
    private	int d1,d2,dat;
    int []booked =new int[25];
    int []dis=new int[25];
    int []bd =new int[25];
int stat=0;
   Registration rs =new  Registration();
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getCot() {
		return cot;
	}
	public void setCot(String cot) {
		this.cot = cot;
	}
	public String getCable() {
		return cable;
	}
	public void setCable(String cable) {
		this.cable = cable;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getLaundry() {
		return laundry;
	}
	public void setLaundry(String laundry) {
		this.laundry = laundry;
	}
//	public int getT() {
//		return t;
//	}
//	public void setT(int t) {
//		this.t = t;
//	}
	public int getD1() {
		return d1;
	}
	public void setD1(int d1) {
		this.d1 = d1;
	}
	public int getD2() {
		return d2;
	}
	public void setD2(int d2) {
		this.d2 = d2;
	}
	BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
public int disp() throws IOException
{  int t=0;
	System.out.println("AC/Non-AC(AC/nAC)");
	  ac=b.readLine();
	  if(ac.equalsIgnoreCase("AC"))
	  {
		  t=t+1000;
		  this.setAc("Ac");
	  }
	  else if(ac.equalsIgnoreCase("nAC"))
	  {
		  t=t+750;
		  this.setAc("Non-Ac");
	  }
	  System.out.println("Cot(S/D)");
	  cot=b.readLine();
	  if(cot.equalsIgnoreCase("S"))
	  {
		  t=t+0;
		  this.setCot("Single");
		  
	  }
	  else if(cot.equalsIgnoreCase("D"))
	  {
		  t=t+350;
		  this.setCot("Double");
	  }
	  System.out.println("With cable connection/Without cable connection(C/nC)");
	  cable=b.readLine();
	  if(cable.equalsIgnoreCase("C"))
	  {
		  t=t+50;
		  this.setCable("cable connection enabled");
	  }
	  else if(cable.equalsIgnoreCase("nC"))
	  {
		  t=t+0;
		  this.setCable("No cable connection");
	  }
	  System.out.println("Wi-Fi needed or not(W/nW)");  
	  wifi=b.readLine();
	  if(wifi.equalsIgnoreCase("W"))
	  {
		  t=t+200;
		  this.setWifi("wifi enabled");
		  
	  }
	  else if(wifi.equalsIgnoreCase("nW"))
	  {
		  t=t+0;
		  this.setWifi("No wifi");
	  }
	  System.out.println("Laundry service needed or not(L/nL)");
	  laundry=b.readLine();
	  if(laundry.equalsIgnoreCase("L"))
	  {
		  t=t+100;
		  this.setLaundry("With laundry service");
	  }
	  else if(laundry.equalsIgnoreCase("nL"))
	  {
		  t=t+0;
		  this.setLaundry("witout laundry service");
	  }
	  System.out.println("Enter the date of booking");
	   dat = Integer.parseInt(b.readLine());
	   dis[d]=dat;
	   ++d;
	   System.out.println("Thank you for booking. Your room number is " + ++roomno);
	   booked[roomno]=1;
	   bd[bf]=roomno;
	   ++bf;
	   return t;
}

public void status(int stat)
{
	
		if(booked[stat]==1)
		{
		System.out.println("Room number " +stat+ "  booked");
	 }
	
	 else
	 {
		 System.out.println("Room number " +stat+   " is not booked");
	 }
}


	public void book(int k)
	{
	    System.out.println("The total amount is " +k);
		System.out.println("The services chosen are");
		System.out.println(getCot()+ " cot " +getAc()+ " room");
		System.out.println(getCable());
		System.out.println(getWifi());
		System.out.println(getLaundry());
		//t=0;
	}
	public void check() throws NumberFormatException, IOException {
		System.out.println("Enter the date of booking");
		  int startdate=Integer.parseInt(b.readLine());
			  System.out.println("Enter the end date");
			  int enddate=Integer.parseInt(b.readLine());
			  System.out.println(" Room ID \t Customer ID" );
			  for(int f=0;f<bf;f++)
			  {
				  //System.out.println(bd[f]+""+Registration.bt[f]);
				  if(dis[f]>=startdate&&dis[f]<=enddate)
				  {
					  System.out.println(bd[f] + "\t\t"+Registration.bt[f]);
				  }
			  }
		
	}
}

