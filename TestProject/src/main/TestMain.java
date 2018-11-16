package main;

public class TestMain {

	public static void main(String[] args) {
		
		System.out.println("Hello world! Build successful");
		System.out.println("Un nou commit");
		System.out.println("Commit pe branch 2");
		System.out.println("2");
		System.out.println("Un nou commit");
		System.out.println("Commit pe branch 2");
		System.out.println("3");
		System.out.println("Un nou commit");
		System.out.println("Commit pe branch 2");
		
		TestClass tc = new TestClass();
		tc.setNumar(10);
		tc.setNume("Ioana");
		System.out.println(tc);
	}
}
