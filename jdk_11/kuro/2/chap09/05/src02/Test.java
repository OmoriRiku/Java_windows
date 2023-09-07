import java.util.function.Supplier;

class Test {
	public static void main(String[] args) {
		Supplier<String> supplier = () -> {
			return "hello";
		};

		System.out.println(supplier.get());
	}
}