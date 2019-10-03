package arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {
	static int regid;
	public static ArrayList<String> ar=new ArrayList<String>();
	public static void main(String[] args) throws IOException {
		int ch,stat;
		  String fname;
		  	String mname;
		    String lname;
			String address;
			String contactNumber;
			String email = null;
			String proofType;
			String proofID;
			String conti;
			int cid;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Register reg=new Register();
			Booking bk=new Booking();
			
			do
			{
				System.out.println("menu\n 1.Register\n 2.Book\n 3.Status\n 4.Email\n 5.All Customers\n 6.All Bookings \n 7.Exit");
			ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
			case 1:
				System.out.println("enter your first name");
				fname=br.readLine();
				ar.add(fname);
				System.out.println("enter your middle name");
				mname=br.readLine();
				
				System.out.println("enter your last name");
				lname=br.readLine();
			
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
				reg.register(fname, mname, lname, email, contactNumber);
				break;
			case 2:

				  System.out.println("Booking");
				  System.out.println("Please choose the your services required");
					int k=bk.disp();
					bk.book(k);
					break;
			case 3:
				System.out.println("enter room no.");
				 stat=Integer.parseInt(br.readLine());
				bk.status(stat);
				break;
			 case	4:
				 System.out.println("Email Update");
				 System.out.println("enter your customer id");
					cid=Integer.parseInt(br.readLine());
					System.out.println("enter email id");
					email=br.readLine();
					reg.emailupdate(email);
					break;
			 case 5:
				 
				   reg.viewcustomer();
				    break;
			 case 6:
				 
			bk.check();
				 break;
			 case 7:
				 System.exit(0);
	        }
			System.out.println("do you want to continue  yes/no");
				  conti=br.readLine();
				}while(conti.equalsIgnoreCase("yes"));	

	}
}
