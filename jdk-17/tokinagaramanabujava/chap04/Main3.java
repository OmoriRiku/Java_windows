class Main3 {
	public static void main(String[] args) {
		System.out.println("数あてゲーム開始！");
		System.out.println("10 ~ 99の数を当ててください");

		int num = new java.util.Random().nextInt(90) + 10;
		int n;

		do {
			System.out.print("いくつかな："); n = new java.util.Scanner(System.in).nextInt();
			if (num > n) {
				System.out.println("もっと大きな数だよ");
			} else if (num < n) {
				System.out.println("もっと小さな数だよ");
			}
		} while (num != n);

		System.out.println("アタリ！");
	}
}