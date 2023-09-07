interface Function {
	void test(String val);
}

class Test {
	public static void main(String[] args) {
		String val = "A";
		Function f = (val) -> {
			System.out.println(val);
		};

		f.test("B");
	}
}