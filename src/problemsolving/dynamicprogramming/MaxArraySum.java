package problemsolving.dynamicprogramming;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Sophia Kaya
 */
public class MaxArraySum {

    private static final Scanner scanner = new Scanner(System.in);

    static int maxSubsetSum(int[] arr) {

	int prev_prev_sum = 0;
	int prev_sum = arr[0];
	int i, current_sum = 0;

	for (i = 1; i < arr.length; i++) {

	    current_sum = prev_prev_sum + arr[i];
	    prev_prev_sum = prev_prev_sum > prev_sum ? prev_prev_sum : prev_sum;
	    prev_sum = current_sum;

	}

	return (prev_prev_sum > prev_sum ? prev_prev_sum : prev_sum);
    }

    public static void main(String[] args) throws IOException {

	int n = scanner.nextInt();
	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	int[] arr = new int[n];

	String[] arrItems = scanner.nextLine().split(" ");
	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	for (int i = 0; i < n; i++) {
	    int arrItem = Integer.parseInt(arrItems[i]);
	    arr[i] = arrItem;
	}

	int res = maxSubsetSum(arr);

	System.out.println(res);

	scanner.close();
    }
}
