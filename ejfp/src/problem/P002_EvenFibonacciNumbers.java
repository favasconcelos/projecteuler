package problem;

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
 * By starting with 1 and 2, the first 10 terms will be:
 * 
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
 * find the sum of the even-valued terms. 
 * 
 * @author erick
 *
 */
public class P002_EvenFibonacciNumbers implements IProblem {

	private static final long FOUR_MILLION = 4000000l;
	
	@Override
	public String getResult() {

		// Start with the first even fibonacci value.
		long sum = 2;

		// Previous values.
		long previousNumber1 = 1;
		long previousNumber2 = 2;
		
		// Current fibonacci term.
		long fTerm = 0;

		while (fTerm < FOUR_MILLION) {
			fTerm = previousNumber1 + previousNumber2;

			// Sum if the term is even.
			if (fTerm % 2 == 0) {
				sum += fTerm;
//				System.out.println("Partial: " + sum);
			}

			// Update previous values.
			previousNumber1 = previousNumber2;
			previousNumber2 = fTerm;
		}

		return "" + sum;
	}

}
