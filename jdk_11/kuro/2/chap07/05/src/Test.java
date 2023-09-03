interface A {
	default void hello() {
		System.out.println("A");
	}
}

class B implements A {
	public void hello() {
		System.out.println("B");
	}
}

class Test {
	public static void main(String[] args) {
		A a = new B();
		a.hello();
	}
}