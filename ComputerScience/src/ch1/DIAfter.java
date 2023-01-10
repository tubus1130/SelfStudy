package ch1;

import java.util.ArrayList;
import java.util.List;

interface Developer{
	void develop();
}

class BackendDeveloperDI implements Developer{
	public void develop() {
		writeJava();
	}
	public void writeJava() {
		System.out.println("자바로 개발!");
	}
}

class FrontendDeveloperDI implements Developer{
	public void develop() {
		writeJavascript();
	}
	public void writeJavascript() {
		System.out.println("자바스크립트로 개발!");
	}
}


public class DIAfter {
	private final List<Developer> developers;
	
	public DIAfter(List<Developer> developers) {
		this.developers = developers;
	}
	
	public void implement() {
		developers.forEach(Developer::develop);
	}
	
	public static void main(String[] args) {
		List<Developer> dev = new ArrayList<>();
		dev.add(new BackendDeveloperDI());
		dev.add(new FrontendDeveloperDI());
		DIAfter a = new DIAfter(dev);
		a.implement();
	}
}
