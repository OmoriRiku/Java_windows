package global; public class Customer { int id;
private String name; protected int accNo;

	public void setName(String name) {
		this.name = name;
	}

	void printMessage() {
		System.out.println("Hello" + name);
	}
}