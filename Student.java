package org.student;

import org.department.*;

public class Student extends Department { // Multilevel inheritance

	public static void main(String[] args) {

		// object declaration for Student class
		Student student = new Student();
		System.out.println("The first class College");
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		
		System.out.println("=======================================================");

		System.out.println("The Second class Department");
		student.deptName();
		
		System.out.println("=======================================================");

		System.out.println("The Current Class Student");
		student.studentName();
		student.studentId();
		student.studentDept();
	}

	// creating method with studentName
	public void studentName() {

		// printing studentname
		System.out.println("The Student Name is Parvathi Nagaraj");
	}

	// creating method with studentDept
	public void studentDept() {

		// printing student dept
		System.out.println("The Student department is Computer Engineering");

	}

	// creating method with studentId
	public void studentId() {

		// printing studentId
		System.out.println("The Student Id is 2109898");
	}

}
