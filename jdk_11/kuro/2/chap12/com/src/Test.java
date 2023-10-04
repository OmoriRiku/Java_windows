class A {
	public void test() {
		System.out.println("A");
	}
}

class B extends A {
	@Override
	public void test() {
		System.out.println("B");
	}
}

class Test {
	public static void main(String[] args) {
		A a = new A();
		a.test();
	}
}