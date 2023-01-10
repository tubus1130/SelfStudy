package ch1;

class BackendDeveloper{
	public void writeJava() {
		System.out.println("자바 오케이~");
	}
}

class FrontendDeveloper{
	public void writeJavascript() {
		System.out.println("자바스크립트 오케이~");
	}
}

public class DIBefore {
	private final BackendDeveloper backendDeveloper;
	private final FrontendDeveloper frontendDeveloper;
	
	public DIBefore(BackendDeveloper backendDeveloper, FrontendDeveloper frontendDeveloper) {
		this.backendDeveloper = backendDeveloper;
		this.frontendDeveloper = frontendDeveloper;
	}
	
	public void implement() {
		backendDeveloper.writeJava();
		frontendDeveloper.writeJavascript();
	}
	
	public static void main(String[] args) {
		DIBefore a = new DIBefore(new BackendDeveloper(), new FrontendDeveloper());
		a.implement();
	}
}
