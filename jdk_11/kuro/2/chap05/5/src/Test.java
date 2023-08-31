public class Test {
	public static void main(String[] args) {
		Item[] items = {new Item()};
		for (Item array : items) {
			System.out.println(array.name + array.price);
		}
	}
}