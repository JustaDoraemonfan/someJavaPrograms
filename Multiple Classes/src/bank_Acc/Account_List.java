package bank_Acc;

public class Account_List {
	
	static Open_Account openAcc = new Open_Account();
	
	public static void main(String[] args) {
		openAcc.inputdetails();
		System.out.println(openAcc.generateAccountNo());
	}
}
