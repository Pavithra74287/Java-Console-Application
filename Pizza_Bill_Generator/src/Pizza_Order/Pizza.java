package Pizza_Order;
import java.util.*;
public class Pizza
{
	private int price;
	private Boolean veg;
	
	private int extraCheesePrice=100;
	private int extraToppingPrice=150;
	private int backPack=50;
	
	private int basepizzaprice;
	
	private boolean isextraCheeseadded=false;;
	private boolean isextraToppingadded=false;;
	private boolean istakeaway=false;;
	public Pizza(Boolean veg)
	{
		this.veg=veg;
		if(this.veg)
		{
			this.price=300;
		}
		else
		{
			this.price=400;
			
		}
		basepizzaprice=this.price;
	}
	public void addExtraCheese()
	{
		isextraCheeseadded=true; 
		this.price+=extraCheesePrice;
	}
	public void addExtraToppings()
	{
		isextraToppingadded=true;
		this.price+=extraToppingPrice;
	}
	public void takeAway()
	{
		istakeaway=true;
		this.price+=backPack;
	}
	public void getBill()
	{
		String bill="";
	    System.out.println("Pizza: "+basepizzaprice);
		if(isextraCheeseadded)
		{
			bill+="Extra Cheese Added: "+extraCheesePrice+ "\n";
		}
		if(isextraToppingadded)
		{
			bill+="Extra Toppings Added: "+extraToppingPrice+ "\n";
		}
		if(istakeaway)
		{
			istakeaway=true;
			bill+="Take Away: "+backPack+ "\n";
		}
		bill+="Bill:"+this.price +"\n";
		System.out.println(bill);
	}
}