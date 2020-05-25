package warmup;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import warmup.JumpingOnTheClouds;

/*
 * Test for {@link JumpingOnTheClouds)
 */

public class JumpingOnTheCloudsTest {

    @Test
    public void jumpingOnTheCloudsTest() {

	assertEquals(4, JumpingOnTheClouds.jumpingOnClouds(new int[] { 0, 0, 1, 0, 0, 1, 0 }));
	assertEquals(3, JumpingOnTheClouds.jumpingOnClouds(new int[] { 0, 0, 0, 1, 0, 0 }));

    }

}
