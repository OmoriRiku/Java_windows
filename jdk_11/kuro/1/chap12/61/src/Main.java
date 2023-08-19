public class Main {
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = "Java";
		String s3 = s2.intern();
		System.out.print((s1 == s2) + ", ");
		System.out.print((s2 == s3) + ", ");
		System.out.println((s1 == s3));
	}
}