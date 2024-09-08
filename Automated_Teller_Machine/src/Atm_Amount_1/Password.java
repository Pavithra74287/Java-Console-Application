package Atm_Amount_1;
import java.util.*;
public class Password 
{
 public static void password_check(int a)
 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Your Password is Incorrect...Please Check Your Password");
		System.out.println("Forget Password Yes or No");
		String s=sc.nextLine();
		if(s.equals("Yes"))
		{
			System.out.print("Enter Your Mobile Number : ");
			long mble=sc.nextLong();
			System.out.print("Enter Your Six Digit OTP : ");
			int k=sc.nextInt();
			String s1=Integer.toString(k);
			if(s1.length()==6)
			{
				System.out.print("Enter the New Password : ");
				int p=sc.nextInt();
				System.out.println("Your Password is Changed Successfully");
			}
			else
			{
				System.out.println("Invalid OTP");
			}
		}
		else
		{
			System.out.println("Enter the correct password");
		}
 }
		
	public static void password_change(int a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Old Password : ");
		int k=sc.nextInt();
		if(k==a)
		{
		  System.out.print("Enter a New Password : ");
		  int pin=sc.nextInt();
		  System.out.println("Your Password was Changed Successfully");
		}
		else
		{
		  System.out.println("Enter the correct password");
		}
	 }
}