package recursion;

public class oddEven {
	public static void main(String[] args) {
	System.out.println(even(27));
	}
		public static boolean odd(int n) {
			if(n == 0) {
				return false;
			} else if (n == 1) {
				return true;
			} else
				return odd(n - 2);
		}
		
		public static boolean even(int n) {
			if(n == 0) {
				return true;
			} else if (n == 1) {
				return false;
			} else
				return even(n - 2);
		}

		
		
		
		
		
	
}
