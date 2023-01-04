package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사람 수 : ");
		int num = sc.nextInt();
		
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
