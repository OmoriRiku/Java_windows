class Test {
	public static void main(String[] args) {
		String[][] array = {{"A", "B"}, {null}, {"C", "D"}};

		for (String[] str : array) {
			System.out.println(str);
		}
	}
}