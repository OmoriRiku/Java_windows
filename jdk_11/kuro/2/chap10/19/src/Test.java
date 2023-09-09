import java.util.HashMap;
import java.util.Map;

class Item {
	private int id;
	private String name;
	Item(int id, String name) {
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
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");

		map.forEach((a, b) -> System.out.println(a + b));
	}
}