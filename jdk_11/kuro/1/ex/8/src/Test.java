public class Test {

	public static void main(String[] args) {
		char[][] chArr = new char[2][];
		chArr[1] = new char[] {'X', 'O', 'O', 'X'};
		char[] ox = {'O','X'};
		chArr[0] = ox;

		for (char[] ca : chArr) {
			for (int i = ca.length - 1; i >= 0; i--) {
				System.out.print(ca[i]);
			}
			System.out.println();
		}
	}

}