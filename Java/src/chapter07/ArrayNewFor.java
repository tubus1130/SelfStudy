package chapter07;

public class ArrayNewFor {
	public static void main(String[] args) {
		ArrayNewFor array = new ArrayNewFor();
		array.newFor();
		System.out.println("=============");
		array.twoDimFor();
	}
	
	public void newFor() {
		int[] oneDim = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int data : oneDim) {
			System.out.println(data);
		}
	}
	
	public void twoDimFor() {
		int[][] twoDim = {{1,2,3}, {4,5,6}};
		for(int[] dimArray : twoDim) {
			for(int data : dimArray) {
				System.out.println(data);
			}
		}
	}
}
