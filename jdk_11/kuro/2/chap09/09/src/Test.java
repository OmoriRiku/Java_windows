import java.util.ArrayList;

class Test {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.set(0, "B");

		System.out.println(list.get(0));
	}
}