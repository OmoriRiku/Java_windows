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
		System.out.println("�N���" + age + "�ł��B");
		System.out.println("���O��" + name + "�ł��B");
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
		A a1 = new A(26, "�^�i�J");
		a1.disp();
	}
}