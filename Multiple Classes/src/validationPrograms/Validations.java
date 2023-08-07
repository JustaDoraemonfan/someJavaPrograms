package validationPrograms;

public class Validations {

	static input_details input_details = new input_details();

	private static int originalInch, originalFt;

	boolean checkgender(char gender) {
		if (gender == 'M' || gender == 'F')
			return true;
		else {
			System.out.println("Gender should be M or F!!!!");
			return false;
		}
	}

	boolean checkHeight(String height) {
		try {
			if (height.contains(".")) {
				int temp = height.indexOf('.');
				originalFt = Integer.valueOf(height.substring(0, temp));
				originalInch = Integer.valueOf(height.substring(temp + 1));

			} else {
				originalFt = Integer.valueOf(height);
				originalInch = 0;
			}
		} catch (Exception e) {
			System.out.println("Something is wrong with you!!");
			input_details.takeInput();
		}

		if (originalInch > 11) {
			System.out.println("Height is invalaid please look forward to take maths class ");
			return false;
		} else {
			return true;
		}
	}

	int getFt() {
		return originalFt;
	}

	int getInch() {
		return originalInch;
	}
}