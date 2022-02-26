package com.dkh.inheretance.Multilevel.autopermotion;


/*class Re{
	void sd(int a) {
		System.out.println("rr 1 class");
	}
}
public class Tess extends Re {
void sd(String b) {
	System.out.println("test se ");

}
public static void main(String[] args) {
	Tess t= new Tess();
	t.sd("dev");
	System.out.println("++++++++");
	Re re= new Re();
	re.sd('A');  //char to int type promotion
	
}
}
*/


/*class Re{
	void sd(Object a) {
		System.out.println("rr 1 class");
	}
}
public class Tess extends Re {
void sd(float b) {
	System.out.println("test se ");

}
public static void main(String[] args) {
	Tess t= new Tess();
	t.sd("dev");
	System.out.println("++++++++");
	Re re= new Re();
	re.sd('A');  //char to int type promotion
	
}
}*/


class Re{
	void sd(StringBuffer a) {
		System.out.println("rr 1 class");
	}
	void sd(String b) {
		System.out.println("test se ");

	}
}
public class Tess extends Re {
	
public static void main(String[] args) {	Tess t= new Tess();
    t.sd("dev");
    System.out.println("Test class values of t :: "+ t.hashCode());
	System.out.println("===============================");
	Re re= new Re();
re.sd(new StringBuffer("devanand"));  //char to int type promotion
	//re.sd(null);
}
}
