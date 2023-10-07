import java.util.Random;

class A {
	private int age;
	private String name;

	public A(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void disp() {
		System.out.println("�N���" + age + "�ł��B");
		System.out.println("���O��" + name + "�ł��B");
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
		System.out.println("�N���" + getAge() + "�ł��B");
		System.out.println("���O��" + getName() + "�ł��B");
		System.out.println("�����̉^����" + fortune + "�ł��B");
	}

	public String fortuneMethod() {
		int randNum = new Random().nextInt(4) + 1;

		switch(randNum) {
			case 1:
				fortune = "��g";
				break;
			case 2:
				fortune = "���g";
				break;
			case 3:
				fortune = "�g";
				break;
			default:
				fortune = "��";
				break;
		}
		return fortune;
	}
}

class Main {
	public static void main(String[] args) {
		B a1 = new B(26, "�^�i�J");
		a1.disp();
	}
}