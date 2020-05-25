package warmup;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import warmup.CountingValleys;

/*
 * Test for {@link CountingValleys)
 */
public class CountingValleysTest {

    @Test
    public void countingValleysTest() {

	assertEquals(1, CountingValleys.countingValleys(8, "UDDDUDUU"));
	assertEquals(2, CountingValleys.countingValleys(12, "DDUUDDUDUUUD"));

    }

}
