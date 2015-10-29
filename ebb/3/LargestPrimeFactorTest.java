import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ericbraga on 29/10/15.
 */
public class LargestPrimeFactorTest {

    @Test
    public void largestPrimeFactorForFifteenIsFive() {
        int number = 15;
        LargestPrimeFactor primeFactor = new LargestPrimeFactor();
        assertEquals(5, primeFactor.getLargest(number));
    }

    @Test
    public void largestPrimeFactorForTwentyOneIsSeven() {
        int number = 21;
        LargestPrimeFactor primeFactor = new LargestPrimeFactor();
        assertEquals(7, primeFactor.getLargest(number));
    }

    @Test
    public void largestPrimeFactorFor13195() {
        int number = 13195;
        LargestPrimeFactor primeFactor = new LargestPrimeFactor();
        assertEquals(29, primeFactor.getLargest(number));
    }
}