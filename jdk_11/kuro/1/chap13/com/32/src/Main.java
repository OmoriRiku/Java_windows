class Main {
	public static void main(String[] args) {
		set();
		System.out.println(set("hello"));
	}
	static void set() {
		System.out.println("set");
	}
	static String set(String str) {
		return str;
	}
}