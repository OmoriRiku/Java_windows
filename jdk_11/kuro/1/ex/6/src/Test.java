public class Test {
		public static void main(String[] args) {
		String msg1 = "Good";
		String msg2 = msg1;
		String msg3 = new String("Good");
		String[] msgArr = {"G", "o", "o", "d"};
		String msg4 = "";
		for (String msg : msgArr) {
			msg4 += msg;
		}
		System.out.println(msg1 == msg2);
		System.out.println(msg1.equals(msg3));
		System.out.println(msg1.equals(msg4));
	}
}