package chap02;

import java.util.Arrays;

public class Q2 {
	public static void main(String[] args) {
		int[] arr = {2, 5, 1, 3, 9, 6, 7};
		reverse(arr);
	}
	
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	static void reverse(int[] arr) {
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length/2; i++) {
			swap(arr, i, arr.length-i-1);
			System.out.println("a[" + i + "]과 a[" + (arr.length-i-1) + "]를 교환합니다.");
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("역순 정렬을 마쳣습니다.");
	}
}
