public class Main5_2 {
	public static void main(String[] args) {
		email("お久しぶりです。", "福岡県福岡市東区箱崎0丁目0-0", "今度飲みに行きませんか");
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	} 
}