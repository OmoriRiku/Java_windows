class Sample {
	private int num;
	private int test() {
		for (int i = 0; i < 3; i++) {
			num += i;
		}
		return num;
	}
	public static void main(String[] args) {
		Sample s = new Sample();
		int num = s.test();
		s.test();
		System.out.println(s.num);
	}
}