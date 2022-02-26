package Inheretence.com.constructor;
//Multilevel Inheritance example program in Java
class Grundparent {
	public void grdmethod1() {
		System.out.println("I am graued parent method1");
	}

}

class Parent extends Grundparent {
	public void pmethod2() {
		System.out.println("I am parent metod2");
	}
}

public class Childl extends Parent {

	public void childmethod3() {
		System.out.println("I am child method3");
	}

	public static void main(String[] args) {
		Childl c = new Childl();
		c.grdmethod1();
		c.pmethod2();
		c.childmethod3();
	}
}
