package Challenge30DaysOfCode.Day14Scope;

import java.util.Scanner;

/**
 * @author Sophia Kaya
 */
public class Day14Scope {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n];
	for (int i = 0; i < n; i++) {
	    a[i] = sc.nextInt();
	}
	sc.close();

	Difference difference = new Difference(a);

	difference.computeDifference();

	System.out.print(difference.maximumDifference);
    }
}
