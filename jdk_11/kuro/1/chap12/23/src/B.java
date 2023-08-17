public class B extends A {
	@Override
	void sample() {
		System.out.println(10);
	}

	public static void main(String[] args) {
		A a = new B();
		a.sample();
	}
}