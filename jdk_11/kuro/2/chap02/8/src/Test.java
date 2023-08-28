class A {
	protected void hello() {
		System.out.println("A");
	}
}

class B extends A {
	protected void hello() {
		System.out.println("B");
	}
}

class C extends A {
	protected void hello() {
		System.out.println("C");
	}
}

class Test {
	public static void main(String[] args) {
		var b = new B();
		b.hello();
	}
}