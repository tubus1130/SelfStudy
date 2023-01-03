package chap01;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		while(true) {
			b = sc.nextInt();
			if(b > a) {
				break;
			}
			System.out.println("a보다 큰 b값을 입력하세요!");
		}
		
		System.out.println(b - a);
	}

}
