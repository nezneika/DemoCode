
public class LongInt {

	public static Long getSum() {
		Long sum = 0L;
		for (int i = 0; i < Integer.MAX_VALUE; ++i) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String args[]) {
		Long sumTotal = getSum();

		System.out.println(sumTotal);
	}

}
