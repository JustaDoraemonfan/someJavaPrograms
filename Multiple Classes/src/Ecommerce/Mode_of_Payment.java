package Ecommerce;

import bank_Acc.Open_Account;
import java.util.*;

public class Mode_of_Payment {

	Open_Account open_acc = new Open_Account();

	boolean COD;
	boolean Card;
	boolean UPI;
	boolean NetBanking;
	boolean eWallet;
	int choice;

	public void netBanking() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose from the list below");
		System.out.println("1. Already have a bank account:");
		System.out.println("2. Need to create a bank account:");
		int choice = sc.nextInt();
		if (choice == 2) {
			System.out.print("Redirecting you to an Autorised Banking Portal ..");

			try {
				for (int i = 0; i < 15; i++) {
					System.out.print(".");
					Thread.sleep(500);
				}
				System.out.println();
			} catch (Exception e) {
				e.printStackTrace();
			}
			open_acc.inputdetails();
		}
	}
}
