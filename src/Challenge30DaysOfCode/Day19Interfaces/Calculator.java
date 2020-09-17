package Challenge30DaysOfCode.Day19Interfaces;

/**
 * @author Sophia Kaya
 */
interface AdvancedArithmetic {
    int divisorSum(int n);
}

/**
 * @author Sophia Kaya
 */
public class Calculator implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {

	int result = 0;

	for (int i = n; i >= 1; i--) {
	    if (n % i == 0)
		result = result + i;
	}
	return result;
    }
}
