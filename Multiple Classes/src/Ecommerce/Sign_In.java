package Ecommerce;

import java.util.*;

public class Sign_In {

	static Sign_Up sign_up = new Sign_Up();

	static Sign_In sign_in = new Sign_In();

	private String email;
	private String password;

	void takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email:");
		email = sc.next();
		System.out.println("Enter your Password:");
		password = sc.next();
	}

	void signin() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Something is wrong..");
		}
		takeInput();

		String eamilsignup = sign_up.getEmail();
		String passsignup = sign_up.getpassword();

		if (eamilsignup.equals(email) && passsignup.equals(password)) {
			System.out.print("Sign In successfull!!");
		} else {
			System.out.print("Sign In failed!!");
		}
	}

	String getSignInEmail() {
		return email;
	}

	String getSignInPassword() {
		return password;
	}

}