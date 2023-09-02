class Test {
	Test() {
		this("hello");
	}

	Test(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		new Test();
	}
}