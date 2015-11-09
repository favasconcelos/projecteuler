package br.com.braga.difference.sum;

import org.junit.Assert;
import org.junit.Test;

public class DiferenceSumSquareTest {

    @Test
    public void differenceOfSumSquareOneAndSquareSumOneShouldBeZero() {
        DifferenceSumSquare differenceSumSquare = new DifferenceSumSquare();
        Assert.assertEquals(0, differenceSumSquare.differenceOfFirstNumbersUntil(1));
    }

    @Test
    public void differenceOfSumSquareZeroAndSquareSumZeroShouldBeZero() {
        DifferenceSumSquare differenceSumSquare = new DifferenceSumSquare();
        Assert.assertEquals(0, differenceSumSquare.differenceOfFirstNumbersUntil(0));
    }

    @Test
    public void differenceOfSumSquareTwoAndSquareSumTwoShouldBeFive() {
        DifferenceSumSquare differenceSumSquare = new DifferenceSumSquare();
        Assert.assertEquals(4, differenceSumSquare.differenceOfFirstNumbersUntil(2));
    }

    @Test
    public void differenceOfSumSquareFiveAndSquareSumFiveShouldBeOneHundredSeventy() {
        DifferenceSumSquare differenceSumSquare = new DifferenceSumSquare();
        Assert.assertEquals(170, differenceSumSquare.differenceOfFirstNumbersUntil(5));
    }

    @Test
    public void differenceOfSumSquareTenAndSquareSumFiveShouldBeTwoThousandSixHundreadFourty() {
        DifferenceSumSquare differenceSumSquare = new DifferenceSumSquare();
        Assert.assertEquals(2640, differenceSumSquare.differenceOfFirstNumbersUntil(10));
    }

}
