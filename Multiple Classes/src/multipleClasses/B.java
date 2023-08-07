package multipleClasses;

public class B {
	
	private int b = 100;
	
	void insideB(){
		System.out.println("Inside Class B.");
	}
	
	int getB() {
		return b;
	}
	void setB(int b) {
		this.b = b;
	}
}