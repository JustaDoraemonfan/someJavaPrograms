package Ecommerce;

public class Validations {
	/*
	 * email Validation. password validation. phone no validation.
	 */
	static Sign_Up sign_up = new Sign_Up();

	boolean flag = false;

	// email verification
	public boolean emailCheck() {
		try {
			String email = sign_up.getEmail();

			String[] dom = { "com", "org", "in", "ai", "co", "uk", "biz" };

			if (email.contains("@")) {
				String middle = email.substring(email.indexOf('@')+1, email.lastIndexOf('.'));
				if (middle != "") {

					String last = email.substring(email.lastIndexOf('.')+1);
					for (int i = 0; i < dom.length; i++) {
						if (last.equals(dom[i])) {
							flag = true;
							break;
						}
					}

				}
			}
		} catch (Exception e) {
			System.out.println("Something went wrong....");
			sign_up.getInput();
		}
		return flag;

	}

	public boolean passwordCheck() {
		try {
			String password = sign_up.getpassword();
			int c = 0;
			flag = false;

			String[] specialCharacter = { "!", "@", "#", "$", "%", "^", "&", "*", "<", ">", "?" };
			if (password.length() >= 8) { // Length

				for (int i = 65; i <= 90; i++) { // Capital Letter
					if (password.contains(Character.toString((char)i))) {
						c++;
						break;
					}
				}
				for (int j = 97; j <= 122; j++) { // Small Letter
					if (password.contains(Character.toString((char) j))) {
						c++;
						break;
					}
				}

				for (int j = 0; j <= 9; j++) { // Number
					if (password.contains(Integer.toString(j))) {
						c++;
						break;
					}
				}
				for (int i = 0; i < specialCharacter.length; i++) { // Special Character
					if (password.contains(specialCharacter[i])) {
						c++;
						break;
					}
				}

				if (c == 4)
					flag = true;
			}
		} catch (Exception e) {
			System.out.println("Something Went Wrong....");
			sign_up.getInput();
		}

		return flag;
	}

	public boolean phoneNoCheck() {
		try {
			long phone = sign_up.getphone();

			String ph = Long.toString(phone);
			if (ph.length() == 10) {
				flag = true;
			}
		} catch (Exception e) {
			System.out.println("Something Went Wrong....");
			sign_up.getInput();
		}
		return flag;
	}

}
