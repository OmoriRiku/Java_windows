class Main3 {
	public static void main(String[] args) {
		System.out.println("�����ăQ�[���J�n�I");
		System.out.println("10 ~ 99�̐��𓖂ĂĂ�������");

		int num = new java.util.Random().nextInt(90) + 10;
		int n;

		do {
			System.out.print("�������ȁF"); n = new java.util.Scanner(System.in).nextInt();
			if (num > n) {
				System.out.println("�����Ƒ傫�Ȑ�����");
			} else if (num < n) {
				System.out.println("�����Ə����Ȑ�����");
			}
		} while (num != n);

		System.out.println("�A�^���I");
	}
}