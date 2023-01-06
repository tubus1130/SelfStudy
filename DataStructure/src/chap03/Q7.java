package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q7 {
	static class PhyscData{
		private String name;
		private int height;
		private int age;
		
		public PhyscData(String name, int height, int age) {
			this.name = name;
			this.height = height;
			this.age = age;
		}

		@Override
		public String toString() {
			return name + " " + height + " " + age;
		}
		
		public static final Comparator<PhyscData> AGE_ORDER = new AgeOrderComparator();
		
		private static class AgeOrderComparator implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.age < d2.age) ? 1 : (d1.age > d2.age) ? -1 : 0; 
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("권은비", 159, 29),
				new PhyscData("최예나", 162, 25),
				new PhyscData("김채원", 163, 24),
				new PhyscData("김민주", 164, 23),
				new PhyscData("나코", 150, 23),
				new PhyscData("조유리", 162, 23),
				new PhyscData("장원영", 173, 20)
		};
		System.out.print("몇살인 사람을 찾고있나요? : ");
		int age = sc.nextInt();
		int idx = Arrays.binarySearch(x, new PhyscData("", 0, age), PhyscData.AGE_ORDER);
		
		if(idx < 0) {
			System.out.println("요소가 없습니다.");
		}else {
			System.out.println(idx);
			System.out.println("찾은 데이터 : " + x[idx]);
		}
	}
}
