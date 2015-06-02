import java.math.BigInteger;

public class Fibonacci2 {

	public static void main(String args[]) {
		int n = 10000;
		BigInteger[] vec = new BigInteger[n];
		vec[0] = BigInteger.ZERO;
		vec[1] = BigInteger.ONE;
		// calculating
		for (int i = 2; i < n; i++) {
			vec[i] = vec[i - 1].add(vec[i - 2]);
		}
		// printing
		for (int i = 0; i < vec.length - 1; i++) {
			System.out.println(vec[i]);
			System.out.println("index: " + i);
		}
	}
}
