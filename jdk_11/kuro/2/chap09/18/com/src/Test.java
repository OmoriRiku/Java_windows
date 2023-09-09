package Local;

import java.util.function.Consumer;

class Test {
	public static void main(String[] args) {
		Consumer<String> str = Local.Test::test;

		str.accept("A");
	}

	public static void test(String str) {
		System.out.println(str);
	}
}