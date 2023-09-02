class Test {
	public static void main(String[] args) {
		Test t = new Test();
		int num = t.test(1, 1);
		System.out.println(num);
	}

	int test(int a, int b) {
		return a + b;
	}
}