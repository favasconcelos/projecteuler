package problem;

import java.util.HashSet;
import java.util.Iterator;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000. 
 * 
 * @author erick
 *
 */
public class P001_MultiplesOf3And5 implements IProblem {

	public String getResult() {
		int result = 0;
		final int TOP_NUMBER = 1000;
		
		HashSet<Integer> multiplesSet = new HashSet<Integer>();
		
		// Get all multiples of 3.
		for (int counter = 0; counter < TOP_NUMBER; counter = counter + 3) {
			multiplesSet.add(counter);
		}
		
		// Get all multiples of 5.
		for (int counter = 0; counter < TOP_NUMBER; counter = counter + 5) {
			multiplesSet.add(counter);
		}

		// Sum all numbers.
		Iterator<Integer> iterator = multiplesSet.iterator();
		while (iterator.hasNext()) {
			result += (Integer) iterator.next();
		}

		return "" + result;
	}

}
