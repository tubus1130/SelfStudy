package chapter04;

public class PrimitiveTypes {
	public static void main(String[] args) {
		PrimitiveTypes types = new PrimitiveTypes();
		types.checkByte();
		System.out.println("============");
		types.checkOtherTypes();
		System.out.println("============");
		types.checkChar();
		System.out.println("============");
		types.checkBoolean();
		System.out.println("============");
		types.defaultValues();
	}
	
	public void checkByte() {
		byte byteMin = -128;
		byte byteMax = 127;
		System.out.println(byteMin);
		System.out.println(byteMax);
		
		byteMin = (byte)(byteMin-1);
		byteMax = (byte)(byteMax+1);
		System.out.println(byteMin);
		System.out.println(byteMax);
	}
	
	public void checkOtherTypes() {
		short shortMax = 32767;
		int intMax = 2147483647;
		long longMax = 9223372036854775807L;
		
		shortMax = (short)(shortMax + 1);
		intMax = intMax + 1;
		longMax = longMax + 1;
		System.out.println(shortMax);
		System.out.println(intMax);
		System.out.println(longMax);
	}
	
	public void checkChar() {
		char charMin = '\u0000';
		char charMax = '\uffff';
		System.out.println(charMin);
		System.out.println(charMax);
		int intValue = 'a';
		System.out.println(intValue);
	}
	
	public void checkBoolean() {
		boolean flag = true;
		System.out.println(flag);
		flag = false;
		System.out.println(flag);
	}
	
	int intDefault1;
	public void defaultValues() {
		int intDefault2;
		System.out.println(intDefault1);
//		System.out.println(intDefault2);
	}
}
