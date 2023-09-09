import java.util.ArrayList;

class Test {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("orange");
		System.out.println(list.get(0));

		String[] array = new String[2];
		array[0] = "apple";
		array[1] = "orange";
		System.out.println(array[0]);
	}
}