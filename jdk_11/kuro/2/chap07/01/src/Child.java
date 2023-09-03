public class Child extends Parent {
	Child() {
		name = "Java";
	}
	void hello() {
		System.out.println("hello" + name);
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.hello();
	}
}