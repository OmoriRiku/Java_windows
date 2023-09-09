package forEachTest;

import java.util.List;
import java.util.function.Consumer;

class Test {
	public static void main(String[] args) {
		List<String> list = List.of("A", "B", "C");
		Consumer<String> data = forEachTest.Test::test;
		list.forEach(data);
	}

	public static void test(String str) {
		System.out.println(str);
	}
}