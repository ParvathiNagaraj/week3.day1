package week3.day1;

//Used single inheritance and used interfaces
final class Automation extends AutomationParent implements Language, TestTool { // Used Final Keyword

	// declared same method like in interface
	public void java(int id) {

		System.out.println("The ID is " + id);

	}

	// declared same method like in interface
	public void selenium() {

		System.out.println("The test tool is Selenium");
	}

	// declaring new method to use this keyword
	public void course() {

		System.out.println("This is Selenium and Java Course");
	}

	public void keyword() {

		// prints course method in current class
		this.course();

		// prints course method in parent class
		super.course();

	}

	public static void main(String[] args) {
		Automation auto = new Automation();

		// Calls java method
		auto.java(34);

		// Calls selenium method
		auto.selenium();

		// Calls keyword method
		auto.keyword();

	}
}
