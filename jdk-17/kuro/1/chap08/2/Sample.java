interface Test {
	String process();
}

public class Sample {
	public static void main(String[] args) {
		Test t = () -> {return "hello!";};
		System.out.println(t.process());
	}
}