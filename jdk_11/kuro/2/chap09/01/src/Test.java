interface A {
	void hello();
}

class Test {
	public static void main(String[] args) {
		A a = () -> System.out.println("hello");

		a.hello();
	}
}