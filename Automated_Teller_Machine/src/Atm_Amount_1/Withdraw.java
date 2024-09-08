package Atm_Amount_1;
import java.util.*;
public class Withdraw
{
	public static void withdraw_amount(Double amount)
	{
		if(amount<Balance.balance && amount!=0)
		{
			Balance.balance-=amount;
			System.out.println("The amount Rupees "+amount+" is withdraw Successfully");
		}
		else
		{
			System.out.println("Invalid balance...Please Check Your Balance");
		}
	}
	
}
