import java.util.Random;

class A {
	private int age;
	private String name;
	String fortune;

	public A(int age, String name) {
		this.age = age;
		this.name = name;
		this.fortune = fortuneMethod();
	}

	public void disp() {
		System.out.println("年齢は" + age + "です。");
		System.out.println("名前は" + name + "です。");
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
		A a1 = new A(26, "タナカ");
		a1.disp();
	}
}