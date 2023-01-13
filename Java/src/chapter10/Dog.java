package chapter10;


public class Dog extends Animal{
	public Dog() {
		name = "멍멍이";
	}
	public String sound;
	
	public void move() {
		System.out.println("천천히 걷는다.");
	}
	
	public void eatFood() {
		System.out.println("쿰척쿰척");
	}
}
