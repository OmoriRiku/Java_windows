interface Function {
	void test(String val);
}

class Test {
	public static void main(String[] args) {
		Function func = (String val) -> {
			System.out.println(val);
		};

		func.test("hello");
	}
}