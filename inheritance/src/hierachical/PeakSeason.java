package hierachical;

public class PeakSeason extends Booking {
int month;
int peakcharge;
double roomBooking(int person, int total_days, double tariff, String roomtype,int month,int peakcharge)
{
	double total=super.roomBooking(person, total_days, tariff, roomtype);
	double amount=(total*peakcharge);
	return amount;
}
}
