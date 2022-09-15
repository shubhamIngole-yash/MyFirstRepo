package OopsAssignment5;

public abstract class B extends A {
	
	@Override
	void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
	}
	
	abstract void mul(int a, int b);
	abstract void div(int a,int b);

}
