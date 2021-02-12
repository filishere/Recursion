package recursion;

public class ConsecutiveNumbers {

	public static void main(String[] args) {
		System.out.println("Sum is " + xMethod(5));
		System.out.println("Sum is " + aMethod(5));
	}

	public static int xMethod(int n) {
		if (n == 1)
			return 1;
		else
			return n + xMethod(n - 1);
	}

	public static int aMethod(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
}
