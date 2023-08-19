public class Sample {
	private final int num;
	public Sample(String str) {
		this(Integer.parseInt(str));
	}
	public Sample(int num) {
		this.num = num;
	}
	public int getNum() {
		return this.num;
	}
}