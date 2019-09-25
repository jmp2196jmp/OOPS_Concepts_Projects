package hierachical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import singleinheritance.SeasonBooking;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		int person;
		int total_days,month,discount,peakcharge;
		double tariff;
		String roomtype;
		Booking bg=new Booking();
		PeakSeason ps=new PeakSeason();
		LeanSeason ls=new LeanSeason();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Booking");
		System.out.println("Enter the number of persons");
		person=Integer.parseInt(br.readLine());
		bg.setPerson(person);
		System.out.println("Enter the number of days");
		total_days=Integer.parseInt(br.readLine());
		bg.setTotal_days(total_days);
		System.out.println("enter room type");
		roomtype=br.readLine();
		bg.setRoomtype(roomtype);
		System.out.println("enter the month");
		month=Integer.parseInt(br.readLine());
		bg.setMonth(month);
		if((month==1) || (month==2)|| (month==3)|| (month==7)|| (month==8)||(month==9)||(month==10))
		{
		System.out.println("enter the discount");
		discount=Integer.parseInt(br.readLine());
		bg.setRoomtype(roomtype);
		System.out.println("Enter the tariff for single person");
		tariff=Integer.parseInt(br.readLine());
		bg.setTariff(tariff);
		double d=ls.roomBooking(person,total_days,tariff,roomtype,month,discount);
		System.out.println("Total Tariff: "+d+"/-");
		}
		if(month==4 || month==5|| month==6|| month==9|| month==11||month==12)
		{
			System.out.println("enter the peakcharge");
			peakcharge=Integer.parseInt(br.readLine());
			bg.setPeakcharge(peakcharge);
			System.out.println("Enter the tariff for single person");
			tariff=Integer.parseInt(br.readLine());
			bg.setTariff(tariff);
			double m=ps.roomBooking(person,total_days,tariff,roomtype,month,peakcharge);
			System.out.println("Total Tariff: "+m+"/-");
		}
	}

}
 