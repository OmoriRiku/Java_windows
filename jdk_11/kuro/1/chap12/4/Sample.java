import java.util.function.Supplier;

public class Sample {
	void Sample() {
		int i = 0;
		Supplier<Integer> foo = () -> i;
		i++;
		System.out.println(foo.get());
	}
}