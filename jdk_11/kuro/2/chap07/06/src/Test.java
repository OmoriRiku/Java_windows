interface A {
	default void hello() {
		System.out.println("hello");
	}
}

class B implements A {
	public void sample() {
		A.super.hello();
		System.out.println("Java");
	}
}

class Test {
	public static void main(String[] args) {
		B b = new B();
		b.sample();
	}
}