package hashmaps;

import java.util.HashMap;

/**
 * @author Sophia Kaya
 */
public class SherlockAndAnagrams {

    static int sherlockAndAnagrams(String s) {

	HashMap<String, Integer> map = new HashMap<>();

	for (int i = 0; i < s.length(); i++) {
	    for (int j = i + 1; j < s.length() + 1; j++) {

		String key = s.substring(i, j).chars().sorted()
			.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

		if (!map.containsKey(key))
		    map.put(key, 1);
		else
		    map.put(key, map.get(key) + 1);

	    }
	}

	return map.entrySet().stream().mapToInt(e -> e.getValue() * (e.getValue() - 1) / 2).sum();
    }

    public static void main(String[] args) {
	System.out.println(sherlockAndAnagrams("abba")); // Expected 4
	System.out.println(sherlockAndAnagrams("abcd")); // Expected 0
	System.out.println(sherlockAndAnagrams("ifailuhkqq")); // Expected 3
	System.out.println(sherlockAndAnagrams("kkkk")); // Expected 10
	System.out.println(sherlockAndAnagrams("cdcd")); // Expected 5

    }

}
