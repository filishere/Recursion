package recursion;

public class Exponents {
	public static void main(String[] args) {
		System.out.println(powRecursive(5, 8));
	}
	
	public static int powRecursive( int x, int n ) {
	   	 return powRecursive(x, n, 1);
	}
	
	public static int powRecursive( int x, int n, int result ) {
	   	 if (n == 0) {
	   		 return result;
	   	 }
	
	   	 return powRecursive(x, n - 1, result*x);
	}
}
