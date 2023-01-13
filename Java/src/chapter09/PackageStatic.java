package chapter09;

import static chapter09.SubStatic.subStaticMethod;
import static chapter09.SubStatic.CLASS_NAME;

public class PackageStatic {
	public static void main(String[] args) {
		SubStatic.subStaticMethod();
		System.out.println(SubStatic.CLASS_NAME);
		subStaticMethod();
		System.out.println(CLASS_NAME);
	}
}
