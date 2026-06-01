
public class Order {
	public static void main(String args[])
	{
		FoodOrder o=new FoodOrder();
		o.OrderPizza(100, 2);
		o.OrderBurger(150, 2,"chiken");
		
		
	}

}class FoodOrder{
	void OrderPizza(int cost,int quantity)
	{
		System.out.println("cost of pizza "+cost+", "+quantity);
	}
	void OrderBurger(int cost,int quantity,String type)
	{
		System.out.println("cost of Burger "+cost+", "+quantity+", "+type);
	}
}

