import java.util.Random;

class A {
	private int age;
	private String name;

	public A(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void disp() {
		System.out.println("年齢は" + age + "です。");
		System.out.println("名前は" + name + "です。");
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}
}

class B extends A {
	String fortune;

	public B(int age, String name) {
		super(age, name);
		this.fortune = fortuneMethod();
	}

	@Override
	public void disp() {
		System.out.println("年齢は" + getAge() + "です。");
		System.out.println("名前は" + getName() + "です。");
		System.out.println("今日の運勢は" + fortune + "です。");
	}

	public String fortuneMethod() {
		int randNum = new Random().nextInt(4) + 1;

		switch(randNum) {
			case 1:
				fortune = "大吉";
				break;
			case 2:
				fortune = "中吉";
				break;
			case 3:
				fortune = "吉";
				break;
			default:
				fortune = "凶";
				break;
		}
		return fortune;
	}
}

class Main {
	public static void main(String[] args) {
		B a1 = new B(26, "タナカ");
		a1.disp();
	}
}