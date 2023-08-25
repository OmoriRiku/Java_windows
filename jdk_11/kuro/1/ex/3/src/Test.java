public class Test {
	public static void main(String[] args) {
		int iNum = 5;
		float fNum = 3.4f;
		double dNum = 7.9;

		if (iNum > 5) {
			iNum = fNum;
		} else {
			fNum = dNum;
		}
	}
}