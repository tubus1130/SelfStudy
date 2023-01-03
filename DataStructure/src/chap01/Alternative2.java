package chap01;

import java.util.Scanner;

public class Alternative2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			n = sc.nextInt();
		}while(n <= 0);
		
		for(int i=0; i<n/2; i++) {
			System.out.print("+-");
		}
		if(n % 2 != 0) {
			System.out.print("+");
		}
	}

}
