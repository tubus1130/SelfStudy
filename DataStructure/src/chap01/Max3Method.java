package chap01;

public class Max3Method {

	public static void main(String[] args) {
		System.out.println(max3(1,2,3));
	}
	
	static int max3(int a, int b, int c) {
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		return max;
	}
}
