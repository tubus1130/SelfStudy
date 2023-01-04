package chap02;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num = rand.nextInt(10) + 1;
		System.out.println("사람수 : " + num);
		
		int[] height = new int[num];
		
		for(int i=0; i<num; i++) {
			height[i] = rand.nextInt(90) + 100;
			System.out.println(height[i]);
		}
		System.out.println(maxOf(height));
	}
	
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
}
