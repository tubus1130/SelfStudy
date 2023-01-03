package chap01;

public class Q8 {

	public static void main(String[] args) {
		System.out.println(sumof(3, 5));
		System.out.println(sumof(6, 4));
	}
	
	static int sumof(int a, int b) {
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		int sum = 0;
		
		for(int i = a; i<=b; i++) {
			sum += i;
		}
		return sum;
	}
}
