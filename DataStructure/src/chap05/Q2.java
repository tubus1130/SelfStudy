package chap05;

import java.util.Scanner;

public class Q2 {
	static int gcd(int x, int y) {
		if(y == 0) {
			return x;
		}
		while(true) {
			if((x % y) == 0 || (y % x) == 0) {
				return x > y ? y : x;
			}
			if(x >= y) {
				x = x % y;
			}else {
				y = y % x;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("두 수의 최대공약수를 구합니다.");

		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int y = sc.nextInt();
		System.out.println("최대 공약수는 : " + gcd(x, y) + "입니다.");
	}
	
	
}
