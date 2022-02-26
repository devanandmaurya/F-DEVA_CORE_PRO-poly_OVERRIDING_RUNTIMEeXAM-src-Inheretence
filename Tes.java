package com.dkh.inheritence.singlelevel;
class A{
	void show()
	{
		System.out.println("class a show mehod call");
	}
}
public class Tes extends A {
public static void main(String[] args) {
	A a=new A();
	a.show();
}
}
