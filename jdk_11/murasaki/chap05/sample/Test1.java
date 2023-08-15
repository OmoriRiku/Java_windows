class Sample {
	void myPrint() {
		System.out.println("myPrint()");
	}
	void myPrint(String s) {
		System.out.println("myPrint(String s)");
	}
	void myPrint(int a) {
		System.out.println("myPrint(int a)");
	}
	void myPrint(int a, int b) {
		System.out.println("myPrint(int a, int b)");
	}
}

public class Test1 {
	public static void main(String[] args) {
		Sample s = new Sample();
		s.myPrint();
		s.myPrint(100);
		s.myPrint(100, 200);
		s.myPrint("yamamoto");
	}
}