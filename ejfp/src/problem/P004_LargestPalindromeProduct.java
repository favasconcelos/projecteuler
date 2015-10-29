package problem;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product 
 * of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * @author erick
 *
 */
public class P004_LargestPalindromeProduct implements IProblem {

	@Override
	public String getResult() {

		// Initial values.
		int number1 = 999;
		int number2 = 999;

		// The higher palindrome number.
		int higherNumber = 0;
		
		// Next number.
		int number;

		// Iterate one number.
		while (number2 > 0) {
			number1 = 999;

			// Iterate another number.
			while (number1 > 0) {
				
				// Get the next number.
				number = number1 * number2;
				
				// Check if the number is palindrome and is the higher one.
				if (isPalindrome(number) && number > higherNumber) {
					higherNumber = number;
				}
				
				--number1;
			}
			
			--number2;
		}

		return "" + higherNumber;
	}

	private boolean isPalindrome (int value) {

		boolean result = false;

		// The first and the last digits are equals. Ex.: 123321.
		if (value / 100000 == value % 10) {
			
			// Remove the first and the last digits.
			value = value - (value / 100000) * 100000;
			value = value / 10;
			
			// The first and the last digits are equals. Ex.: 2332.
			if (value / 1000 == value % 10) {
				
				// Remove the first and the last digits.
				value = value - (value / 1000) * 1000;
				value = value / 10;

				// The first and the last digits are equals. Ex.: 33.
				if (value / 10 == value % 10) {
					result = true;
				}
			}
		}

		return result;
	}
	
}
