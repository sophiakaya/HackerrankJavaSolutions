/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import warmup.RepeatedString;

/*
 * Test for {@link RepeatedString)
 */
public class RepeatedStringTest {

    @Test
    public void repeatedStringTest() {

	assertEquals(7, RepeatedString.repeatedString("aba", 10));
	assertEquals(51574523448L, RepeatedString.repeatedString(
		"kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm",
		736778906400L));

    }

}
