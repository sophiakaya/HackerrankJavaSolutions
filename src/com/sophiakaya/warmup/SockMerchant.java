package com.sophiakaya.warmup;

import java.io.IOException;
import java.util.HashMap;

/**
 * @author Sophia Kaya
 */
public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {

	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	for (int i = 0; i < ar.length; i++) {

	    if (map.get(ar[i]) != null)
		map.put(ar[i], map.get(ar[i]) + 1);
	    else
		map.put(ar[i], 1);

	}

	int reduce = (int) map.entrySet().stream().filter(e -> e.getValue() % 2 != 0).count();

	int result = map.values().stream().mapToInt(Integer::valueOf).sum() - reduce;

	return result / 2;

    }

    public static void main(String[] args) throws IOException {

	System.out.println(sockMerchant(9, new int[] { 10, 20, 20, 10, 10, 30, 50, 10, 20 }));
	System.out.println(sockMerchant(10, new int[] { 1, 1, 3, 1, 2, 1, 3, 3, 3, 3 }));

    }
}
