package Ecommerce;

import java.util.Scanner;

public class Master_website {

	Sign_Up sign_up = new Sign_Up();

	Sign_In sign_in = new Sign_In();
	
	Mode_of_Payment payment =new Mode_of_Payment();

	static Master_website ob = new Master_website();

	Scanner sc = new Scanner(System.in);

	boolean isSignedUp;

	void check() {
		System.out.println("1.Sign Up");
		System.out.println("2.Sign In");
		int choice = sc.nextInt();
		if (choice == 1) {
			sign_up.getInput();
			isSignedUp = true;
			System.out.println("Taking you to the sign in page...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Something is wrong..");
			}
			sign_in.signin();

		} else if (choice == 2) {
			if (isSignedUp) {
				sign_in.signin();
			} else {
				System.out.println("Details not found..");
				ob.check();
			}
		}
	}
	void paymentDetails() {
		System.out.println("Redirecting you to the payement page...");
		payment.netBanking();
	}

	public static void main(String[] args) {
		ob.check();
		ob.paymentDetails();
	}
}
