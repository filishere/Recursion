package recursion;

public class Average {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 4, 9, 20};
		System.out.println( average(arr));
	}
	
	public static double average(int[] arr) {
		return average(arr,arr.length, 0) / arr.length;
	}
	
	public static double average(int[] arr,int length, int sum) {
		if(length == 0) {
			return sum;
		}
	
		return average(arr, length - 1 , sum + arr[length - 1]);
	}
}
