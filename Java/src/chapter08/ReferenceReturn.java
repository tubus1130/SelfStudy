package chapter08;

public class ReferenceReturn {
	public static void main(String[] args) {
		ReferenceReturn reference = new ReferenceReturn();
		System.out.println(reference.intReturn());
		System.out.println(reference.intArrayReturn());
		System.out.println(reference.stringReturn());
	}
	
	public int intReturn() {
		int returnInt = 0;
		return returnInt;
	}
	
	public int[] intArrayReturn() {
		int[] returnArray = new int[10];
		return returnArray;
	}
	
	public String stringReturn() {
		String returnString = "Return value";
		return returnString;
	}
	
	public int calculateAfterIntReturn() {
		int returnInt = 0;
		return returnInt;
//		returnInt++;
	}
	
	public int ifConditionIntReturn() {
		int returnInt = 0;
		if(returnInt == 0) {
			return ++returnInt;
		}else {
			return --returnInt;
		}
	}
	
	public int ifConditionNoElseIntReturn() {
		int returnInt = 0;
		if(returnInt == 0) {
			return ++returnInt;
		}
		return --returnInt;
	}
}
