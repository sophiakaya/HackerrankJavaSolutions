package Challenge30DaysOfCode;

import java.util.Scanner;

/**
 * @author Sophia Kaya
 */
public class Day20Sorting {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] a = new int[n];
	for (int a_i = 0; a_i < n; a_i++) {
	    a[a_i] = in.nextInt();
	}

	// Write Your Code Here
	int numSwaps = 0;

	for (int i = 0; i < a.length; i++) {
	    for (int j = 0; j < a.length - 1; j++) {

		if (a[j] > a[j + 1]) {
		    int temp = a[j];
		    a[j] = a[j + 1];
		    a[j + 1] = temp;
		    numSwaps++;
		}
	    }
	}

	System.out.println("Array is sorted in " + numSwaps + " swaps.");
	System.out.println("First Element: " + a[0]);
	System.out.println("Last Element: " + a[a.length - 1]);
    }
}
