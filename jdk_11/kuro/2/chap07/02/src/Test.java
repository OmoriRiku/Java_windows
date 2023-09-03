class A {
	A(String str) {
		System.out.println(str);
	}
}

class B extends A {}

class Test {
	public static void main(String[] args) {
		B b = new B("hello");
	}
}