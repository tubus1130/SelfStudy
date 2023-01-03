package chap01;

import java.util.Scanner;

public class PrintStars1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, w;
		
		do {
			n = sc.nextInt();
		}while(n <= 0);
		
		do {
			w = sc.nextInt();
		}while(w <= 0 || w > n);
		
		for(int i=0; i<n; i++) {
			System.out.print("*");
			if(i % w == w - 1) {
				System.out.println();
			}
		}
		if(n % w != 0) {
			System.out.println();
		}
	}
}
