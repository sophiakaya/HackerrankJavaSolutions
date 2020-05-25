package warmup;

/**
 * @author Sophia Kaya
 */
public class CountingValleys {

    static int countingValleys(int n, String s) {

	if (n < 2 || n > 1000000)
	    return 0;

	int countValley = 0;
	int currentLevel = 0;
	int previousLevel = 0;

	String[] content = s.split("");

	for (int i = 0; i < content.length; i++) {

	    previousLevel = currentLevel;

	    if (content[i].equals("U"))
		currentLevel++;

	    if (content[i].equals("D"))
		currentLevel--;

	    boolean isValleyFinished = isValleyFinished(previousLevel, currentLevel);

	    if (isValleyFinished)
		countValley++;
	}

	return countValley;
    }

    public static boolean isValleyFinished(int previousLevel, int currentLevel) {

	return previousLevel < 0 && currentLevel >= 0;
    }

    public static void main(String[] args) {

	System.out.println(countingValleys(8, "UDDDUDUU"));
	System.out.println(countingValleys(12, "DDUUDDUDUUUD"));

    }

}
