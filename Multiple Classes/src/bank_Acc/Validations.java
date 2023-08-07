package bank_Acc;

import java.time.LocalDate;
import java.time.Period;

public class Validations {

	static Open_Account openAcc = new Open_Account();

	boolean response = false;

	boolean namevalidation(String name) {

		if (name.length() < 20) {
			response = true;
		}
		return response;
	}

	boolean pincodevalidation(long pincode) {
		response = false;
		String p = Long.toString(pincode);
		if (p.length() == 6) {
			response = true;
		}
		return response;
	}

	boolean mobilevalidation(long mobile) {
		response = false;
		String p = Long.toString(mobile);
		if (p.length() == 10) {
			response = true;
		}
		return response;
	}

	public boolean emailValidation(String email) {
		response = false;
		try {

			String[] dom = { "com", "org", "in", "ai", "co", "uk", "biz" };

			if (email.contains("@")) {
				String middle = email.substring(email.indexOf('@') + 1, email.lastIndexOf('.'));
				if (middle != "") {

					String last = email.substring(email.lastIndexOf('.') + 1);
					for (int i = 0; i < dom.length; i++) {
						if (last.equals(dom[i])) {
							response = true;
							break;
						}
					}

				}
			}
		} catch (Exception e) {
			System.out.println("Something went wrong....");
		}
		return response;

	}

	boolean aadharvalidation(long aadhar) {
		response = false;
		String p = Long.toString(aadhar);
		if (p.length() == 12) {
			response = true;
		}
		return response;
	}

	boolean pancardvalidations(String pancard) {
		response = false;
		int c = 0;
		String letters = pancard.substring(0, 5);
		for (int i = 0; i < letters.length(); i++) {
			if (!Character.isLetter(letters.charAt(i))) {
				c = 1;
				break;
			}
		}
		String digits = pancard.substring(5, 9);
		for (int i = 0; i < digits.length(); i++) {
			if (!Character.isDigit(digits.charAt(i))) {
				c = 1;
				break;
			}
		}
		letters = pancard.substring(9);
		for (int i = 0; i < letters.length(); i++) {
			if (!Character.isLetter(letters.charAt(i))) {
				c = 1;
				break;
			}
		}
		if (c == 0) {
			response = true;
		}
		return response;

	}

	boolean dobvalidation(String DOB) {
		response = false;
		DOB = DOB.trim();
		if (DOB.charAt(2) == '/' && DOB.charAt(5) == '/' && DOB.length() == 10) {
			response = true;
		}
		return response;
	}

	double ageCheck(String DOB) {
		String[] date = DOB.split("/");
		LocalDate userdate = LocalDate.of(Integer.parseInt(date[2]), Integer.parseInt(date[1]),
				Integer.parseInt(date[0]));
		Period difference = Period.between(userdate, LocalDate.now());
		long monthdiff = difference.toTotalMonths();
		double year = monthdiff / 12.0;

		return year;
	}
}
