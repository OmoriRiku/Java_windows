class Main {
	public static void main(String[] args) {
		String[] array = { "A", "B" };
		for (String a : array) {
			for (String b : array) {
				System.out.print(b);
			}
			System.out.println();
		}
	}
}