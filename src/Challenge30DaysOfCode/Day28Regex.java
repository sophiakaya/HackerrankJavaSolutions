package Challenge30DaysOfCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Sophia Kaya
 */
public class Day28Regex {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	int N = scanner.nextInt();
	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	List<String> list = new ArrayList<>();
	String regexString = "[a-zA-Z\\s]+";
	String regexEmail = ".+@gmail\\.com$";
	Pattern patternString = Pattern.compile(regexString);
	Pattern patternEmail = Pattern.compile(regexEmail);

	Matcher matcherString = null;
	Matcher matcherEmail = null;

	for (int NItr = 0; NItr < N; NItr++) {
	    String[] firstNameEmailID = scanner.nextLine().split(" ");

	    String firstName = firstNameEmailID[0];

	    String emailID = firstNameEmailID[1];

	    matcherString = patternString.matcher(firstName);
	    matcherEmail = patternEmail.matcher(emailID);

	    if (matcherString.find() && matcherEmail.find() && firstName.length() <= 20 && emailID.length() <= 50) {
		list.add(firstName);
	    }

	    // System.out.println(firstName);
	    // System.out.println(emailID);

	}

	list.stream().sorted().forEach(s -> System.out.println(s));

	scanner.close();
    }

}
