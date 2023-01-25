package chap01;

public class Q5 {
	public static void main(String[] args) {
		med3(1,2,3);
		/*
		 * 중앙값을 구하는 메서드는 다음과 같이 작성할 수도 있습니다.
		 * Median.java의 med3메소드에 비해 효율이 떨어지는데 그 이유를 설명하시오.
		 * 
		 * b>=a 와 b<=a 실질적으로 동일한 판단이다. 처음 if가 성립하지 않으면
		 * 2번째 if에서도 같은 판단을 수행하므로 효율이 나빠진다.
		 */
	}
	
	static int med3(int a, int b, int c) {
		if((b >= a && c <= a) || (b <= a && c >= a)) {
			return a;
		}else if((a > b && c < b) || (a < b && c > b)) {
			return b;
		}
		return c;
	}
}
