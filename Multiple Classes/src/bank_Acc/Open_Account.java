package bank_Acc;

import java.util.*;

public class Open_Account {

	Age ageminor = new Age();

	static Open_Account openacc = new Open_Account();

	static Validations validation = new Validations();

	static Scanner sc = new Scanner(System.in);

	String fName;
	String lName;
	String fathersName;
	String Address;
	int statecode;
	String district;
	long pincode;
	long mobile;
	String email;
	long aadhar;
	String pancard;
	static String DOB;
	byte choice;
	int c= 0;
	int a = 0;

	public void inputdetails() {

		System.out.println("* denote Mandatory");
		while (true) {
			System.out.println("First Name *");
			fName = sc.nextLine();
			if (validation.namevalidation(fName)) {
				break;
			} else {
				System.out.println("Maximum length reached...lenght:20 letters");
			}
		}

		while (true) {
			System.out.println("Last Name");
			lName = sc.nextLine();
			if (validation.namevalidation(lName)) {
				break;
			} else {
				System.out.println("Maximum length reached...length:20letters");
			}
		}

		System.out.println("Fathers Name *");
		fathersName = sc.nextLine();

		try {
			while (true) {
				openacc.dateofbirth();
				if (validation.dobvalidation(DOB)) {
					break;
				} else {
					System.out.println("Invalid DOB");
				}
			}
		} catch (Exception e) {
			System.out.println("Something went wrong.....");
			openacc.dateofbirth();
		}

		double age = validation.ageCheck(DOB);
		System.out.println("Your age is - " + (int) age);
		System.out.println("You are Eligible For: ");

		if (age < 18 && age >= 5) {
			System.out.println("Minor Account...");
			c = 9;
			System.out.print("Redirecting.");

			try {
				for (int i = 0; i < 15; i++) {
					System.out.print(".");
					Thread.sleep(200);
				}
				System.out.println();
			} catch (Exception e) {
				e.printStackTrace();
			}
			ageminor.eighteenminus();

		}

		else if (age >= 18 && age < 60) {
			System.out.println("Regular Account...");
			c = 1;
		} else if (age >= 60 && age <= 120) {
			System.out.println("Senior Citizen Account...");
			c = 6;
		} else if (age > 0 && age < 5) {
			System.out.println("Too Minor... Minimum age is 5...");

		} else {
			System.out.println("Please Enter a Valid DOB.....");
			dateofbirth();
		}

		System.out.println("Address *");
		Address = sc.nextLine();
		System.out.println("District *");
		district = sc.nextLine();
		System.out.println("Choose your state from the following:*");

		String[] indianStates = { "1. Andhra Pradesh", "2. Arunachal Pradesh", "3. Assam", "4. Bihar",
				"5. Chhattisgarh", "6. Goa", "7. Gujarat", "8. Haryana", "9. Himachal Pradesh", "10. Jharkhand",
				"11. Karnataka", "12. Kerala", "13. Madhya Pradesh", "14. Maharashtra", "15. Manipur", "16. Meghalaya",
				"17. Mizoram", "18. Nagaland", "19. Odisha", "20. Punjab", "21. Rajasthan", "22. Sikkim",
				"23. Tamil Nadu", "24. Telangana", "25. Tripura", "26. Uttar Pradesh", "27. Uttarakhand",
				"28. West Bengal" };
		for (int i = 0; i < indianStates.length; i++) {
			System.out.println(indianStates[i]);
		}
		try {
		while (true) {
			statecode = sc.nextInt();
			if(statecode<29 && statecode>0) {
				break;
			}
			else {
				System.out.println("Invalid State");
			}
		}
		}catch(Exception e) {
			System.out.println("State does not exists");
			System.out.println("Create a new State");
			openacc.inputdetails();
		}
		
		try {
			while (true) {
				System.out.println("Pincode *");
				pincode = sc.nextLong();
				if (validation.pincodevalidation(pincode)) {
					break;
				} else {
					System.out.println("Invalid Pincode");
				}
			}
		} catch (Exception e) {
			System.out.println("Something went wrong........");
			openacc.inputdetails();
		}
		try {
			while (true) {
				System.out.println("Mobile No *");
				mobile = sc.nextLong();
				if (validation.mobilevalidation(mobile)) {
					break;
				} else {
					System.out.println("Invalid Mobile Number");
				}
			}
		} catch (Exception e) {
			System.out.println("Something went wrong........");
			openacc.inputdetails();
		}
		try {
			while (true) {
				System.out.println("Enter a Email:");
				email = sc.next();
				boolean flag = validation.emailValidation(email);
				System.out.println("Processing....");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (flag == true) {
					System.out.println("Email taken successfully");
					break;
				} else {
					System.out.println("Something is wrong please check your email");
				}
			}
		} catch (Exception e) {
			System.out.println("Something went wrong........");
			openacc.inputdetails();
		}
		try {
			while (true) {
				System.out.println("Aadhar No *");
				aadhar = sc.nextLong();
				if (validation.aadharvalidation(aadhar)) {
					break;
				} else {
					System.out.println("Invalid Aadhar No");
				}
			}
		} catch (Exception e) {
			System.out.println("Something went wrong........");
			openacc.inputdetails();
		}
		try {
			while (true) {
				System.out.println("PAN No *");
				pancard = sc.next();
				if (validation.pancardvalidations(pancard)) {
					break;
				} else {
					System.out.println("Invalid PAN");
				}
			}
		} catch (Exception e) {
			System.out.println("Something went wrong........");
			openacc.inputdetails();
		}

		while (true) {
			System.out.println("Please select Account type..");
			System.out.println("1.Svaings Account");
			System.out.println("2.Current Account");
			choice = sc.nextByte();
			if (choice == 1) {
				a = 3;
			} else if (choice == 2) {
				a = 5;
			}
			if (choice >= 1 && choice <= 2) {
				break;
			} else {
				System.out.println("Invalid Choice");
			}
		}
	}

	public void dateofbirth() {
		System.out.println("DOB (dd/mm/yyyy) *");
		DOB = sc.nextLine();
	}

	public String generateAccountNo() {
		/*
		 * 13 digits. First Digit is 2 Next 2 Bank Code. Next 2 digits state Code Next 2
		 * digits is the "First 2 *numbers* of the PAN Number." Next 1 digit Account
		 * Category (1 for Regular, 6 for Senior, 9 for Minor); Next 1 Digit Account
		 * Type (3 for Savings, 5 for current) Next 4 digits sequential Random Number
		 * Generation
		 */

		// 1
		String firstdigit = "2";
		String bankcode = "15";
		String statecodeinnumber = String.format("%02d", statecode);
		String twodigitpannumber = pancard.substring(5, 7);
		String accountcategory = Integer.toString(c);
		String accountType = Integer.toString(a);
		double b = Math.random();
		String b1 = Double.toString(b);
		b1 = b1.substring(13, 17);
		String randomnumber = b1;

		String accountnumber = firstdigit + bankcode + statecodeinnumber + twodigitpannumber + accountcategory
				+ accountType + randomnumber;
		
		System.out.print("Account Created Successfully :) \n Your Account Number is: ");

		return accountnumber;
	}
}
