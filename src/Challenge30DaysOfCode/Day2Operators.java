package Challenge30DaysOfCode;

import java.util.Scanner;

/**
 * @author Sophia Kaya
 */
public class Day2Operators {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {

	double result = meal_cost + (meal_cost * tip_percent / 100) + (meal_cost * tax_percent / 100);
	System.out.println(Math.round(result));
    }

    public static void main(String[] args) {
	double meal_cost = scanner.nextDouble();
	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	int tip_percent = scanner.nextInt();
	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	int tax_percent = scanner.nextInt();
	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	solve(meal_cost, tip_percent, tax_percent);

	scanner.close();
    }

}
