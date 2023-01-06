package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요!");
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
			}while(x[i-1] > x[i]);
		}
		
		System.out.print("검색 값 : ");
		int ky = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, ky);
		if(idx < 0) {
			System.out.println("삽입포인트 : " + (idx * (-1) - 1) + "번째");
		}else {
			System.out.println("x[" + idx + "]에 있습니다.");
		}
	}
}
