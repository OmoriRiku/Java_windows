import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		B b1 = new B();

		List<String> list = new ArrayList<>();
		a1.sample(list);
	}
}