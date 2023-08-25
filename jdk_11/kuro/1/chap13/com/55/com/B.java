class B implements A {
	public void sample() {
		System.out.println("A");
	}

	public static void main(String[] args) {
		B b = new B();
		b.sample();
	}
}