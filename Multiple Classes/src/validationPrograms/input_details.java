package validationPrograms;

import java.util.*;

public class input_details {
	private String name;
	private char gender;
	private String height;

	Validations ob1 = new Validations();

	Scanner sc = new Scanner(System.in);

	public void takeInput() {

		System.out.println("Enter Name:");
		name = sc.nextLine();

		while (true) {
			System.out.println("Enter Gender:");
			gender = sc.next().charAt(0);
			gender = Character.toUpperCase(gender);
			boolean flag = ob1.checkgender(gender);
			if (flag == true)
				break;
		}

		while (true) {
			System.out.println("Enter Height:");
			height = sc.next();
			boolean flag = ob1.checkHeight(height);
			if (flag == true)
				break;
		}

	}

	String getname() {
		return name;
	}

	char getgender() {
		return gender;
	}

	String getheight() {
		return height;
	}

}
