package hierachical;

public class Booking {
	private int person;
	private int total_days;
	private double tariff,total;
	private String roomtype;
private	int month;
private int peakcharge;
public int getPeakcharge() {
	return peakcharge;
}
public void setPeakcharge(int peakcharge) {
	this.peakcharge = peakcharge;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getDiscount() {
	return discount;
}
public void setDiscount(int discount) {
	this.discount = discount;
}

private	int discount;
	public int getPerson() {
		return person;
	}
	public void setPerson(int person) {
		this.person = person;
	}
	public int getTotal_days() {
		return total_days;
	}
	public void setTotal_days(int total_days) {
		this.total_days = total_days;
	}
	public double getTariff() {
		return tariff;
	}
	public void setTariff(double tariff) {
		this.tariff = tariff;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	double roomBooking(int person, int total_days, double tariff, String roomtype)
	{
		total=person*total_days*tariff;
		return total;
	}
}
