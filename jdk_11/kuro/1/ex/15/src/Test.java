class Player {

	String name;
	int annSal;

	public Player(String name, int annSal) {
		this.name = name;
		this.annSal = annSal;
	}
}

class Footballer extends Player {
	boolean isCap;

	public Footballer(boolean isCap) {
		this("Legend", 300, isCap);
	}

	public Footballer(String name, int annSal, boolean isCap) {
		super(name, annSal);
		this.isCap = isCap;
	}
}

public class Test {
	public static void main(String[] args) {
		Player ft1 = new Footballer(true);
		Player ft2 = new Footballer("Jorge", 20, false);
	}
}