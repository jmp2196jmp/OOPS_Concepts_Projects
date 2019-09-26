package register;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import customer.Customer;
public class Registration {
 static int regid=0,rd=0;
 int cid;
 public static int []bt =new int[25];
 public static String []cus=new String[20];
	Customer cust =new Customer();
	BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	public void register(String fname,String mname,String lname,String email,String contactNumber)
	
	{
		cust.setFname(fname);
		cus[rd]=fname;
		cust.setMname(mname);
		cust.setLname(lname);
		cust.setEmail(email);
		cust.setContactNumber(contactNumber);
		System.out.println("Thanks for Registering, your id is "+ ++regid);
		bt[rd]=regid;
		System.out.println("Your details are");
		this.display();
		++rd;
		//System.out.println(rd);
	}
	public void viewcustomer()
	{
		
		System.out.println("Customers list\n The registered customers are");
		System.out.println(" Customer ID \tCustomer name" );
		int h=0;
		for(int i=1;i<=regid;i++)
		{
			System.out.println(i+"\t\t"+cus[h]);
			h++;
		}	
	}
	public void emailupdate( String email) throws  IOException
	{
		cust.setEmail(email);
		System.out.println("email updated");
	}
	public void display()
	{
		System.out.println("Name "+cust.getFname());
		System.out.println("Email "+cust.getEmail());
		System.out.println("Phone "+cust.getContactNumber());
	}
	
}
