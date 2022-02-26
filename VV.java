package com.dkh.inheretance.varag;

class AAA {
	void dis() {
		System.out.println("test aaa");
	}

	void dis(int... a) {
		System.out.println("varag m");
	}
}

public class VV extends AAA {
//	void dis(int... a) {
//		System.out.println("varag m");
//	}

//	public static void main(String[] args) {
		 public static void main(String ...arfdkejf) {
		AAA aaa = new AAA();
		aaa.dis();
		aaa.dis(12);
		aaa.dis(10, 43);
		// aaa.dis(12,32,32);
		// aaa.dis(21,43,32);
	}
}
