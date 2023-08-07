package validationPrograms;

public class check_details {

	Validations val = new Validations();

	input_details ob2 = new input_details();

	static check_details ob = new check_details();

	void check() {
		ob2.takeInput();
		String n = ob2.getname();
		char g = ob2.getgender();

		int ft = val.getFt();
		int inch = val.getInch();

		if (g == 'F') {

			if (ft >= 5) {
				ob.display(n, g, ft, inch);
			} else if (ft == 4) {
				if (inch >= 6) {
					ob.display(n, g, ft, inch);
				} else {
					System.out.println("Not Eligible too short");
				}

			} else {
				System.out.println("Not Eligible too short");
			}

		} else if (g == 'M') {
			if (ft >= 6) {
				ob.display(n, g, ft, inch);
			} else if (ft == 5) {
				if (inch >= 2) {
					ob.display(n, g, ft, inch);
				} else {
					System.out.println("Not Eligible too short");
				}
			} else {
				System.out.println("Not Eligible too short");
			}
		}
	}

	void display(String n, char g, int ft, int inch) {
		System.out.println("Name: " + n);
		System.out.println("Gender: " + g);
		System.out.println("Height: " + ft + " ft " + inch + " inch ");
		System.out.print("Eligible");
	}

	public static void main(String[] args) {
		ob.check();
	}
}
