public class Fibonaci {

	public static void main(String[] args) {
		int index = 0;
		// while (true) {
		// System.out.print(calFibonaci(index++) + " ");
		// System.out.println(index);
		// }

		System.out.print(calFibonaci(6));
	}

	private static long calFibonaci(int n) {
		if (n < 0) { return 0; } // check the input

		if (n == 0) {
			return 0; // stop condition
		} else if (n == 1) {
			return 1; // stop condition
		} else {
			return calFibonaci(n - 1) + calFibonaci(n - 2);
		}
	}
}
