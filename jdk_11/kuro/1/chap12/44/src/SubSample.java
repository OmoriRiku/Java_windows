public class SubSample extends Sample {
	int price;
	public SubSample(int price) {
		super(null, 0);
		this.price = price;
	}
	public SubSample(String name, int num, int price) {
		this(price);
	}
}