package Challenge30DaysOfCode.Day14Scope;

/**
 * @author Sophia Kaya
 */
public class Difference {

    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
	this.elements = elements;
    }

    public void computeDifference() {

	if (this.elements.length > 1) {

	    int max = this.elements[0];
	    int min = this.elements[0];

	    for (int i = 1; i < this.elements.length; i++) {

		if (this.elements[i] > max)
		    max = this.elements[i];

		if (this.elements[i] < min)
		    min = this.elements[i];

	    }

	    this.maximumDifference = max - min;
	}

    }

}
