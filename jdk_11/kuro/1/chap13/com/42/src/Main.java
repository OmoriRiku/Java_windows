public class Main {
	public static void main(String[] args) {
		try (Sample s = new Sample()) {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("A");
		} finally {
			System.out.println("B");
		}
	}
}