import java.util.function.Consumer;

class Test {
	public static void main(String[] args) {
		Consumer<Integer> c = a -> System.out.println(a + "です。");
		c.accept(10);
	}
}