package Inheretence.overrrididng.dk.exp;

class Test {
	void show() {
		System.out.println("no exp");
	}
}

public class Expoverrrideex extends Test {
	void show() throws ArithmeticException {
		System.out.println("runtime exception child class");
	}

	public static void main(String[] args) {
		Expoverrrideex test = new Expoverrrideex();
		test.show();
	}
}
