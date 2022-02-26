package Inheretence.overrrididng.dk.exp;


interface Tbs{
	void disp();
}
abstract class A{
	abstract void dis();
	void show() {
		System.out.println("abstract class normal method show ()");
	}
}
	public class AbstractOvrrideExa extends A  implements Tbs{
	@Override
	public void dis() {
	System.out.println("abstrat class overide method");
	}
void show() {
	System.out.println("main class show method");
}
public static void main(String[] args) {

	AbstractOvrrideExa a=new AbstractOvrrideExa();
	a.dis();
	a.show();
	a.disp();
}
@Override
public void disp() {
System.out.println("interface method call here");	
}

}
