package problem;

public class P005_SmallestMultiple implements IProblem {

	@Override
	public String getResult() {
		
		int[] primeNumbers = { 2, 3, 5, 7, 11, 13, 17, 19 };
		int[] baseNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		boolean wasDivided = false;
		boolean divideAgain = false;
		
		int currentPrimeNumber = 0;
		long result = 1;

		// Divide for each prime numbers.
		for (int counter = 0; counter < primeNumbers.length; counter++) {

			// Get the next prime number.
			currentPrimeNumber = primeNumbers[counter];

			// Divide each base number.
			do {
				// Reset dividing again flag.
				divideAgain = false;

				for (int counterBase = 0; counterBase < baseNumbers.length; counterBase++) {

					wasDivided = baseNumbers[counterBase] % currentPrimeNumber == 0;

					if (wasDivided) {

						// Update the base number.
						baseNumbers[counterBase] = baseNumbers[counterBase] / currentPrimeNumber;

					}

					// Check if it was at least one division and it has to try to divide all numbers again.
					divideAgain = divideAgain || wasDivided;
				}

				// If it was at least one successful division.
				if (divideAgain) {

					// Update the result.
					result = result * currentPrimeNumber;
				}

			} while (divideAgain);
		}
		
		return "" + result;
	}

}
