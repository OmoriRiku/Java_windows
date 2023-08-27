interface Exchangeable {
	Product exchangeProcuct();
}

class Product implements Exchangeable {
	String name;
	int price;

	public Product exchangeProduct() {
		return new Product();
	}
}

class Lamp extends Product {
	public Product exchangeProduct() {
		return new Lamp();
	}
}

public class Test {
	public static void main(String[] args) {
		Lamp clinker = new Lamp();
		Product replacement = clinker.exchangeProduct();
	}
}