public class Test {
	public static void main(String[] args) {
		int num = 5;
		int count = num++;
		int result = ++count;

		String str = num == count ? num < result ? "ARG" : "BOL" : "CHL";
		System.out.println(str);
	}
}