package StringAssignment;

public class GarbageCollection {

	String st;

	public GarbageCollection(String st) {
		super();
		this.st = st;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Garbage collected");
	}

	public static void main(String[] args) {

		GarbageCollection gc = new GarbageCollection("jaynam");
		gc = null;
		System.gc();

	}

}
