package Task2;

import java.util.*;

public class Solve {
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Please give me a number: ");
		int num = reader.nextInt(), sum = 0;
		for(int i = 1 ; i <= num ; i++) {
			int ghost_i = i;
			ghost_i = (2*i) - 1;
			sum += ghost_i;
		}
		System.out.println("The sum of the numbers until " + num + " \nin this formula -> [(2*n) - 1] is: " + sum);
	}
}
