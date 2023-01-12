package ch1;

import java.util.ArrayList;
import java.util.List;

interface PaymentStrategy{
	public void pay(int amount);
}

class KAKAOCardStrategy implements PaymentStrategy{
	private String name;
	private String cardNumber;
	private String csv;
	private String dateOfExpiry;
	
	public KAKAOCardStrategy(String name, String cardNumber, String csv, String dateOfExpiry) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.csv = csv;
		this.dateOfExpiry = dateOfExpiry;
	}
	
	public void pay(int amount) {
		System.out.println(amount + " paid using KAKAOCard");
	}
}

class NAVERCardStrategy implements PaymentStrategy{
	private String emailId;
	private String password;
	
	public NAVERCardStrategy(String emailId, String password) {
		this.emailId = emailId;
		this.password = password;
	}
	
	public void pay(int amount) {
		System.out.println(amount + " paid using NAVERCard");
	}
}

class Item{
	private String name;
	private int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
}

class ShoppingCart{
	List<Item> items;
	
	public ShoppingCart() {
		this.items = new ArrayList<Item>();
	}
	
	public void addItem(Item item){
		this.items.add(item);
	}
	
	public void removeItem(Item item) {
		this.items.remove(item);
	}
	
	public int calculateTotal() {
		int sum = 0;
		for(Item item : items) {
			sum += item.getPrice();
		}
		return sum;
	}
	
	public void pay(PaymentStrategy paymentMethod) {
		int amount = calculateTotal();
		paymentMethod.pay(amount);
	}
}

public class StrategyPattern {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item A = new Item("item1", 1000);
		Item B = new Item("item2", 2000);
		cart.addItem(A);
		cart.addItem(B);
		
		cart.pay(new KAKAOCardStrategy("Kim", "1234-5678-9012-3456", "123", "2023-01-12"));
		cart.pay(new NAVERCardStrategy("kim@gmail.com", "1234"));
	}
	
}
