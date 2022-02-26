package COM.DK.SINGLETONECLASS;

public class SingleToneExample {

	private static SingleToneExample snt = null;

	private SingleToneExample() {
		System.out.println("snt class  constructor..");
	}

	private static SingleToneExample getInstanceMethod() {
		if (snt == null) {
		}
		snt = new SingleToneExample();
		System.out.println("This is snt from the annonymouse and values ::  " + snt.hashCode());
		return snt;
	}

	public static void main(String[] args) {
		System.out.println("this is snt class");
		SingleToneExample.getInstanceMethod();
	}
}







