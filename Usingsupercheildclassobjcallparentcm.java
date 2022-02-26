package Inheretence.overrrididng.dk.exp;

class Testss {
	void show() {
		System.out.println("method test");
	}
}

public class Usingsupercheildclassobjcallparentcm extends Testss {
	void show() {
		super.show(); // SUPER CLASS FOR PARRENT METHOD GOES
		System.out.println("thes b class child");

	}

	public static void main(String[] args) {
		Usingsupercheildclassobjcallparentcm c = new Usingsupercheildclassobjcallparentcm();
		c.show();
//WITH THE HELP OF SUPER WE CAN CALL CHILD CLASS OBJ TO PARENT CLASS METHOD 

	}
}
