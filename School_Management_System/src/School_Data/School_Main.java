package School_Data;
import java.util.*;
public class School_Main 
{
		private List<Teacher> teachers;
		private List<Student>students;
		private static int totalmoneyearned;
		private static int totalmoneyspent;

		public School_Main(List<Teacher> teachers,List<Student>students)
		{
			this.teachers=teachers;
			this.students=students;
			totalmoneyearned=0;
			totalmoneyspent=0;
		}
		public List<Teacher> getTeachers()
		{
			return teachers;
		}
		public void  addTeachers(Teacher teacher)
		{
			teachers.add(teacher);
		}
		public List<Student> getStudents()
		{
			return students;
		}
		public void  addStudents(Student student)
		{
			students.add(student);
		}
		public int getTotalMoneyEarned()
		{
			return totalmoneyearned;
		}
		public static void updateTotalMoneyEarned(int Moneyearned)
		{
			totalmoneyearned+=Moneyearned;
		}
		public int getTotalMoneySoent()
		{
			return totalmoneyspent;
		}
		public static void updateTotalMoneySpent(int Moneyspent)
		{
			totalmoneyearned-=Moneyspent;
		}
}