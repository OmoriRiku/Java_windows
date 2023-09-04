class A {
	protected void test(String str) {
		System.out.println(str);
	}
}

class B extends A {
	public void test(String str) {}
}

class Test {
	public static void main(String[] args) {
		A a = new A();
		a.test("hello");
	}
}