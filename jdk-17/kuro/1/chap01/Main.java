import java.lang.String;	//	�ȗ��\
import java.lang.Integer;	//	�ȗ��\
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		String str = "100";
		int val = Integer.parseInt(str);
		BigDecimal decimal = new BigDecimal(val);
		System.out.println(decimal.intValue());
	}
}