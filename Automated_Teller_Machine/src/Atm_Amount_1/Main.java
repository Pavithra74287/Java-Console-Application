package Atm_Amount_1;
import java.util.*;
public class Main 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		Password pass=new Password();
	    int value=3456;
	    boolean c=false;
	    while(!c)
	    {
		  System.out.print("Enter Your Password : ");
		  int b=sc.nextInt();
		  if(value==b)
		  {
			  c=true;
		  }
		  else 
		  {
              System.out.println("Incorrect password. Would you like to try again or change password?");
              System.out.println("1 - Try Again");
              System.out.println("2 - Change Password");
              System.out.print("Enter Your Choice: ");
              int choice = sc.nextInt();
              if(choice==1)
              {
            	  System.out.println("Enter the correct Password...");
            	  continue;
        
               }
              if (choice == 2) 
              {
                  Password.password_change(b);
                  System.out.println("Try logging in again after changing the password.");
                  continue;
              }
		  }
	    }
			System.out.print("Enter Your Name : ");
			String name=sc.next();
			System.out.println("Welcome "+name+"...");
			while(true) 
			{
                System.out.println("Enter:");
                System.out.println("1 - Deposit");
                System.out.println("2 - Withdraw");
                System.out.println("3 - Check Balance");
                System.out.println("4 - Change Password");
                System.out.println("5 - Exit");
                System.out.print("Enter your choice: ");
			    int num=sc.nextInt();
			    if(num==1)
			    {
				  System.out.print("Enter the amount to be Deposited :");
				  Double d=sc.nextDouble();
				  Deposit.deposit_amount(d);
			    }
			    if(num==2)
			    {
				 System.out.print("Enter the amount to be Withdraw : ");
				 Double d=sc.nextDouble();
				 Withdraw.withdraw_amount(d);
		        }
			    if(num==3)
			    {
				  Balance.Check_balance();
			    }
			    if(num==4)
			    {
				  Password.password_change(value);
			    }
			    if(num==5)
			    {
				  System.out.println("Thank You...");
				  break;
			    }
			}
		}
    }