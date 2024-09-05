package Bus_Booking_1;
public class Bus 
{
	private int busno;
	private String drivername;
	private int capacity;
	Bus(int no,String name,int cap )
	{
		this.busno=no;
		this.drivername=name;
		this.capacity=cap;
	}
	public int getcapacity()
	{
		return capacity;
	}
	public void setcapacity(int cap1)
	{
		capacity=cap1;
	}
	public String getdrivername()
	{
		return drivername;
	}
	public void setdrivername(String name)
	{
		drivername=name;
	}
	public int getbusno()
	{
		return busno;
	}
	public void displayInfo()
	{
		System.out.println("Busno: "+busno+" Driver name: "+drivername+" Capacity: "+capacity);
	}
}
