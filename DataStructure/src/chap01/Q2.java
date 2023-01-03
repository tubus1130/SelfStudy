package chap01;

public class Q2 {

	public static void main(String[] args) {
		System.out.println(min3(1,2,3));
	}
	
	static int min3(int a, int b, int c) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		
		return min;
	}
}
