import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3);
		list.forEach(Sample::print);
	}
}