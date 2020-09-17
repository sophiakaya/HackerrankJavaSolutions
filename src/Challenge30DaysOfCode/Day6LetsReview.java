package Challenge30DaysOfCode;

import java.util.Scanner;

/**
 * @author Sophia Kaya
 */
public class Day6LetsReview {

    public static void main(String[] args) {
	/*
	 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
	 * class should be named Solution.
	 */
	Scanner sc = new Scanner(System.in);
	int T = Integer.valueOf(sc.nextLine());

	for (int i = 0; i < T; i++) {

	    String s = sc.nextLine();
	    char c[] = s.toCharArray();

	    StringBuilder odd = new StringBuilder();
	    StringBuilder even = new StringBuilder();

	    for (int j = 0; j < c.length; j++) {
		if (j % 2 == 0 || j == 0) {
		    even.append(c[j]);
		} else {
		    odd.append(c[j]);
		}
	    }
	    System.out.println(even.toString() + " " + odd.toString());

	}

	sc.close();
    }
}
