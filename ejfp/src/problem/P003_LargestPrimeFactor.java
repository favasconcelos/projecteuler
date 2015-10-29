package problem;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * @author erick
 *
 */
public class P003_LargestPrimeFactor implements IProblem {

	private static final long TARGET_NUMBER = 600851475143l;
	
	@Override
	public String getResult() {
		
		// Division result value.
		long divisionResult = TARGET_NUMBER;

		// Maximum prime factor for the target number.
		long primeNumberLimit = (long) Math.sqrt(TARGET_NUMBER);
		System.out.println("primeNumberLimit: " + primeNumberLimit);

		// Current testing factor number. 
		long currentFactor = 2; 

		// Iterate all numbers until find the largest factor.
		while (divisionResult > 1 && currentFactor < primeNumberLimit) {

			// If find a factor divide the number.
			while (divisionResult % currentFactor == 0) {
				divisionResult /= currentFactor;
				System.out.println("divisionResult = " + divisionResult);
			}

			++currentFactor;
		}
		
		--currentFactor;

		return (currentFactor < primeNumberLimit) ? "" + currentFactor : "FAILED!";
	}

}
