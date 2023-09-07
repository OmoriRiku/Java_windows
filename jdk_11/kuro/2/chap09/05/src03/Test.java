import java.util.function.Function;

class Test {
	public static void main(String[] args) {
		Function<Integer, String> func = a -> {
			return a + "です。";
		};

		System.out.println(func.apply(2));
	}
}