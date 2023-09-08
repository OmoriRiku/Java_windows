import java.util.function.Consumer;

class Test {
	public static void main(String[] args) {
		Consumer<String> consumer = str -> {
			System.out.println(str + "です。");
		};

		consumer.accept("consummer");
	}
}