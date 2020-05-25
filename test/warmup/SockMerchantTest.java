package warmup;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import warmup.SockMerchant;

/*
 * Test for {@link SockMerchant)
 */
public class SockMerchantTest {

    @Test
    public void sockMerchantTest() {

	assertEquals(3, SockMerchant.sockMerchant(9, new int[] { 10, 20, 20, 10, 10, 30, 50, 10, 20 }));
	assertEquals(4, SockMerchant.sockMerchant(10, new int[] { 1, 1, 3, 1, 2, 1, 3, 3, 3, 3 }));
    }

}
