import java.util.function.Predicate;

class Test {
	public static void main(String[] args) {
		Predicate<String> predicate = str -> {
			return "a".equals(str);
		};

		System.out.println(predicate.test(args[0]));
	}
}