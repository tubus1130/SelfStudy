package chap05;

import java.util.Scanner;

public class Q7 {
	static void move(int no, int x, int y) {
		if(no > 1) {
			move(no - 1, x, 6 - x - y);
		}
		System.out.printf("원반 [%d]을 %c기둥에서 %c기둥으로 옮김\n", no, x+64, y+64);
		
		if(no > 1) {
			move(no - 1, 6 - x - y, y);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		System.out.print("원반의 개수 : ");
		int n = sc.nextInt();
		move(n, 1, 3);
	}
}
