import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		var alphabet = new ArrayList<>(
			Arrays.asList(
					new String[] {"A","B","C","D","E"}
				));
			alphabet.sort((var a, var b) -> -a.compareTo(b));
			alphabet.forEach(System.out::println);
	}
}