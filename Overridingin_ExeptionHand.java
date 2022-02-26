package Inheretence.overrrididng.dk.runtime;

class Test {
//	void show() {
		void show() throws RuntimeException {
		System.out.println("no exp");
	}
}
//same exp tion ho sakta hai 
//twp rulles hota hai
public class Overridingin_ExeptionHand extends Test {
	//void show() throws ArithmeticException {
		void show()  throws RuntimeException{
		System.out.println("runtime exception child class");
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.show();
		System.out.println("_______The overriding methods with the test class______________");
		Overridingin_ExeptionHand v=new Overridingin_ExeptionHand();
		v.show();
	}
}
