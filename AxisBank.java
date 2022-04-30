package week3.day1;

public class AxisBank {

	public static void main(String[] args) {

		BankInfo bank = new BankInfo();
		bank.saving();
		bank.fixed();
		bank.deposit();

		AxisBank axis = new AxisBank();
		// Now deposit method will be overriden
		axis.deposit();

	}

	// creating method with name deposit and overriding
	public void deposit() {

		System.out.println("The Deposited amount is 10L");
	}

}
