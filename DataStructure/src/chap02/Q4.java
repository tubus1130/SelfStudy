package chap02;

import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[] copyArr = new int[arr.length];
		copy(copyArr, arr);
		
		System.out.println(Arrays.toString(copyArr));
	}
	
	static void copy(int[] a, int[] b) {
		for(int i=0; i<b.length; i++) {
			a[i] = b[i];
		}
	}
}
