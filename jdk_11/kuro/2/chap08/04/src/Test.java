interface A {
	void hello();
}

class Test {
	public static void main(String[] args) {
		String str = "Lambda";
		A a = () -> {
			System.out.println("hello, " + str);
		};

		a.hello();
	}
}