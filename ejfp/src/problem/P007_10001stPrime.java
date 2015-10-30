package problem;

public class P007_10001stPrime implements IProblem {

	private static final int PRIME_ORDER = 10001;
	
	@Override
	public String getResult() {
		
		int primeCounter = 0;
		
		long counter = 1;
		while (primeCounter < PRIME_ORDER) {

			// Check if it is prime and increment the prime counter if true.
			if (isPrime(counter)) {
				++primeCounter;
//				System.out.println("Prime number found: " + counter);
			} 

			// Increment counter.
			++counter;
		}
		
		return "" + (counter - 1);
	}

	// Based on http://stackoverflow.com/questions/2385909/what-would-be-the-fastest-method-to-test-for-primality-in-java.
	private boolean isPrime (long number) {

	    if (number == 2 || number == 3) { 
	    	return true; 
	    }

		if (number < 2 || number % 2 == 0 || number % 3 == 0) {
			return false;
		}
		
		long sqrt = (long) Math.sqrt(number) + 1;

		for (long i = 6L; i <= sqrt; i = i + 6) {
			if (number % (i - 1) == 0 || number % (i + 1) == 0)
				return false;
		}

	    return true;
	}

}
