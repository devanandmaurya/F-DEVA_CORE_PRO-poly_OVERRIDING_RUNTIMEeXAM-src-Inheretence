package Inheretence.overrrididng.dk.exp;
/*class Testsst {
	 //final void show() {
		//static  void show() {
	// private  void show() { //private acces bility  with in class 
		 // so child class method is not override
	void show() {
	System.out.println("method test");
	}
}

public class Oerridwithfinalaccessmodifier extends Testsst {
	void show() {//error OVERRIDEN METHOD IS FINAL
		//void show() { //overriden method is static  error
//	super.show(); //SUPER CLASS FOR PARRENT METHOD GOES 
		System.out.println("this b class child");

	}

	public static void main(String[] args) {
		Oerridwithfinalaccessmodifier c = new Oerridwithfinalaccessmodifier();
		c.show();
//WITH THE HELP OF SUPER WE CAN CALL CHILD CLASS OBJ TO PARENT CLASS METHOD 
		
	} 
}
*/


//synchronized ,strictfp KISI ME BHI CHILD YA PARRENT METHOD PAR LAGANAE
//PAR KOI FARK NHI PADTTA HAI 
class Testsst {
	strictfp void show() {
		// synchronized void show() {
		System.out.println("method test");
	}
}

public class Oerridwithfinalaccessmodifier extends Testsst {

	// synchronized void show() {
	// void show() {
	strictfp void show() {
		super.show(); // SUPER CLASS FOR PARRENT METHOD GOES
		System.out.println("this b class child");

	}

	public static void main(String[] args) {
		Oerridwithfinalaccessmodifier c = new Oerridwithfinalaccessmodifier();
		c.show();

	}
}
