package Challenge30DaysOfCode;

import java.util.Scanner;

/**
 * @author Sophia Kaya
 */
public class Day16Exceptions {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String S = in.next();

	try {
	    int myInt = Integer.valueOf(S);

	    System.out.println(myInt);

	} catch (Exception e) {
	    System.out.println("Bad String");
	}
    }
}
