class Test {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = s1.intern();

		System.out.println(s2);
	}
}