package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
	
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int i = 0;
		int cnt = 0;
		while(true) {
			if(a[i] == key) {
				idx[cnt] = i;
				cnt ++;
			}
			if(i == n-1) {
				break;
			}
			i++;
		}
		return cnt == 0 ? -1 : cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소수 : ");
		int num = sc.nextInt(); //요소수
		int[] x = new int[num];
		int[] idx = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("찾고 싶은 값 : ");
		int ky = sc.nextInt();
		
		int cnt = searchIdx(x, num, ky, idx);
		
		if(cnt == -1) {
			System.out.println("요소가 없습니다!");
		}else {
			System.out.println("총 " + cnt + "개가 있습니다.");
			System.out.println(Arrays.toString(idx));
		}
	}
}
