package consoleBasedPizzabillingSystem;

public class Pizza {
	//instance variables
	private int price;
	private boolean veg;
	
	private int extraCheesePrice = 100;
	private int extraToppingsPrice = 150;
	private int bagPackPrice = 20;
	
	private int basePizzaPrice;
	
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingsAdded = false;
	private boolean isTakeAwayOpted = false;
	
	//constructor of pizza class 
	public Pizza( boolean veg ) {
		this.veg = veg;
		
		if(this.veg) {
			//for veg
			this.price = 300;
		}else {
			//for non-veg
			this.price =  400;
		}
		
		basePizzaPrice = this.price;
	}
	/****
		*public void getPizzaPrice() {
		*	System.out.println(this.price);
		*}
		*
		****/
	
	public void addExtraChees() {
		this.price += extraCheesePrice;
		isExtraCheeseAdded = true;
	}
	
	public void addExtraToppings() {
		this.price += extraToppingsPrice;
		isExtraToppingsAdded = true;
	}
	
	public void takeAway() {
		this.price += bagPackPrice;
		isTakeAwayOpted = true;
	}
	
	public void getBill() {
		System.out.println("pizza:  " + basePizzaPrice);
		
		if ( isExtraCheeseAdded ) {
			System.out.println("extra cheese: " 
					+ extraCheesePrice );
		}
		if( isExtraToppingsAdded ) {
			System.out.println("extra toppings: "
					+ extraToppingsPrice);
		}
		if( isTakeAwayOpted ) {
			System.out.println("bag pack charge: " 
					+ bagPackPrice);
		}
		
		System.out.println("total price: " + this.price);
	}
}
