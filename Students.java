package week3.day1;

public class Students {

	public static void main(String[] args) {

		// Object declaration for class
		Students students = new Students();

		students.studentInfo(9000);
		students.studentinfo(9000, "Parvathi");
		students.studentInfo("parudns3333@gmail.com", 992227778);

	}

	// creating method with name studentInfo
	public void studentInfo(int id) {

		System.out.println("The id is " + id);
	}

	// overloading method with name studentInfo with diffent arguments
	public void studentinfo(int id, String name) {

		System.out.println("The id and Name is " + id + " and " + name);

	}

	// overloading method with name studentInfo with diffent arguments
	public void studentInfo(String emailid, long phoneNumber) {
		System.out.println("The emailid and PhoneNumber is " + emailid + " and " + phoneNumber);
	}
}
