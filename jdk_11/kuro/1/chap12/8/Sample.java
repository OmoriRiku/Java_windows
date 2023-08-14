public class Sample {
	public static void main(String[] args) {
		String str = "hoge456test";
		int index = 5;
		if (Character.isAlphabetic(str.charAt(index))) {
			index = 0;
		} else if (Character.isDigit(str.charAt(index))) {
			index = 10;
		} else {
			++index;
		}
		if (str.endsWith("test"))
			str = str.substring(0, index);
		System.out.println(str);
	}
}