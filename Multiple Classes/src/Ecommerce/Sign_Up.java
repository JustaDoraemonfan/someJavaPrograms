package Ecommerce;

import java.util.*;

public class Sign_Up {

	Validations valid = new Validations();

	static private String name;
	static private String email;
	static private String password;
	static private long phone;

	void getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Name:");
		name = sc.nextLine();
		while (true) {
			System.out.println("Enter a Email:");
			email = sc.next();
			boolean flag = valid.emailCheck();
			System.out.println("Processing....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (flag == true) {
				System.out.println("Email taken successfully");
				break;
			}
			else {
				System.out.println("Something is wrong please check your email");
			}
		}
		while (true) {
			System.out.println("Enter a Password:");
			password = sc.next();
			boolean flag = valid.passwordCheck();
			System.out.println("Processing....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (flag == true) {
				System.out.println("Password taken successfully");
				break;
			}
			else {
				System.out.println("Something is wrong please check your password");
			}
		}
		while (true) {
			System.out.println("Enter a Phone no:");
			phone = sc.nextLong();
			boolean flag = valid.phoneNoCheck();
			System.out.println("Processing....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (flag == true) {
				System.out.println("Phone no taken successfully");
				break;
			}
			else {
				System.out.println("Something is wrong please check your phone no");
			}
		}

	}

	String getName() {
		return name;
	}

	String getEmail() {
		return email;
	}

	String getpassword() {
		return password;
	}

	long getphone() {
		return phone;
	}

}
