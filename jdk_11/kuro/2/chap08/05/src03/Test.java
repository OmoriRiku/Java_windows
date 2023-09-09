import java.util.function.Function;

class Test {
	public static void main(String[] args) {
		Function<Integer, Boolean> function = (Integer num) -> {
			return num == 1;
		};
		System.out.println(function.apply(1));
	}
}