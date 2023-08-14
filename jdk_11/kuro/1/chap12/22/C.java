public class C extends B {
	@Override
	public double getValue() {
		System.out.println(super.num);
		return super.getValue();
	}
}