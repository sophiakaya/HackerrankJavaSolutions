package Challenge30DaysOfCode;

import java.util.Scanner;

/**
 * @author Sophia Kaya
 */
public class Day10BinaryNumbers {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	int n = scanner.nextInt();
	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	String binary = Integer.toBinaryString(n);
	System.out.println(binary);
	int count = 0;
	while (n != 0) {
	    n = n & (n << 1);
	    count++;
	}
	System.out.println(count);

	scanner.close();
    }
}
