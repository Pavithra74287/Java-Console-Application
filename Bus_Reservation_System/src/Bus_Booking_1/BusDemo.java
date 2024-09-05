package Bus_Booking_1;
import java.util.*;
public class BusDemo {

	public static void main(String[] args)
	{
		ArrayList<Booking>books=new ArrayList<Booking>();
		ArrayList<Bus>buses=new ArrayList<Bus>();
		buses.add(new Bus( 1,"karthi",2));
		buses.add(new Bus(3,"Balu",2));
		buses.add(new Bus(9,"Vetri",7));
		for(Bus b:buses)
		{
			b.displayInfo();
		}
		int user=1;
		Scanner sc=new Scanner(System.in);
		while(user==1)
		{
			System.out.print("Enter 1 for BOOK and 2 for EXIT ");
			int num=sc.nextInt();
			if(num==2)
			{
				System.out.print("Thank you..!!!");
				break;
			}
			if(num==1)
			{
				Booking booking=new Booking(null, num, null);
				if(booking.isAvailable(books,buses))
				{
					books.add(booking);
				}
				else
				{
					System.out.println("Sorry.Bus is full.Try another Date and Bus");
				}
			}
		}
	}
}
