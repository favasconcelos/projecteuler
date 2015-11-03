
public class SmallestMultiple {

    private boolean primeNumberDivideAnyNumber;

    private int primeNumber;

    public SmallestMultiple() {
        primeNumberDivideAnyNumber = false;
        primeNumber = 1;
    }

    public int getMinimumMultipleCommonUntil(int number) {

        if (number <= 0) {
            return 0;
        }

        if (number == 1) {
            return 1;
        }

        int[] numbers = makeArrayWithNumbersUntil(number);
        boolean reachedMinimum = false;
        int minimumMultiple = 1;
        primeNumber = 2;

        while (!reachedMinimum) {

            primeNumberDivideAnyNumber = isPrimeNumberDivisorOfAnyNumber(numbers);

            if (primeNumberDivideAnyNumber) {
                // When reached minimum, all numbers will be one
                // So if we get all numbers and multiply one each other
                // the result will be one
                int currentMultipleNumber = 1;

                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] % primeNumber == 0) {
                        numbers[i] = numbers[i] / primeNumber;
                    }

                    currentMultipleNumber = currentMultipleNumber * numbers[i];
                }

                reachedMinimum = (currentMultipleNumber == 1);
                minimumMultiple = updateMinimumMultipleCommon(minimumMultiple);
            }

            updateCurrentPrimeNumber();
        }

        resetPrimeNumber();
        return minimumMultiple;
    }

    private int[] makeArrayWithNumbersUntil(int number) {
        int[] numbers = new int[number];
        for (int i = 0; i < number; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }

    private void updateCurrentPrimeNumber() {
        if (!primeNumberDivideAnyNumber) {
            primeNumber++;

            while (!isPrime(primeNumber)) {
                primeNumber++;
            }
        }

    }

    private boolean isPrimeNumberDivisorOfAnyNumber(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % primeNumber == 0) {
                return true;
            }
        }

        return false;
    }

    private int updateMinimumMultipleCommon(int minimumMultiple) {
        return minimumMultiple * primeNumber;
    }

    private int resetPrimeNumber() {
        return 2;
    }

    private boolean isPrime(long number) {
        int totalDivisors = 1;
        for (long i = 1; i < number / 2; i++) {
            if (number % i == 0) {
                totalDivisors++;

                if (totalDivisors > 2) {
                    return false;
                }
            }
        }

        return true;
    }
}
