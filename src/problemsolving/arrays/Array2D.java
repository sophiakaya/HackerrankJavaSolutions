package problemsolving.arrays;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Sophia Kaya
 */
public class Array2D {

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

    public static void main(String[] args) throws IOException {

	int[][] arr = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
		{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };

	int[][] arr2 = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 9, 2, -4, -4, 0 },
		{ 0, 0, 0, -2, 0, 0 }, { 0, 0, -1, -2, -4, 0 } };

	System.out.println(hourglassSum(arr));
	System.out.println(hourglassSum(arr2));

    }

}
