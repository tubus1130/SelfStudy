package ch1;

public class FactoryPattern {

	public static void main(String[] args) {
		Coffee latte = CoffeeFactory.getCoffee("Latte", 4000);
		Coffee americano = CoffeeFactory.getCoffee("Americano", 3000);
		System.out.println(latte);
		System.out.println(americano);
	}
}

abstract class Coffee{
	public abstract int getPrice();
	
	public String toString() {
		return "Hi this coffee is " + this.getPrice();
	}
}

class CoffeeFactory{
	public static Coffee getCoffee(String type, int price) {
		if("Latte".equalsIgnoreCase(type)) {
			return new Latte(price);
		}else if("Americano".equalsIgnoreCase(type)) {
			return new Americano(price);
		}else {
			return new DefaultCoffee();
		}
	}
}

class DefaultCoffee extends Coffee{
	private int price;
	
	public DefaultCoffee() {
		this.price = -1;
	}
	@Override
	public int getPrice() {
		return this.price;
	}
}

class Latte extends Coffee{
	private int price;
	
	public Latte(int price) {
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		return this.price;
	}
}

class Americano extends Coffee{
	private int price;
	
	public Americano(int price) {
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		return this.price;
	}
}