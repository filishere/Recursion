package recursion;

public class PowerN {
	public static void main (String [] args) {
	System.out.println( powRecursive(3, 5));
	}

	public static int powRecursive (int x, int n) {
		if (n == 0) {
			return 1;
		}
			return x * powRecursive(x, n - 1);
	}
	
	public static int result(int n, int x) {
		int power = 1;
		for(int i = 0; i < n; i++) {
			power *= x;
		}
		return power;
	}

}

