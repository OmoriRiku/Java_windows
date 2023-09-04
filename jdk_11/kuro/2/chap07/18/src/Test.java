class A {
	int num = 10;

	A() {
		int num = 20;
		System.out.println(num);
	}
}

class Test {
	public static void main(String[] args) {
		new A();
	}
}