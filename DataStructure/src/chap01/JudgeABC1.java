package chap01;

import java.util.Scanner;

public class JudgeABC1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n == 1) {
			System.out.println("A");
		}else if(n == 2) {
			System.out.println("B");
		}else{
			System.out.println("C");
		}
	}
	
}
