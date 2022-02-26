package Inheretence.overrrididng.dk.runtime;


/*
class Too{
	void sh(String a) {
		System.out.println("11");
	}
}
public class ByType extends Too {
void sh(String a) {
	System.out.println("22 method ");
}
public static void main(String[] args) {
	Too tt= new Too();
	tt.sh("dev");
	System.out.println("+++++++++++++++");
	ByType xy= new ByType();
	xy.sh();
}
}
*/


/*
class Too{
	void sh(String a,int c) {
		System.out.println("string and int");
	}
}
public class ByType extends Too {
void sh(String a,int b) {
	System.out.println("22string int ");
}
public static void main(String[] args) {
	Too tt= new Too();
	tt.sh("dev",12);
	System.out.println("++++++++++++ by sequence +++++++");
	ByType xy= new ByType();
	xy.sh("raj", 76);

}
}
*///overriding method must have same or subclass


class Too{
	Object sh(String a,int c) {
		System.out.println("string and int");
		return null;
	}
}
public class ByType extends Too {
String sh(String a,int b) {
	System.out.println("22 This is the  methods of string int string int ");
	return null;
}
public static void main(String[] args) {
	Too tt= new Too();
	tt.sh("dev",12);
	tt.sh("ffg", 43);
	System.out.println("do we need overrid method must have same"
			+ "as sub class");
	ByType xy= new ByType();
	xy.sh("raj", 76);
System.out.println("1.4 ke bad coverient aaya so no need");
}
}
