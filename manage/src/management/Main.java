package management;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	 static int registerID=0;
	 static int rt=0;
	 public static void main(String[] args) throws IOException
	 {
		 String ac;
			String cot;
			String cable;
			String wifi;
			String laundry;
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
		String y,k;
		int t=0;
		do
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your name");
		name=br.readLine();
		System.out.println("enter your address");
		address=br.readLine();
		System.out.println("entber your mobile no.");
		contactNumber=br.readLine();
		System.out.println("enter your email id");
		email=br.readLine();
		System.out.println("enter your proof type");
		proofType=br.readLine();
		System.out.println("enter your proof id");
		proofID=br.readLine();
		Customer c=new Customer();
		c.setName(name);
		c.setAddress(address);
		c.setContactNumber(contactNumber);
		c.setEmail(email);
		c.setProofID(proofType);
		c.setProofType(proofID);
		c.register();
		System.out.println("Thankyou for your services " + ++registerID);
		System.out.println("do you want to continue  yes/no");
		y=br.readLine();
		}while(y.equals("yes"));
		do
		{
			System.out.println("Booking");
			  System.out.println("Please choose the your services required");
			  Booking bk=new Booking();
			  BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
			  System.out.println("AC/Non-AC(AC/nAC)");
			  ac=b.readLine();
			  if(ac.equals("AC"))
			  {
				  t=t+1000;
				  bk.setAc("Ac");
			  }
			  else if(ac.equals("nAC"))
			  {
				  t=t+750;
				  bk.setAc("Non-Ac");
			  }
			  System.out.println("Cot(Single/Double)");
			  cot=b.readLine();
			  if(cot.equals("Single"))
			  {
				  t=t+0;
				  bk.setCot("Single");
				  
			  }
			  else if(cot.equals("Double"))
			  {
				  t=t+350;
				  bk.setCot("Double");
			  }
			  System.out.println("With cable connection/Without cable connection(C/nC)");
			  cable=b.readLine();
			  if(cable.equals("C"))
			  {
				  t=t+50;
				  bk.setCable("cable connection enabled");
			  }
			  else if(cable.equals("nC"))
			  {
				  t=t+0;
				  bk.setCable("No cable connection");
			  }
			  System.out.println("Wi-Fi needed or not(W/nW)");  
			  wifi=b.readLine();
			  if(wifi.equals("W"))
			  {
				  t=t+200;
				  bk.setWifi("wifi enabled");
				  
			  }
			  else if(wifi.equals("nW"))
			  {
				  t=t+0;
				  bk.setWifi("No wifi");
			  }
			  System.out.println("Laundry service needed or not(L/nL)");
			  laundry=b.readLine();
			  if(laundry.equals("L"))
			  {
				  t=t+100;
				  bk.setLaundry("With laundry service");
			  }
			  else if(laundry.equals("nL"))
			  {
				  t=t+0;
				  bk.setLaundry("witout laundry service");
			  }
			  bk.setT(t);
			  bk.book();
			  			  System.out.println("do you want to continue  yes/no");
			  k=b.readLine();
		}while(k.equals("no"));
		System.out.println("Thank you for booking. Your room number is " + ++rt);
	  
		}	
	 }
		
