package chap03;

import java.util.Scanner;

public class Q4 {
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		int pr = n - 1;
		do {
			int pc = (pl + pr) / 2;
			if(a[pc] == key) {
				return pc;
			}else if(a[pc] > key) {
				pr = pc - 1;
			}else {
				pl = pc + 1;
			}
		}while(pl <= pr);
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소수 : ");
		int num = sc.nextInt(); //요소수
		int[] x = new int[num];
		System.out.print("처음 값 : ");
		x[0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
			}while(x[i-1] > x[i]);
		}
		
		System.out.print("찾고 싶은 값 : ");
		int ky = sc.nextInt();
		
		int idx = binSearch(x, num, ky);
		
		if(idx == -1) {
			System.out.println("요소가 없습니다!");
		}else {
			System.out.println("x[" + idx + "]에 있습니다.");
		}
	}

}
