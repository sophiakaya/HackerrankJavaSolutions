package Challenge30DaysOfCode.Day19Interfaces;

import java.util.Scanner;

/**
 * @author Sophia Kaya
 */
public class Solution {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	scan.close();

	AdvancedArithmetic myCalculator = new Calculator();
	int sum = myCalculator.divisorSum(n);
	System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
	System.out.println(sum);
    }
}
