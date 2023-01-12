package chapter07;

public class ArrayPrint {
	public static void main(String[] args) {
		ArrayPrint array = new ArrayPrint();
		array.printString();
		array.printPrimitiveArray();
	}
	
	public void printString() {
		System.out.println(new String[0]);
		System.out.println(new ArrayPrint[0]);
	}
	
	public void printPrimitiveArray() {
		System.out.println(new byte[0]);
		System.out.println(new short[0]);
		System.out.println(new int[0]);
		System.out.println(new long[0]);
		System.out.println(new float[0]);
		System.out.println(new double[0]);
		System.out.println(new char[0]);
		System.out.println(new boolean[0]);
	}
}
