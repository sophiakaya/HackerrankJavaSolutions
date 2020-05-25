package arrays;

import java.util.Arrays;

/**
 * @author Sophia Kaya
 */

public class ArrayLeftRotation {

    static int[] rotLeft(int[] a, int d) {

	for (int i = 0; i < d; i++) {
	    doSingleLeftRotation(a);
	}
	return a;
    }

    private static void doSingleLeftRotation(int[] a) {

	int temp = a[0];
	for (int i = 0; i < a.length - 1; i++) {
	    a[i] = a[i + 1];
	}
	a[a.length - 1] = temp;

    }

    public static void main(String[] args) {

	System.out.println(Arrays.toString(rotLeft(new int[] { 1, 2, 3, 4, 5 }, 4)));

    }

}
