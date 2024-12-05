package Task1;

import java.util.*;

public class Solve {
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Please give me a number: ");
		double num = reader.nextDouble(), ghost_num = num;
		int cnt = 0;
		while(num - (num % 1) / 10 > 1) {
			num /= 10;
			cnt++;
		}
		System.out.println("The number: " + ghost_num + " has " + cnt + " numbers before the decimal point.");
	}
}
