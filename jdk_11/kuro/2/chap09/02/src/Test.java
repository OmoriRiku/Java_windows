class Test {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.test("Lambda"));
	}

	static class A implements Function {
		public String test(String name) {
			return "hello, " + name;
		}
	}

	static interface Function {
		String test(String name);
	}
}