package com.dkh.inheretance.multilevels;

//Multilevel level inheritance
class A {
	void showA() {
		System.out.println("this is A class method");
	}
}

public class Bb extends A {
	void showB() {
		System.out.println("this is Bb class method");
	}

	public static void main(String[] args) {
		A a = new A();
//	a.showA();
		System.out.println("----------------");
		Bb bb = new Bb();
		bb.showB();

	}
}
