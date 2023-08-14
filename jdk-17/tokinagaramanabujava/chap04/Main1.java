import java.util.Scanner;

class Main1 {
	public static void main(String[] args) {
		int retry;
		do {
			System.out.print("整数値："); int n = new Scanner(System.in).nextInt();

			System.out.println(n > 0 ? "その値は正です。" : "その値は0もしくは負です。");

			System.out.print("もう一度？１...Yes / 0...NO:");
			retry = new Scanner(System.in).nextInt();
		} while (retry == 1);
	}
}