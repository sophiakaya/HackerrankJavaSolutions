package problemsolving.stacksandqueues;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Sophia Kaya
 */
public class BalancedBrackets {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the isBalanced function below.
    static String isBalanced(String s) {

	if ((s.length() % 2) != 0)
	    return "NO";

	Stack<Character> stack = new Stack<>();

	for (char c : s.toCharArray()) {

	    if (c == '(')
		stack.push(')');
	    else if (c == '{')
		stack.push('}');
	    else if (c == '[')
		stack.push(']');

	    else {

		if (stack.isEmpty() || stack.pop() != c)
		    return "NO";
	    }
	}

	if (stack.isEmpty())
	    return "YES";
	else
	    return "NO";

    }

    public static void main(String[] args) throws IOException {

	int t = scanner.nextInt();
	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	for (int tItr = 0; tItr < t; tItr++) {
	    String s = scanner.nextLine();

	    String result = isBalanced(s);

	    System.out.println(result);
	}

	scanner.close();
    }

}
