package chap03;

public class GenericClassTester {
	static class GenericClass<T>{
		private T xyz;
		
		GenericClass(T t){
			this.xyz = t;		
		}
		
		T getXyz() {
			return xyz;
		}
	}
	
	public static void main(String[] args) {
		GenericClass<String> x = new GenericClass<String>("east");
		GenericClass<Integer> y = new GenericClass<Integer>(30);
		
		System.out.println(x.getXyz());
		System.out.println(y.getXyz());
	}
}
