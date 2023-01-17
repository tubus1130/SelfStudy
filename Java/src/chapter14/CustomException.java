package chapter14;

public class CustomException {
	public static void main(String[] args) {
		CustomException sample = new CustomException();
		try {
			sample.throwMyException(13);
		}catch(MyException mye) {
			mye.printStackTrace();
		}
	}
	
	public void throwMyException(int number) throws MyException{
		try {
			if(number > 12) {
				throw new MyException("Number is over than 12");
			}
		}catch(MyException e) {
			e.printStackTrace();
		}
	}
	
	public void methodCaller() {
		try {
			methodCallee();
		}catch(Exception e) {
			// 예외처리
		}
	}
	
	public void methodCallee() {
		// RuntimeException 예외 발생 가능성 있는 부분
	}
}
