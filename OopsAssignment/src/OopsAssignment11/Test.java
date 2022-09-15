package OopsAssignment11;

public class Test {

	public static void main(String[] args) {

		Electronics e1 = new Electronics(1, "silicon", "11022022");
		Electronics e2 = new Mobile(2, "silicon1", "14022022");
		Electronics e3 = new LCD(3, "silicon2", "15022022");
		Electronics e4 = new Laptop(4, "silicon3", "17022022");

		System.out.println("Electronic=" + e1);
		System.out.println("Mobile=" + e2);
		System.out.println("LCD=" + e3);
		System.out.println("Laptop=" + e4);
	}

}
