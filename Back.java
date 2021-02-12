package recursion;

public class Back {
	public static void main(String[] args) {
		xMethod(1234567);
	    aMethod(1234567);
	}

	public static void xMethod(int n) {
		if (n > 0) {
			System.out.print(n % 10);
			xMethod(n / 10);
		}
	}

	public static void aMethod(int n) {
		while (n > 0) {
			System.out.print(n % 10);
			n /= 10;
		}
	}
}
