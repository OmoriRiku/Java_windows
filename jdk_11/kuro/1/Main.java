class Main {
	public static void main(String[] args) {
		sample(new int[] {1, 2, 3});
	}
	static void sample(int[] array) {
		for(int value : array) {
			System.out.print(value);
		}
	}
}