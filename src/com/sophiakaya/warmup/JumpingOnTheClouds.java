package com.sophiakaya.warmup;

/**
 * @author Sophia Kaya
 */
public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c) {

	return countJump(0, c, 0);
    }

    public static int countJump(int currentIndex, int[] c, int currentJump) {

	if (currentIndex < c.length - 1) {

	    if (currentIndex + 2 <= c.length - 1 && c[currentIndex + 2] == 0)
		currentIndex += 2;

	    else if (currentIndex + 1 <= c.length - 1 && c[currentIndex + 1] == 0)
		currentIndex += 1;

	    currentJump += 1;

	    currentJump = countJump(currentIndex, c, currentJump);

	}

	return currentJump;

    }

    public static void main(String[] args) {

	System.out.println(jumpingOnClouds(new int[] { 0, 0, 1, 0, 0, 1, 0 }));
	System.out.println(jumpingOnClouds(new int[] { 0, 0, 0, 1, 0, 0 }));
    }

}
