public class C extends B implements A {
	public void z() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		C c = new C();
		c.z();
	}
}