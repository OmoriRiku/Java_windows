public class Sample {
	private String name;
	private int age;

	public Sample() {
		this.name = "��X";
		this.age = 27;
	}

	public Sample(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void getProfile() {
		String age = Integer.toString(this.age);
		String name = this.name;
		System.out.println("�N���" + age + "�ł��B���O��" + name + "�ł��B");
	}
}