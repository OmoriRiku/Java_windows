import java.util.function.Supplier;

public class Main {
	public static void main(String[] args) {
		Supplier<String> func = () -> {
			return "hello, Lambda";
		};
		System.out.println(func.get());
	}
}