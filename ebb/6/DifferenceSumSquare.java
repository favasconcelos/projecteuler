package br.com.braga.difference.sum;

public class DifferenceSumSquare {

    public int differenceOfFirstNumbersUntil(int number) {

        /*
        * The square of the sum can be calculate as the follow equation
        * (a + b + c) ^ 2 =
        * (a + b + c) * (a + b + c)
        *  a^2 + ab + ac + ab + b^2 + bc + ac + bc + c^2 =
        *  a^2 + b^2 + c^2 + 2 * ab + 2 * bc + 2 * ac
        *
        *  And the sum of square is
        *  a^2 + b^2 + c^2
        *
        *  So, the difference between the square of the sum and the sum of the square is
        *  a^2 + b^2 + c^2 + 2 * ab + 2 * bc + 2 * ac - (a^2 + b^2 + c^2) =
        *  2 * ab + 2 * bc + 2 * ac
        * */

        int result = 0;

        for (int i = 1; i < number; i++) {
            for (int j = i + 1; j <= number; j++) {
                result = result + (i * j) * 2;
            }
        }

        return result;
    }
}
