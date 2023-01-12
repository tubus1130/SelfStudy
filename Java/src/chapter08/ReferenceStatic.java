package chapter08;

public class ReferenceStatic {
	static String name = "Kim";
	
	public static void main(String[] args) {
		ReferenceStatic.staticMethod();
		ReferenceStatic.staticMethodCallVariable();
	}
	
	public static void staticMethod() {
		System.out.println("This is a staticMethod");
	}
	
	public static void staticMethodCallVariable() {
		System.out.println(name);
	}
}
