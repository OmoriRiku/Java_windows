public class Main4 {
	public static void main(String[] args) {
		int i1 = 100;
		Integer obj = i1;
		int i2 = obj;
		method(i2);
	}

	static void method(Integer obj) {
		int i = obj + 100;
		System.out.println(i);
	}
}