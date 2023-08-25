public class Test {

	public static void main(String[] args) {
		String str = "1";

		switch(str) {
			case "1":
				System.out.print(str + 3 + 4);
			case "2":
				System.out.print(str + (3 + 4));
		}
	}

}