class Main2 {
	public static void main(String[] args) {
		int n;
		do {
			System.out.print("3桁の整数値："); n = new java.util.Scanner(System.in).nextInt();
		} while (n <= 100 || n >= 999);

		System.out.println(n + "と入力しました。");
	}
}