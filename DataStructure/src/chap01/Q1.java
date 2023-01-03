package chap01;

public class Q1 {

	public static void main(String[] args) {
		System.out.println(max4(4,3,2,1));
	}
	
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}

}
