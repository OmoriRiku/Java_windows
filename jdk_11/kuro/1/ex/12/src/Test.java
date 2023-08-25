class Student {

	String name;
	int score;

	public Student() { score = 50; }

	public Student(String name) {
		this();
		this.name = name;
	}

	public Student(String name, int score) {
		this(name);
		this.score = score;
	}
	
}

public class Test {
	public static void main(String[] args) {
		Student atd1 = new Student("Manuel");
		Student std2 = new Student("Rodrigo", 92);
	}
}