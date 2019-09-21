package management;
class Customer {
int rd;
String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;
	public int getRd() {
	return rd;
}

public void setRd(int rd) {
	this.rd = rd;
}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProofType() {
		return proofType;
	}

	public void setProofType(String proofType) {
		this.proofType = proofType;
	}

	public String getProofID() {
		return proofID;
	}

	public void setProofID(String proofID) {
		this.proofID = proofID;
	}

	
	
	public void register() {
		System.out.println("your details");	
		System.out.println(name);
		System.out.println(address);
		System.out.println(contactNumber);
		System.out.println(email);
		System.out.println(proofType);
		System.out.println(proofID);
		}	
	 
	public void update(String name, String address,String contactNumber, String email,String proofType,String proofID,int rd)
	{
		System.out.println("your details as follows");	
		System.out.println("Name: "+name);
		System.out.println("Address:  "+address);
		System.out.println("Contact Number: "+contactNumber);
		System.out.println("E-Mail ID: "+email);
		System.out.println("Proof type: "+proofType);
		System.out.println("Proof id "+proofID);
		System.out.println("Thankyou for your update regno. " +rd);
	}
	/*public void print(String name,int rd)
	{
		System.out.println("Customers list\n The registered customers are");
		System.out.println(" Customer ID \t\tCustomer name" );
		for(int i=0;i<rd;i++)
		{
			System.out.println(+bt[i]+"\t\t"+cust[i]);
		}
		
	}*/	
		
	}
	

