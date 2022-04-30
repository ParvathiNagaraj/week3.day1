package week3.day1;

public class Students {

	public static void main(String[] args) {

		// Object declaration for class
		Students students = new Students();

		int id = students.studentInfo(9000);
		System.out.println("The id is " + id);

		Object info = students.studentinfo(9000, "Parvathi");
		System.out.println("The id and Name is " + info);

		Object info1 = students.studentInfo("parudns3333@gmail.com", 992227778);
		System.out.println("The emailid and PhoneNumber is " + info1);

	}

	// creating method with name studentInfo
	public int studentInfo(int id) {

		return id;
	}

	// overloading method with name studentInfo with diffent arguments
	public Object studentinfo(int id, String name) {

		return id + name;

	}

	// overloading method with name studentInfo with diffent arguments
	public Object studentInfo(String emailid, long phoneNumber) {
		return emailid + phoneNumber;
	}
}
