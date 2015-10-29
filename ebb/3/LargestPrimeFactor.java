public class LargestPrimeFactor {
    private long mLargest;

    public long getLargest(long number) {
        if (number <= 0) {
            return 0;
        }

        if (isPrime(number)) {
            return number;
        }

        for (int i = 2; i < number / 2; i++) {
            if (isPrime(i) && number % i == 0) {
                number = number / i;
                break;
            }
        }

        return getLargest(number);
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
