package chapter13;

public class FinalVariable {
	final int instanceVariable = 1;
	
	public void method(final int parameter) {
		final int localvariable;
		localvariable = 2;
//		localvariable = 3;
//		parameter = 4;
	}
}
