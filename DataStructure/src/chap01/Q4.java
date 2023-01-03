package chap01;

public class Q4 {

	public static void main(String[] args) {
		System.out.println(med3(3,5,7));
	}
	static int med3(int a, int b, int c) {
		if(a >= b) {
			if(b > c) {
				return b;
			}else if(a > c) {
				return c;
			}else {
				return a;
			}
		}else if(a > c) {
			return a;
		}else if(b > c) {
			return c;
		}else {
			return b;
		}
	}
}
