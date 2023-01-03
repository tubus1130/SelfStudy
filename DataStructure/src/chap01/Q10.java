package chap01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 10;
		int cnt = 1;
		while(true) {
			if(n / i == 0) {
				break;
			}
			i *= 10;
			cnt++;
		}
		System.out.println(cnt);
	}

}
