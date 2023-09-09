import java.util.ArrayList;

class Item {
	private int price;
	private String name;
	public Item(String name, int price) {
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return this.price;
	}

	public String getName() {
		return this.name;
	}
}

class Test {
	public static void main(String[] args) {
		ArrayList<Item> list = new ArrayList<>();
		list.add(new Item("A", 100));
		list.add(new Item("B", 200));

		for(Item item : list) {
			System.out.print(item.getName() + item.getPrice());
		}
	}
}