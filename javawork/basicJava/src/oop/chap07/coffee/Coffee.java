package oop.chap07.coffee;

public class Coffee extends Beverage {
	static int amount;
	
	public Coffee() {
	}
	public Coffee(String name) {
		super(name);
		amount += 1;
		calcPrice();
	}

	public void calcPrice() {
		if(getName().equals("Americano"))
		{
			price = 1500;
		}
		else if(getName().equals("CafeLatte"))
		{
			price = 2500;
		}
		else if(getName().equals("Cappuccino"))
		{
			price = 3000;
		}
	}
}
