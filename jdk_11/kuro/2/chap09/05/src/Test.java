import java.util.function.Predicate;

class Test {
	public static void main(String[] args) {
		Predicate<Integer> p = val -> { return val == 1; };
		boolean test = p.test(1);
		System.out.println(test);
	}
}