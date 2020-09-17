package Challenge30DaysOfCode;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Sophia Kaya
 */
public class Day11Arrays2D {

    private static final Scanner scanner = new Scanner(System.in);

    static int hourglassSum(int[][] arr) {

	Set<Integer> set = new HashSet<Integer>();

	for (int i = 1; i < arr.length - 1; i++) {
	    for (int j = 1; j < arr[i].length - 1; j++) {
		set.add(calculateSum(i, j, arr));
	    }
	}
	return Collections.max(set);
    }

    private static Integer calculateSum(int i, int j, int[][] arr) {

	return arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1] + arr[i][j] + arr[i + 1][j - 1] + arr[i + 1][j]
		+ arr[i + 1][j + 1];
    }

    public static void main(String[] args) {
	int[][] arr = new int[6][6];

	for (int i = 0; i < 6; i++) {
	    String[] arrRowItems = scanner.nextLine().split(" ");
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	    for (int j = 0; j < 6; j++) {
		int arrItem = Integer.parseInt(arrRowItems[j]);
		arr[i][j] = arrItem;
	    }
	}

	System.out.println(hourglassSum(arr));

	scanner.close();
    }
}
