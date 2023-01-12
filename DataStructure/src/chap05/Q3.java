package chap05;

import java.util.Scanner;

public class Q3 {
	public static int gcdArray(int[] a) {
		int first = a[0];
		for(int i=1; i<a.length; i++) {
			first = gcd(first, a[i]);
		}
		return first;
	}
	
	static int gcd(int x, int y) {
		if(y == 0) {
			return x;
		}else {
			return gcd(y, x%y);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("다음 배열의 최대공약수를 구합니다.");
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int x = sc.nextInt();
		int[] arr = new int[x];
		for(int i=0; i<x; i++) {
			System.out.print("정수를 입력하세요 : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("최대 공약수는 : " + gcdArray(arr) + "입니다.");
	}
}
