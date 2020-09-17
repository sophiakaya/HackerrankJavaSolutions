package Challenge30DaysOfCode;

import java.util.Scanner;

/**
 * @author Sophia Kaya
 */
public class Day1DataTypes {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	int i = 2;
	double d = 3.0;

	/* Declare second integer, double, and String variables. */
	int j = Integer.valueOf(scan.nextLine());
	double v = Double.valueOf(scan.nextLine());
	String s = "HackerRank " + scan.nextLine();

	/* Read and save an integer, double, and String to your variables. */
	// Note: If you have trouble reading the entire String, please go back and
	// review the Tutorial closely.

	/* Print the sum of both integer variables on a new line. */
	System.out.println(i + j);

	/* Print the sum of the double variables on a new line. */
	System.out.println(d + v);

	/*
	 * Concatenate and print the String variables on a new line; the 's' variable
	 * above should be printed first.
	 */

	System.out.println(s);

	scan.close();
    }

}
