import org.junit.Assert;
import org.junit.Test;

public class SmallestMultipleTest {

    @Test
    public void forOneNumberSmallestMultipleShouldBeOne() {
        SmallestMultiple smallestMultiple = new SmallestMultiple();
        Assert.assertEquals(1, smallestMultiple.getMinimumMultipleCommonUntil(1));
    }

    @Test
    public void forTwoNumberSmallestMultipleShouldBeTwo() {
        SmallestMultiple smallestMultiple = new SmallestMultiple();
        Assert.assertEquals(2, smallestMultiple.getMinimumMultipleCommonUntil(2));
    }

    @Test
    public void forFiveNumberSmallestMultipleShouldBeSixty() {
        SmallestMultiple smallestMultiple = new SmallestMultiple();
        Assert.assertEquals(60, smallestMultiple.getMinimumMultipleCommonUntil(5));
    }

    @Test
    public void forFourNumberSmallestMultipleShouldBeTwelve() {
        SmallestMultiple smallestMultiple = new SmallestMultiple();
        Assert.assertEquals(12, smallestMultiple.getMinimumMultipleCommonUntil(4));
    }

    @Test
    public void forTenNumberSmallestMultipleShouldBeTwoThousandFiveHundredTwenty() {
        SmallestMultiple smallestMultiple = new SmallestMultiple();
        Assert.assertEquals(2520, smallestMultiple.getMinimumMultipleCommonUntil(10));
    }


}