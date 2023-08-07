package multipleClasses;

public class A {
	int a;

	int x, y1;

	A(int x, int y) {
		this.x = x;
		this.y1 = y;
	}

	A() {
		
	}
	
	void insideA(){
		System.out.println("Inside Class A.");
	}
}