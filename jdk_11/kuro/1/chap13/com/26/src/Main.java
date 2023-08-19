class Main {
	
	static int num;

	private static void test() {
		num++;
		System.out.println(num);
	}

	public static void main(String[] args) {
		Main.test();
		Main.test();
	}

}