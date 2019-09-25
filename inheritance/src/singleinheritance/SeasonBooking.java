package singleinheritance;

public class SeasonBooking extends Booking {
	
	double roomBooking(int person, int total_days, double tariff, String roomtype)
	{
		return super.roomBooking(person, total_days, tariff, roomtype);
	}
	}
