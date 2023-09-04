abstract class A {
	abstract void hello();
}

class B extends A {
	void hello() {
		System.out.println("hello");
	}
}

class Test {
	public static void main(String[] args) {
		B b = new B();
		b.hello();
	}
}