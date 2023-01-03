package chap01;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		triangleLB(n);
		System.out.println();
		triangleLU(n);
		System.out.println();
		triangleRU(n);
		System.out.println();
		triangleRB(n);
	}
	
	static void triangleLB(int n) {
		System.out.println("triangleLB");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		System.out.println("triangleLU");
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		System.out.println("triangleRU");
		for(int i=1; i<=n; i++) {
			System.out.print(" ".repeat(i-1));
			for(int j=n; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {
		System.out.println("triangleRB");
		for(int i=1; i<=n; i++) {
			System.out.print(" ".repeat(n-i));
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
