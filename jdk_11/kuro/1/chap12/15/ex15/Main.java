package ex15;

import java.util.logging.Logger;

public class Main {
	static final Logger logger = Logger.getAnonymousLogger();
	public static void main(String[] args) {
		var d = new Sample("sample");
		logger.info(d.toString());
	}
}