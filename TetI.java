package Inheretence.com.constructor;

interface A {
	public void methodA();

	public void me();
}

interface B extends A {
	public void methodB();
}

interface C extends A, B {
	public void methodC();
}

class TetI implements B, C {
	public void methodA() {
		System.out.println("MethodA");
	}

	public void methodB() {
		System.out.println("MethodB");
	}

	public void methodC() {
		System.out.println("MethodC");
	}

	public static void main(String args[]) {
		TetI obj1 = new TetI();
		obj1.methodA();
		obj1.methodB();
		obj1.methodC();
		obj1.me();
	}

	@Override
	public void me() {
		System.out.println(" i am in ME method");
		// TODO Auto-generated method stub

	}
}