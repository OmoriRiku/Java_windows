class A {
	String name;
	int num;
	A(String name, int num) {
		this.name = name;
		this.num = num;
	}

	String getName() {
		return this.name;
	}

	int getNum() {
		return this.num;
	}
}

class B extends A {
	B(String name, int num) {
		super(name, num);
	}
}

class Test {
	public static void main(String[] args) {
		B b = new B("test", 10);
		System.out.println(b.getName() + b.getNum());
	}
}