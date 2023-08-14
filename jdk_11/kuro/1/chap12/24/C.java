public interface C extends A {
	default void sample() {
		System.out.println("C");
	}
}