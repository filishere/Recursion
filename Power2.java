package recursion;

public class Power2 {
	public static void main (String [] args) {
	
		System.out.println( pow2Recursive(16));
	
	}
	

	
	
	public static int pow2Recursive(int n) {
		if (n == 0) 
			return 1;
		else
			return 2 * pow2Recursive(n - 1);
	}
	
	public static int power2(int n) {
		int power = 1;
		for(int i = 0; i < n; i++) {
			power *= 2;
		}
		return power;
	}
}
