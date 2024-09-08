package Atm_Amount_1;
import java.util.*;
public class Deposit 
{
	public static void deposit_amount(Double amount)
	{
		if(amount>0)
		{
			Balance.balance+=amount;  
			System.out.println("The amount Deposited Successfully");
			
		}
		else
		{
			System.out.println("The Deposited Amount should be greater than Zero");
		}
	}
}