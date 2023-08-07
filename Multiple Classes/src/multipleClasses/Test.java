package multipleClasses;

public class Test extends C {
	public static void main(String[] args) {

		Test ob = new Test();

		A ob1 = new A();
		A ob2 = new A(5, 20);

		B ob3 = new B();

		System.out.println(ob.hashCode());

		System.out.println("Class A " + ob1.x);
		System.out.println("Class A " + ob2.y1);
		ob2.insideA();

		System.out.println("Before Change b = " + ob3.getB());
		ob3.insideB();
		ob3.setB(999);
		System.out.println("After Change b = " + ob3.getB());

		ob.insideC();
		System.out.println("Class C " + ob.c);

		ob.add();
		ob.insideB();
	}

	@Override	//Annotations
	void add() {
		System.out.println(1 + 2 + 3 + 4 + 5);
	}

	void insideB() {
		int c = 5 + 60;
		System.out.println("Sum is " + c);
	}
}