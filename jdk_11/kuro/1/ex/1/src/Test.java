public class Test {

	private int score = 300;
	private int point = 0;

	private void applyScore(int sc) {
		int point = sc;
		score = point;
	}

	public void printResult() {
		int score = point;
		System.out.println(score + ":" + point);
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.applyScore(500);
		t.printResult();
	}

}