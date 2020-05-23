/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sophiakaya.warmup;

import java.io.IOException;

public class RepeatedString {

    static long repeatedString(String s, long n) {

	int min = 1;
	int maxs = 100;
	long maxn = 1000000000000L;

	if (s instanceof String && s.length() >= min && s.length() <= maxs && n >= min && n <= maxn) {

	    if (s.length() == 1 && s.equals("a"))
		return n;

	    return count(s, 'a') * (n / s.length()) + count(s.substring(0, (int) (n % s.length())), 'a');
	}

	return 0;
    }

    static int count(String s, char target) {
	return (int) s.chars().filter(x -> x == target).count();
    }

    public static void main(String[] args) throws IOException {

	System.out.println(repeatedString("aba", 10));
	System.out.println(repeatedString(
		"kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm",
		736778906400L));
    }

}
