package chapter07;

public class ManageHeight {
	int[][] gradeHeights;
	
	public static void main(String[] args) {
		ManageHeight height = new ManageHeight();
		height.setData();
//		for(int i=0; i<5; i++) {
//			System.out.println("Class No.:" + (i+1));
//			height.printHeight(i);
//		}
		int j = 0;
		while(j < 5) {
			System.out.println("Class No.:" + (j+1));
			height.printAverage(j);
			j++;
		}
		
	}
	
	public void setData() {
		gradeHeights = new int[5][];
		gradeHeights[0] = new int[] {170, 180, 173, 175, 177};
		gradeHeights[1] = new int[] {160, 165, 167, 186};
		gradeHeights[2] = new int[] {158, 177, 187, 176};
		gradeHeights[3] = new int[] {173, 182, 181};
		gradeHeights[4] = new int[] {170, 180, 165, 177, 172};
	}
	
	public void printHeight(int classNo) {
		for(int height : gradeHeights[classNo]) {
			System.out.println(height);
		}
	}
	
	public void printAverage(int classNo) {
		double sum = 0.0;
		for(int height : gradeHeights[classNo]) {
			sum += height;
		}
		double average = sum / gradeHeights[classNo].length;
		System.out.println(average);
	}
}
