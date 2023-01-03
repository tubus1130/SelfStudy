package chap01;

import java.util.Scanner;

public class TwoDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int no;
		
		do {
			no = sc.nextInt();
		}while(no < 10 || no > 100);
		
		System.out.println(no);
	}

}
