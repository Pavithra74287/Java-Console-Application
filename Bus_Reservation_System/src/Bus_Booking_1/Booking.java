package Bus_Booking_1;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String passenger;
	int Busno;
	Date date;
	public Booking(String name,int bus,Date date)
	{
		System.out.print("Enter Your Name");
		Scanner sb=new Scanner(System.in);
		String passenger=sb.next();
		System.out.print("Enter Your Busno");
		int Busno=sb.nextInt();
		System.out.print("Enter Date dd-MM-yy");
		String dateinput=sb.next();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yy");
		try
		{
			date=dateformat.parse(dateinput);
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
	}
	public boolean isAvailable(ArrayList<Booking>books, ArrayList<Bus>buses)
	{
		int capacity=0;
		for(Bus bus:buses) 
		{
			if(bus.getbusno()==Busno)
			{
				capacity=bus.getcapacity();
			}
		}
			int booked=0;
			for(Booking b:books)
			{
				if(b.Busno==Busno && b.date.equals(date))
				{
					booked++;
				}
			}
			return booked<capacity?true:false;
		}
	}
