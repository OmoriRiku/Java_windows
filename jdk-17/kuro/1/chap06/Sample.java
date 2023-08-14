public class Sample {
	private String name;
	private int age;

	public Sample() {
		this.name = "大森";
		this.age = 27;
	}

	public Sample(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void getProfile() {
		String age = Integer.toString(this.age);
		String name = this.name;
		System.out.println("年齢は" + age + "です。名前は" + name + "です。");
	}
}