package Pizza_Order;
import java.util.*;
public class Main 
{
   public static void main(String[] args)
   {
	   Pizza pizza=new Pizza(true);
	   pizza.addExtraToppings();
	   pizza.addExtraCheese();
	   pizza.takeAway();
	   pizza.getBill();
	   
	   Delux_Pizza dp=new Delux_Pizza(true);
	   dp.addExtraToppings();
	   dp.addExtraCheese();
	   dp.takeAway();
	   dp.getBill();
   }
}