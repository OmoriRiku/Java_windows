public class Main {
	public static void main(String[] args) {
		SubSample sub = new SubSample();
		Sample sample = new SubSample();
		sub = (SubSample)sample;
		sub.test();
		sample.test();
	}
}