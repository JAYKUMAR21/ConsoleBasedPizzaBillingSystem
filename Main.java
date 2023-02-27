package consoleBasedPizzabillingSystem;

public class Main {
	public static void main(String []args) {
//		Pizza pizzaBase = new Pizza(false);
//		pizzaBase.addExtraChees();
//		pizzaBase.addExtraToppings();
//		pizzaBase.takeAway();
//		pizzaBase.getBill();
		
		
		DeluxPizza dp = new DeluxPizza(true);
		
		dp.getBill();
	}
}
