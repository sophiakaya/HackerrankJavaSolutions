package arrays;

/**
 * @author Sophia Kaya
 */
public class ArrayNewYearChaos {

    static void minimumBribes(int[] q) {

	int result = 0;
	for (int i = q.length - 1; i >= 0; i--) {

	    if (q[i] - (i + 1) > 2) {
		System.out.println("Too chaotic");
		return;
	    } else {

		int diff = q[i] - 2 > 0 ? q[i] - 2 : 0;

		for (int j = diff; j < i; j++) {
		    if (q[j] > q[i])
			result++;
		}

	    }

	}

	System.out.println(result);

    }

    public static void main(String[] args) {

	minimumBribes(new int[] { 2, 1, 5, 3, 4 });
	minimumBribes(new int[] { 2, 5, 1, 3, 4 });
	minimumBribes(new int[] { 1, 2, 5, 3, 7, 8, 6, 4 });
    }

}
