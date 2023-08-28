class Test {
	private int num;
	public Test(int num) {
		this.num = num;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		if (obj instanceof Test) {
			Test t = (Test)obj;
			return t.num == this.num;
		}
		
		return false;
	}

	public static void main(String[] args) {
		Test t1 = new Test(10);
		Test t2 = new Test(10);
		System.out.print(t1.equals(t2));
	}
}