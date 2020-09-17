package problemsolving.strings;

/**
 * @author Sophia Kaya
 */
public class HighestValuePalindrome {

    static String highestValuePalindrome(String s, int n, int k) {

	char c[] = s.toCharArray();
	int start = 0;
	int end = s.length() - 1;

	if (!isPalindrome(s)) {

	    while (start < end) {

		if (c[start] != c[end]) {

		    char max = (char) Math.max(c[start], c[end]);
		    c[start] = max;
		    c[end] = max;
		    k--;
		}
		start++;
		end--;
		if (k < 0)
		    break;
	    }

	    if (k < 0)
		return "-1";
	}

	start = 0;
	end = s.length() - 1;

	while (start <= end) {

	    if (start == end && c[start] != '9' && k >= 1) {
		c[start] = '9';
		k--;
	    }

	    if (c[start] != '9') {

		if ((c[start] != s.charAt(start) || c[end] != s.charAt(end)) && k >= 1) {
		    c[start] = '9';
		    c[end] = '9';
		    k--;
		}
		if (c[start] == s.charAt(start) && c[end] == s.charAt(end) && k >= 2) {
		    c[start] = '9';
		    c[end] = '9';
		    k--;
		    k--;
		}

	    }
	    start++;
	    end--;

	}

	return new String(c);

    }

    public static boolean isPalindrome(String text) {

	StringBuilder reverse = new StringBuilder();
	char[] plain = text.toCharArray();
	for (int i = plain.length - 1; i >= 0; i--) {
	    reverse.append(plain[i]);
	}
	return (reverse.toString()).equals(text);
    }

    public static void main(String[] args) {

	System.out.println(highestValuePalindrome("092282", 0, 3)); // Expected 992299
	System.out.println(highestValuePalindrome("3943", 0, 1)); // Expected 3993
	System.out.println(highestValuePalindrome("0011", 0, 1)); // Expected -1
	System.out.println(highestValuePalindrome("5", 0, 1)); // Expected 9
	System.out.println(highestValuePalindrome("932239", 0, 2)); // Expected 992299
    }

}
