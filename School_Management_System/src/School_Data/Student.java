package School_Data;
public class Student 
{
	private int Studentid;
	private String name;
	private int Grade;
	private int  Feespaid;
	private int Totalfees;
	public  Student(int Studentid,String name,int Grade)
	{
		 this. Totalfees=30000;
		 this.Studentid=Studentid;
	     this.name=name;
		 this.Grade=Grade;
		 this.Feespaid=0;
	}
	public int Getid()
	{
		return Studentid;
	}
	public String GetName()
	{
		return name;
	}
	public int GetGrade()
	{
		return Grade;
	}
	public int GetFeespaid()
	{
		return Feespaid;
	}
	public int GetTotalFees()
	{
		return Totalfees;
	}
	public void setGrade(int grade)
	{
		this.Grade=grade;
	}
	public void PayFees(int fees)
	{
	    Feespaid+=fees;
		School_Main.updateTotalMoneyEarned(Feespaid);
	}
	public int getremainingfees()
	{
		return Totalfees-Feespaid;
	}
	@Override()
	public String toString()
	{
		return "Student Name: "+name+", Total Fees Paid So Far: "+Feespaid;
	}
}