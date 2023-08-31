class Test {
	public static void main(String[] args) {
		int[][] array = {
			{1, 2},
			{3, 4}
		};

		for (int[] tmp : array) {
			for (int val : tmp) {
				System.out.println(val);
			}
		}
	}
}