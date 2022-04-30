package org.system;

public class Desktop extends Computer { // Single inheritance extending computer class

	// creating method with desktopSize
	public void desktopSize() {

		System.out.println("The Desktop Size is 40*30");
	}

	public static void main(String[] args) {

		// Object creation for Desktop class
		Desktop desktop = new Desktop();
		desktop.computerModel();
		desktop.desktopSize();
	}
}
