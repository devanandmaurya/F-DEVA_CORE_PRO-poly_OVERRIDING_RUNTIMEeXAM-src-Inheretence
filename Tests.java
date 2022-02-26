package com.dkh.inheritence.typepermotion;

class Ac {
	void show(int a, float b) {
		System.out.println(" int float  class m");
	}

	void show(String a, float b) {
		System.out.println("String float  class m");
	}
}

public class Tests extends Ac {
	public static void main(String[] args) {
		Ac c = new Ac();
		c.show(12, 123.65f);
		c.show("deva:", 323.6f);
	}
}
