package management;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {
	 static int registerID=0,rd=0;
	 static int rt=0;
	 public static void main(String[] args) throws IOException
	 {
		    int ch,er,d1,d2;
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
			String y,k,u,ep;
			int t=0,dat;
			int []booked =new int[25];
			int []bt =new int[25];
			String []cust=new String[20];
			int []dis=new int[25];
			do
			{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter your name");
			name=br.readLine();
			cust[rd]=name;
			++rd;
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
			System.out.println("Thankyou for your registration " + ++registerID);
			System.out.println("do you want to register one more  yes/no");
			y=br.readLine();
			}while(y.equalsIgnoreCase("yes"));
			bt[rd]=registerID;
			
			System.out.println("Customers list\n The registered customers are");
			System.out.println(" Customer ID \tCustomer name" );
			int h=0;
			for(int i=1;i<=registerID;i++)
			{
				System.out.println(i+"\t\t"+cust[h]);
				h++;
			}
			//Customer c2=new Customer();
			//c2.print(name,registerID);
			//rd=registerID;
			System.out.println("do you want to update email id yes/no");
			BufferedReader it=new BufferedReader(new InputStreamReader(System.in));
			ep=it.readLine();
			if(ep.equalsIgnoreCase("yes"))
			{
				System.out.println("update email id");
				System.out.println("enter the email id");
				email=it.readLine();
				System.out.println(" email updated");
				Customer c1=new Customer();
				c1.update(name,address,contactNumber,email,proofType,proofID,rd);
				
			}
			do
			{
			System.out.println("menu\n 1.Book\n 2.Status \n 3.view\n 4.Exit");
			Scanner sc= new Scanner(System.in);
			ch=sc.nextInt();
			if(ch==1)
			{
			do
			{
				
				System.out.println("Booking");
				  System.out.println("Please choose the your services required");
				  Booking bk=new Booking();
				  BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
				  System.out.println("AC/Non-AC(AC/nAC)");
				  ac=b.readLine();
				  if(ac.equalsIgnoreCase("AC"))
				  {
					  t=t+1000;
					  bk.setAc("Ac");
				  }
				  else if(ac.equalsIgnoreCase("nAC"))
				  {
					  t=t+750;
					  bk.setAc("Non-Ac");
				  }
				  System.out.println("Cot(Single/Double)");
				  cot=b.readLine();
				  if(cot.equalsIgnoreCase("Single"))
				  {
					  t=t+0;
					  bk.setCot("Single");
					  
				  }
				  else if(cot.equalsIgnoreCase("Double"))
				  {
					  t=t+350;
					  bk.setCot("Double");
				  }
				  System.out.println("With cable connection/Without cable connection(C/nC)");
				  cable=b.readLine();
				  if(cable.equalsIgnoreCase("C"))
				  {
					  t=t+50;
					  bk.setCable("cable connection enabled");
				  }
				  else if(cable.equalsIgnoreCase("nC"))
				  {
					  t=t+0;
					  bk.setCable("No cable connection");
				  }
				  System.out.println("Wi-Fi needed or not(W/nW)");  
				  wifi=b.readLine();
				  if(wifi.equalsIgnoreCase("W"))
				  {
					  t=t+200;
					  bk.setWifi("wifi enabled");
					  
				  }
				  else if(wifi.equalsIgnoreCase("nW"))
				  {
					  t=t+0;
					  bk.setWifi("No wifi");
				  }
				  System.out.println("Laundry service needed or not(L/nL)");
				  laundry=b.readLine();
				  if(laundry.equalsIgnoreCase("L"))
				  {
					  t=t+100;
					  bk.setLaundry("With laundry service");
				  }
				  else if(laundry.equalsIgnoreCase("nL"))
				  {
					  t=t+0;
					  bk.setLaundry("witout laundry service");
				  }
				  System.out.println("Enter the date of booking");
				  dat=sc.nextInt();
				  //System.out.println("Enter the end date");
				 // d2=sc.nextInt();

				  bk.setT(t);
				  bk.book();
				 System.out.println("do you want to continue  yes/no");
				  k=b.readLine();
			}while(k.equalsIgnoreCase("no"));
			System.out.println("Thank you for booking. Your room number is " + ++rt);
		   booked[rt]=1;
			}
			if(ch==2)
			{
				System.out.println("enter room no.");
				 er=sc.nextInt();
				// System.out.println(booked[1]  + " zero thin array");
				 if(er<25)
					  {
					 // System.out.println("Room number " +er+ " is  booked");
				 if(booked[er]==1)
					 {
					System.out.println("Room number " +er+ " is  booked");	 
					 }
					
					 else
					 {
						 System.out.println("Room number " +er+ " is not  booked");
					 }
					 
				 }
				 else
				 {
					 System.out.println("Invalid room number");
				 }
			}
			if(ch==3)
			{
				System.out.println("Enter the date of booking");
				  d1=sc.nextInt();
				  System.out.println("Enter the end date");
				  d2=sc.nextInt();

			}
			 System.out.println("do you want to continue  yes/no");
			  u=sc.next();
			}while(u.equalsIgnoreCase("yes"));
	 }
		 }
			
