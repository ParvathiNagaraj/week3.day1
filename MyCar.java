package week3.day1;

public class MyCar {

	public static void main(String[] args) {

		Vehicle method1 = new Vehicle();
		Car method2 = new Car();
		BMW method3 = new BMW();

		System.out.println("The GrandParent Class=========================");
		method1.applyBrake();
		method1.soundHorn();

		System.out.println("The Parent Class=========================");
		method2.applyBrake();
		method2.soundHorn();
		method2.handBrake();
		method2.turnAC();

		System.out.println("The Child Class=========================");
		method3.applyBrake();
		method3.soundHorn();
		method3.handBrake();
		method3.turnAC();
		method3.autoPark();
	}

}
