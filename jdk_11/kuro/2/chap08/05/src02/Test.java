import java.util.function.Supplier;

class Test {
	public static void main(String[] args) {
		Supplier<String> supplier = () -> "赤です";
		System.out.println(supplier.get());
	}
}