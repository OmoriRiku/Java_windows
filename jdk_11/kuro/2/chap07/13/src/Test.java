interface Worker {
	void work();
}

class Employee {
	public void work() {
		System.out.println("work");
	}
}

class Engnieer extends Employee implements Worker {}

class Test {
	public static void main(String[] args) {
		Worker worker = new Engnieer();
		worker.work();
	}
}