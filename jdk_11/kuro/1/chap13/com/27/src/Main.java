public class Main {
	public static void main(String[] args) {
		String str = "abcde";
		str = str.replace('c', 'x');
		str = str.substring(2, 4);
		System.out.println(str);
	}
}