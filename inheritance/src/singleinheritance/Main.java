package singleinheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int person;
		int total_days;
		double tariff;
		String roomtype;
		SeasonBooking sb=new SeasonBooking();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Booking");
		System.out.println("Enter the number of persons");
		person=Integer.parseInt(br.readLine());
		sb.setPerson(person);
		System.out.println("Enter the number of days");
		total_days=Integer.parseInt(br.readLine());
		sb.setTotal_days(total_days);
		System.out.println("enter room type");
		roomtype=br.readLine();
		sb.setRoomtype(roomtype);
		System.out.println("Enter the tariff for single person");
		tariff=Integer.parseInt(br.readLine());
		sb.setTariff(tariff);
	double d=sb.roomBooking(person,total_days,tariff,roomtype);
		System.out.println("Total Tariff: "+d+"/-");
		}

}
