class A {
	void test() {
		System.out.println("hello");
	}
}

class B extends A {
	void test() {
		System.out.println("test");
	}
}

class Test {
	public static void main(String[] args) {
		A a = new A();
		B b = (B) a;
		a.test();
	}
}