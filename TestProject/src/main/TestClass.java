package main;

public class TestClass {
	
	private int numar;
	private String nume;
	
	public TestClass()
	{
		numar = 1;
		nume = "Diana";
	}
	
	public TestClass(int numar, String nume) {
		super();
		this.numar = numar;
		this.nume = nume;
	}
	
	public int getNumar() {
		return numar;
	}
	public void setNumar(int numar) {
		this.numar = numar;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	@Override
	public String toString() {
		return "TestClass [numar=" + numar + ", nume=" + nume + "]";
	}
	
	
	
	

}