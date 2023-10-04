class Item {
	String name;
	int price = 100;
}

public class Main {
	public static void main(String[] args) {
		Item[] items = new Item[3];
		items[0] = new Item();
		items[1] = new Item();
		items[2] = new Item();

		int total = 0;
		for (int i = 0; i < items.length; i++) {
			total += items[i].price;
		}
		System.out.println(total);
	}
}