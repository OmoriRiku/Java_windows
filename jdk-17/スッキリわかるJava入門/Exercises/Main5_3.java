public class Main5_3 {
	public static void main(String[] args) {
		email("�����������s���攠��0����0-0", "���\�b�h���I�[�o�[���[�h���܂����B");
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "�ɁA�ȉ��̃��[���𑗐M���܂����B");
		System.out.println("�����F" + title);
		System.out.println("�{���F" + text);
	}

	public static void email(String address, String text) {
		System.out.println(address + "�ɁA�ȉ��̃��[���𑗐M���܂����B");
		System.out.println("�����F����");
		System.out.println("�{���F" + text);
	} 
}