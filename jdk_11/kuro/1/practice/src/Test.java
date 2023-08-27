class A {
	String name;
	int num;

	public A(String name, int num) {
		this.name = name;
		this.num = num;
	}
}

class B extends A {
	String str;
	public B() {
		super("test", 10);
	}
}

class Test {
	public static void main(String[] args) {
		B b = new B();
		System.out.print(b.name + b.num + b.str);
	}
}