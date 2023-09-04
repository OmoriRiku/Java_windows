class A {
	String val = "A";
	void test() {
		System.out.println(val);
	}
}

class B extends A {
	String val = "B";
	void test() {
		System.out.println(val);
	}
}

class Test {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		a1.test();
		a2.test();
	}
}