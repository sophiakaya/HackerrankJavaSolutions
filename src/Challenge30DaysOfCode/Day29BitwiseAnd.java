package Challenge30DaysOfCode;

import java.util.Scanner;

/**
 * @author Sophia Kaya
 */
public class Day29BitwiseAnd {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	int t = scanner.nextInt();
	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	for (int tItr = 0; tItr < t; tItr++) {
	    String[] nk = scanner.nextLine().split(" ");

	    int n = Integer.parseInt(nk[0]);

	    int k = Integer.parseInt(nk[1]);

	    int result = 0;
	    for (int A = 1; A <= n; A++) {
		for (int B = A + 1; B <= n; B++) {
		    int current = A & B;
		    if (current > result && current < k) {
			result = current;
		    }
		}
	    }
	    System.out.println(result);

	}

	scanner.close();
    }

}
