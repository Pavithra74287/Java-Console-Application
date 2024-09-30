package Pizza_Order;
import java.util.*;
public class Delux_Pizza extends Pizza
{
	public Delux_Pizza(Boolean veg) 
	{
        super(veg); 
        addExtraCheese();
        addExtraToppings();
        takeAway();
     }
}