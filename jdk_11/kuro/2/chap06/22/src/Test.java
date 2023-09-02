class Test {
	static int num;
	{
		num = 10;
	}
	Test() {
		num = 20;
	}

	public static void main(String[] args) {
		System.out.println(Test.num);
	}
}