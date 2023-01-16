package chap05;

public class Q4 {
	static void recur2(int n) {
		if(n > 0) {
			recur2(n-2);
			System.out.println(n);
			recur2(n-1);
		}
	}
	public static void main(String[] args) {
		recur2(4);
	}
	
	/* 상향식 분석
	 * r(-1) x
	 * r(0) x
	 * r(1) : r(-1) 1 r(0) = 1
	 * r(2) : r(0) 2 r(1) = 21
	 * r(3) : r(1) 3 r(2) = 1321
	 * r(4) : r(2) 4 r(3) = 2141321
	 */
}
