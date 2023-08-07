package bank_Acc;

import java.util.*;

public class Age {
	String guardian;
	byte choice;
	String relationship;
	double withdraw;
	double deposit;

	public void eighteenminus() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String[] relation = { "Mother", "Father", "Brother", "Sister", "Grand Parent", "Uncle", "Aunt", "Other" };
		System.out.println("Enter your Guardian's name:");
		guardian = sc.nextLine();
		System.out.println("Your relation with the above person:");
		for (int i = 0; i < relation.length; i++) {
			System.out.println((i + 1) + ". " + relation[i]);
		}

		while (true) {
			choice = sc.nextByte();

			if (choice == 8) {
				System.out.println("Please Specify Relationship....");
				relationship = sc.next();
				break;
			} else if (choice > 0 && choice < 8) {
				relationship = relation[choice - 1];
				break;
			} else {
				System.out.println("Invalid Choice Please Consider Re-Entering.........");
			}

			System.out.println(relationship);

		}
		System.out.println("You have to set a withdrawal limit..");
		withdraw = sc.nextDouble();
		System.out.println("You have to set a deposit limit..");
		deposit = sc.nextDouble();

	}
}
