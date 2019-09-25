package hierachical;

public class LeanSeason extends Booking {

	int month;
	int discount;
	double roomBooking(int person, int total_days, double tariff, String roomtype,int month,int discount)
	{
		
				double total=super.roomBooking(person, total_days, tariff, roomtype);
				double amount=total*discount/100;

		return total-amount;
	}
}
