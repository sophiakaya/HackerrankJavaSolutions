package Challenge30DaysOfCode;

import java.util.Scanner;

/**
 * @author Sophia Kaya
 */
public class Day25RunningTimeAndComplexity {

    public static boolean isPrime(int n) {

	if (n == 1)
	    return false;
	if (n == 2)
	    return true;
	if (n % 2 == 0)
	    return false;

	int sqrt = (int) Math.sqrt(n);

	if (n % sqrt == 0)
	    return false;

	for (int j = 3; j < sqrt; j++) {
	    if (n % j == 0) {
		return false;
	    }
	}
	return true;

    }

    public static void main(String[] args) {
	/*
	 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
	 * class should be named Solution.
	 */

	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int[] a = new int[n];
	for (int i = 0; i < n; i++) {
	    a[i] = scanner.nextInt();
	}

	for (int i = 0; i < a.length; i++) {

	    if (isPrime(a[i]))
		System.out.println("Prime");
	    else
		System.out.println("Not prime");

	}

    }
}
