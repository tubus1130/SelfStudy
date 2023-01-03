package chap01;

import java.util.Scanner;

public class SumVerbose1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			n = sc.nextInt();
		}while(n <= 0);
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			if(i < n) {
				System.out.print(i + " + ");
			}else {
				System.out.print(i + " = ");
			}
			sum += i;
		}
		System.out.print(sum);
	}

}
