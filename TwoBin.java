package recursion;

public class TwoBin {
	public static void main (String [] args) {
		System.out.println(dec2Bin(30));
	}
	public static String dec2Bin (int value) {
		if(value == 1) {
			return "1";
		} else 
			return dec2Bin(value / 2) + value % 2;
	}
}
