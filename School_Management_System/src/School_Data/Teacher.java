package School_Data;
public class Teacher 
{
	private int id;
	private String name;
	private int salary;
	private int  salaryearned;
	
	public  Teacher(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.salaryearned=0;
	}
	public void setsalary(int salary)
	{
		this.salary= salary;
	}
	public int getsalary()
	{
		return salary;
	}
	public String getName()
	{
		return name;
	}
	public void receivesalary(int salary)
	{
		salaryearned+=salary;
		School_Main.updateTotalMoneySpent(salary);
	}
	public String toString()
	{
		return "Teacher Name: "+name+", Total Salary Earned: "+salaryearned;
	}
}