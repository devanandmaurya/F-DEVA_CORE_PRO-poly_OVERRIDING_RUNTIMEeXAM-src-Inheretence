package Inheretence.overrrididng.dk.runtime;
class To{
	void sh() {
		System.out.println("11");
	}
}
public class Xyz extends To {
void sh() {
	System.out.println("22 method ");
}
public static void main(String[] args) {
	To to= new To();
	to.sh();
	System.out.println("_)(*&^%$________");
	Xyz xyz= new Xyz();
	xyz.sh();
}
}
