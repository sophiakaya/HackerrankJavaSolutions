package problemsolving.hashmaps;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Sophia Kaya
 */
public class TwoStrings {

    static String twoStrings(String s1, String s2) {

	Map<String, Long> mapOne = s1.chars().mapToObj(c -> Character.toString((char) c))
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	Map<String, Long> mapTwo = s2.chars().mapToObj(c -> Character.toString((char) c))
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	if (mapOne.keySet().stream().anyMatch(v -> mapTwo.containsKey(v))) {
	    return "YES";
	}

	return "NO";

    }

    public static void main(String[] args) {

	System.out.println(twoStrings("hello", "world"));
	System.out.println(twoStrings("hi", "world"));

    }

}
