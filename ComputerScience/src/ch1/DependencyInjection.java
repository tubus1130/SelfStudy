package ch1;

// A가 B에 의존한다.
public class DependencyInjection {
	public static void main(String[] args) {
		new A().go();
	}
}

class A{
	public void go(){
		new B().go();
	}
}

class B{
	public void go(){
		System.out.println("B의 go()함수");
	}
}