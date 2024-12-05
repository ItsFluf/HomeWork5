package Task4;

import java.util.*;

public class Solve {
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		int MOM_A_kids = 2, MOM_A_workHours = 20; 
		
		int MOM_B_kids = 7, MOM_B_workHours = 4; 
		
		int MOM_C_kids = 1, MOM_C_workHours = 55; 
		
		System.out.println("Mother A have " + MOM_A_kids + " children, and works " + MOM_A_workHours + " hours per week.");
		if((MOM_A_kids >= 2) && (MOM_A_workHours >= 20)) {
			System.out.println("Mother A is a working mother and she receives credit!");
		}
		else if((MOM_A_kids >= 6) && (MOM_A_workHours < 20)) {
			System.out.println("Mother A is NOT a working mother but she receives credit!");
		}
		else {
			System.out.println("Mother A does not have the appropriate number of hours not the appropriate number of children to be a working mother, so she does not receive credit!");
		}
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Mother B have " + MOM_B_kids + " children, and works " + MOM_B_workHours + " hours per week.");
		if((MOM_B_kids >= 2) && (MOM_B_workHours >= 20)) {
			System.out.println("Mother B is a working mother and she receives credit!");
		}
		else if((MOM_B_kids >= 6) && (MOM_B_workHours < 20)) {
			System.out.println("Mother B is NOT a working mother but she receives credit!");
		}
		else {
			System.out.println("Mother B does not have the appropriate number of hours not the appropriate number of children to be a working mother, so she does not receive credit!");
		}
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Mother C have " + MOM_C_kids + " children, and works " + MOM_C_workHours + " hours per week.");
		if((MOM_C_kids >= 2) && (MOM_C_workHours >= 20)) {
			System.out.println("Mother C is a working mother and she receives credit!");
		}
		else if((MOM_C_kids >= 6) && (MOM_C_workHours < 20)) {
			System.out.println("Mother C is NOT a working mother but she receives credit!");
		}
		else {
			System.out.println("Mother C does not have the appropriate number of hours not the appropriate number of children to be a working mother, so she does not receive credit!");
		}
		
		System.out.println("--------------------------------------------------------");
	}
}
