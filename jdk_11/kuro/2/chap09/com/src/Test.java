import java.util.ArrayList;
import java.util.List;

class Item {
	private int id;
	private String name;

	public Item(int id, String name) {
		this.name = name;
		this.id = id;
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
		List<Item> list = new ArrayList<>();
		list.add(new Item(3, "A"));
		list.add(new Item(2, "B"));
		list.add(new Item(1, "C"));

		list.sort((Item i1, Item i2) -> {
			if (i1.getId() < i2.getId()) {
				return -1;
			}
			if (i1.getId() > i2.getId()) {
				return 1;
			}
			return 0;
		});

		list.forEach(item -> System.out.println(item.getId() + ":" + item.getName()));
	}
}