import java.util.Comparator;
import java.util.ArrayList;
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

class SampleComparator implements Comparator<Item> {
	@Override
	public int compare(Item s1, Item s2) {
		if (s1.getId() < s2.getId()) {
			return -1;
		}
		if (s2.getId() < s1.getId()) {
			return 1;
		}
		return 0;
	}
}

class Test {
	public static void main(String[] args) {
		List<Item> list = new ArrayList<>();
		list.add(new Item(1, "A"));
		list.add(new Item(3, "B"));
		list.add(new Item(2, "C"));

		list.sort(new SampleComparator());

		for (Item item : list) {
			System.out.println(item.getId() + ":" + item.getName());
		}
	}
}

