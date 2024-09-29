package School_Data;
import java.util.*;
public class Main 
{
public static void main(String[] args)
 {
		Teacher Ramya=new Teacher(1,"Ramya",5000);
		Teacher Chandra=new Teacher(2,"Chandra",5000);
		Teacher Sunitha=new Teacher(3,"Sunitha",5000);
		Teacher Sathya=new Teacher(4,"Sathya",5000);
		Teacher Gowri=new Teacher(5,"Gowri",5000);
		
	   List<Teacher> teacherList=new ArrayList<>();
	   teacherList.add(Ramya);
	   teacherList.add(Chandra);
	   teacherList.add(Sunitha);
	   teacherList.add(Sathya);
	   teacherList.add(Gowri);
	   
	   Student Pavithra =new Student(1,"Pavithra",4);
	   Student SathyaPriya=new Student(2,"SathyaPriya",3);
	   Student KarthiKeyan =new Student(3,"KarthiKeyan",2);
	   Student Lavanya=new Student(4,"Lavanya",2);
	   Student Keerthana=new Student(5,"Keerthana",1);
	   
	   List<Student> studentList=new ArrayList<>();
	   studentList.add(Pavithra);
	   studentList.add(SathyaPriya);
	   studentList.add(KarthiKeyan);
	   studentList.add(Lavanya);
	   studentList.add(Keerthana);
	   
	   School_Main SNHSS=new School_Main(teacherList,studentList);
	   Teacher Amutha=new Teacher(6,"Amutha",7000);
	   SNHSS.addTeachers(Amutha);
	   
	   Student Geetha=new Student(6,"Geetha",7);
	   SNHSS.addStudents(Geetha);
	   
	   Pavithra.PayFees(5000);
	   Lavanya.PayFees(17000);
	   
	   System.out.println("SNHSS has earned $"+SNHSS.getTotalMoneyEarned());
	   System.out.println("..........SNHSS Making Salary to Teachers.........");
	   Ramya.receivesalary(Ramya.getsalary());
	   System.out.println("SNHSS spent salary to "+Ramya.getName()+" is "+SNHSS.getTotalMoneyEarned());
	   Sathya.receivesalary(Sathya.getsalary());
	   System.out.println("SNHSS spent salary to "+Sathya.getName()+" is "+SNHSS.getTotalMoneyEarned());
	   System.out.println(Lavanya);
	   System.out.println(Geetha);
	   System.out.println(KarthiKeyan);
	   Sunitha.receivesalary(Sunitha.getsalary());
	   System.out.println(Sunitha);
	   Amutha.receivesalary(Amutha.getsalary());
	   System.out.println(Amutha);
	   System.out.println("Pavithra's Grade is:"+ Pavithra.GetGrade());
 }
}