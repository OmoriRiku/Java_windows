public class B extends A {
	protected B() {
		this(4);
		System.out.print("3");
	}
	protected B(int b) {
		System.out.print(b);
	}
}