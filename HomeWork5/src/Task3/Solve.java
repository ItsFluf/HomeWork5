package Task3;

import java.util.*;

public class Solve {
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Please give the amount of children participating in this test: ");
		int num_of_kids = reader.nextInt(), age, MustAge = 8;
		double height, MustHeight = 150, height_group_A = 0, age_group_A = 0, group_A_cnt = 0, height_group_B = 0, age_group_B = 0,group_B_cnt = 0, avg_group_A_height = 0, avg_group_A_age = 0, avg_group_B_height = 0, avg_group_B_age = 0;
		for(int i = 1 ; i <= num_of_kids ; i++) {
			System.out.print("Children number: " + i + "s height: ");
			height = reader.nextDouble();
			System.out.print("Children number: " + i + "s age: ");
			age = reader.nextInt();
			if ((height < 170) && (age < 15))
				if ((height > MustHeight) && (age > MustAge)) {
					height_group_A += height;
					age_group_A += age;
					group_A_cnt ++;
				}
				else {
					height_group_B += height;
					age_group_B += age;
					group_B_cnt ++;
				}
			System.out.println(" ");
		}
		
		if(height_group_A != 0) {
			avg_group_A_height = height_group_A / group_A_cnt;
		}
		else {
			avg_group_A_height = 0;
		}
		
		if(age_group_A != 0) {
			avg_group_A_age = age_group_A / group_A_cnt;
		}
		else {
			avg_group_A_age = 0;
		}
		
		if(height_group_B != 0) {
			avg_group_B_height = height_group_B / group_B_cnt;
		}
		else {
			avg_group_B_height = 0;
		}
		
		if(age_group_B != 0) {
			avg_group_B_age = age_group_B / group_B_cnt;
		}
		else {
			avg_group_B_age = 0;
		}
		
		System.out.println("----------Group A results----------");
		System.out.println("There are " + group_A_cnt + "chldren in group A.");
		System.out.println("There average height of group A is:  " + avg_group_A_height);
		System.out.println("There average age of group A is:  " + avg_group_A_age);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("----------Group B results----------");
		System.out.println("There are " + group_B_cnt + "chldren in group B.");
		System.out.println("There average height of group B is:  " + avg_group_B_height);
		System.out.println("There average age of group B is:  " + avg_group_B_age);
	}
}