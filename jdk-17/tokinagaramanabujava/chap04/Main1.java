import java.util.Scanner;

class Main1 {
	public static void main(String[] args) {
		int retry;
		do {
			System.out.print("�����l�F"); int n = new Scanner(System.in).nextInt();

			System.out.println(n > 0 ? "���̒l�͐��ł��B" : "���̒l��0�������͕��ł��B");

			System.out.print("������x�H�P...Yes / 0...NO:");
			retry = new Scanner(System.in).nextInt();
		} while (retry == 1);
	}
}