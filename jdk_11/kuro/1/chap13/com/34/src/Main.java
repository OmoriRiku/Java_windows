class Main {
	public static void main(String[] args) {
		int[][] arrayNum = new int[2][4];
		arrayNum[0] = new int[] {1, 2, 3, 4};
		arrayNum[1] = new int[] {1, 2};
		for (int i = 0; i < arrayNum.length; i++) {
			for (int j = 0; j < arrayNum[i].length; j++) {
				System.out.print(arrayNum[i][j]);
			}
			System.out.println();
		}
	}
}