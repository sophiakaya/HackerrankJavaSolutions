package Challenge30DaysOfCode;

import java.util.Scanner;

/**
 * @author Sophia Kaya
 */
public class Day26NestedLogic {

    public static void main(String[] args) {
	/*
	 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
	 * class should be named Solution.
	 */

	Scanner scanner = new Scanner(System.in);

	int d1 = scanner.nextInt();
	int m1 = scanner.nextInt();
	int y1 = scanner.nextInt();

	int d2 = scanner.nextInt();
	int m2 = scanner.nextInt();
	int y2 = scanner.nextInt();

	int hackos = 0;

	if (d1 >= 1 && d1 <= 31 && d2 >= 1 && d2 <= 31 && m1 >= 1 && m1 <= 12 && m2 >= 1 && m2 <= 12 && y1 >= 1
		&& y1 <= 3000 && y2 >= 1 && y2 <= 3000) {

	    if (y1 > y2) {
		hackos = 10000;
	    } else if (y1 == y2) {
		if (m1 > m2) {
		    hackos = 500 * (m1 - m2);
		} else if (m1 == m2) {
		    hackos = 15 * (d1 - d2);
		}
	    }

	}
	System.out.println(hackos);
    }

}
