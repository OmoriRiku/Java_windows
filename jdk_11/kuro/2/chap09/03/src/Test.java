import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

class SampleComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer a, Integer b) {
		return a.compareTo(b);
	}
}

class Test {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[] {3, 2, 1});
		list.sort(new SampleComparator());
		for (Integer num : list) {
			System.out.println(num);
		}
	}
}