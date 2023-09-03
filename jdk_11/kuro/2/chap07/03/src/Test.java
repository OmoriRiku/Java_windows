interface A {}

interface B {}

class C implements A, B {}

class Main {
	public static void main(String[] args) {
		new C();
	}
}