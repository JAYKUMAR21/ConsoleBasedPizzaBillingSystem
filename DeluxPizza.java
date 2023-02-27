package consoleBasedPizzabillingSystem;

public class DeluxPizza extends Pizza {

	public DeluxPizza(boolean veg) {
		super(veg);
		super.addExtraChees();
		super.addExtraToppings();
	}
}
