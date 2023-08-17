public class Main {
	public static void main(String[] args) {
		String str = "abcd ef gh";
		int x = str.indexOf("ef");
		str.substring(x + 3);
		x = str.indexOf("ef");
		System.out.println(str + " " + x);
	}
}