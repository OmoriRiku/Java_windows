public class Test {

	int amount;
	String name = "Java";

	public static void main(String[] args) {
		Test test = new Test();
		test.amount = 10;
		test.update(test.amount);
		test.modify(test);
		System.out.println(test.name + " " + test.amount);
	}

	private void update(int n) {
		n = n * n;
	}

	private void modify(Test t) {
		t.amount = t.amount * t.amount;
		t.name = name.concat("SE8");
	}

}