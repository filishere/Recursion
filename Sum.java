package recursion;

public class Sum {
	public static void main(String[] args) {
	   	 System.out.println("Sum is " + xMethod(10));
	}

	public static int xMethod(int n) {
	   	 return xMethod(n, 1);
	}
	
	public static int xMethod(int n, int sum) {
	   	 if (n == 1)
	   		 return sum;
	   	 else {
	   		 
	   		 return xMethod(n - 1, sum + n);
	   	 }
	}
}
