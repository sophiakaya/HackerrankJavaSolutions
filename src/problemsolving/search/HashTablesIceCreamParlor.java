package problemsolving.search;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * @author Sophia Kaya
 */
public class HashTablesIceCreamParlor {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {

	Hashtable<Integer, Integer> ht = new Hashtable<>();

	for (int i = 0; i < cost.length - 1; i++) {
	    if (cost[i] < money) {
		if (ht.containsKey(money - cost[i])) {
		    System.out.println(ht.get(money - cost[i]) + 1 + " " + (i + 1));
		    break;
		}
		if (!ht.containsKey(cost[i]))
		    ht.put(cost[i], i);
	    }
	}
    }

    public static void main(String[] args) {
	int t = scanner.nextInt();
	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	for (int tItr = 0; tItr < t; tItr++) {
	    int money = scanner.nextInt();
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	    int n = scanner.nextInt();
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	    int[] cost = new int[n];

	    String[] costItems = scanner.nextLine().split(" ");
	    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	    for (int i = 0; i < n; i++) {
		int costItem = Integer.parseInt(costItems[i]);
		cost[i] = costItem;
	    }

	    whatFlavors(cost, money);
	}

	scanner.close();
    }

}
