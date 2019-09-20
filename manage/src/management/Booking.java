package management;

public class Booking {
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	int t;

	public int getT() {
		return t;
	}
	public void setT(int t) {
		this.t = t;
	}
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
	
	public void book()
	{
	
		System.out.println("The total charge is " +t);
		System.out.println("The services chosen are");
		System.out.println(getCot()+ " cot " +getAc()+ " room");
		System.out.println(getCable());
		System.out.println(getWifi());
		System.out.println(getLaundry());
	}
}
