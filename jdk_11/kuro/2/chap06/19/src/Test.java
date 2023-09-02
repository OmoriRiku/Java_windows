//	コンストラクタのルール

class Test {

	//	メソッド名をクラス名と同じにする
	Test() {
		System.out.println("hello");
	}

	//	オーバーロードすることが出来る。
	Test(String str) {
		System.out.println(str);
	}

	//	戻り値型を記述すると、コンストラクタではなくメソッドとして扱われる
	void Test() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// newと一緒にしか使えない（インスタンス生成時以外は呼び出しができない）
		new Test();

		new Test("string");
	}
}