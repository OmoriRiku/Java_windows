import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Item {
	private int id;
	private String name;
	public Item(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
}

class Test {
	public static void main(String[] args) {
		Item[] items = {
			new Item(1, "A"),
			new Item(2, "B"),
			new Item(3, "C"),
		};
		List<Item> list = new ArrayList<Item>(Arrays.asList(items));
		for (Item i : list) {
			System.out.println(i.getId());
		}
	}
}