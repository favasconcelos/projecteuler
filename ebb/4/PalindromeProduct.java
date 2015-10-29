public class PalindromeProduct {
    public int getLargestPalindrome(int power) {
        assert(power > 1);

        int maxPalindrome = 0;
        int maxNumberToTest = getMaxNumberOfPower(power);
        int minNumberToTest = getMaxNumberOfPower(power - 1);

        for (int i = minNumberToTest; i < maxNumberToTest; i++) {
            for (int j = minNumberToTest; j <maxNumberToTest; j++) {
                int numberTest = i * j;

                if (isPalindrome(numberTest) && numberTest > maxPalindrome){
                    maxPalindrome = numberTest;
                }
            }
        }

        return maxPalindrome;
    }

    private int getMaxNumberOfPower(int power) {
        final int base = 10;
        int maxNumber = 10;
        int currentPower = 1;

        while (currentPower < power) {
            maxNumber = maxNumber * base;
            currentPower++;
        }

        return maxNumber;
    }

    public boolean isPalindrome(int number) {
        int currentNumber = number;
        int reverseNumber = 0;

        while (number > 0) {
            int restNumber = number % 10;
            reverseNumber = (10 * reverseNumber) + restNumber;
            number = number / 10;
        }

        return currentNumber == reverseNumber;
    }

}
