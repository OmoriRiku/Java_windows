import java.util.Random;

class Main {
	public static void main(String[] args) {
		System.out.print("¡“ú‚Ì‰^¨:");
		int num = new Random().nextInt(4) + 1;

		switch (num) {
			case 1 :
				System.out.println("‘å‹g");
				break;
			case 2 :
				System.out.println("’†‹g");
				break;
			case 3 :
				System.out.println("‹g");
				break;
			case 4 :
				System.out.println("‹¥");
				break;
		}

	}
}