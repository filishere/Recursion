package recursion;

import java.util.Scanner;

public class TowerOfHanoi {
	public static int num = 0;
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of disks: ");
		int n = input.nextInt();
		input.close();
	
		System.out.println("The moves are:");
		moveDisks(n, 'A', 'B', 'C');
		System.out.println(num);
	}


	public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
		if (n == 1) { 
			System.out.println("Move disk " + n + " from "+ fromTower + " to " + toTower);
			num++;
		} else {
			moveDisks(n - 1, fromTower, auxTower, toTower);
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
			num++;
			moveDisks(n - 1, auxTower, toTower, fromTower);
		}
	}
}