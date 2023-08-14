interface Function {
	void test();
}
public class Test {
	public static void main(String[] args) {
		String val = "hello";
		Function f = () -> {
			System.out.println(val);
		};
		f.test();
	}
}