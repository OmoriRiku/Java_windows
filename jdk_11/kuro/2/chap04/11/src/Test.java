class Test {
	public static void main(String[] args) {
		String[] array = {"A", "B", "C"};
		for (Object obj : array) {
			obj = "D";
		}

		for (Object obj : array) {
			System.out.print(obj);
		}
	}
}