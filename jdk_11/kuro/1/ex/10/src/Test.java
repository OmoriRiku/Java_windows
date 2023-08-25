public class Test {
	
	public static void main(String[] args) {
		String root = "";
		String[] names = {"MAD", "DXB", "NRT"};

		for (String ap : names) {
			switch (ap) {
				case "MAD":
					root += "1";
				case "DXB":
					root += "2";
					break;
				case "NRT":
					root += "3";
			}
			//break;
			root += "4";
		}

		System.out.println("root:" + root);
	}

}