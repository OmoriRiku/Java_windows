import java.util.ArrayList;

class Test {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		for(String str : list) {
			if ("B".equals(str)) {
				list.remove("B");
			} else {
				System.out.println(str);
			}
		}
	}
}