package Inheretence.com.constructor;
//without parameter construtor
/*
public class classwithoutparacon {
	classwithoutparacon(){
		System.out.println("con call");
	}
public static void main(String[] args) {
	classwithoutparacon c=new classwithoutparacon();
	System.out.println("the constructor used for object intilalization and new keyword use for object creation ");
}
}
*/


public class classwithoutparacon {
	 String name;
	classwithoutparacon(String name){
		this .name=name;
		System.out.println("The name is of you ::"+name);
	}
public static void main(String[] args) {
	classwithoutparacon c=new classwithoutparacon("dev maurya");
	
	System.out.println("the constructor used for objrect intilalization and new keyword use for object creation ");
}
}
