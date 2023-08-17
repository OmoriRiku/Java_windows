import java.util.function.Supplier;

public class Sample {
	void sample() {
		int i = 0;
		Supplier<Integer> foo = () -> i;
		System.out.println(foo.get());
	}
}