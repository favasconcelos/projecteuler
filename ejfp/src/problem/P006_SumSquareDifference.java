package problem;

public class P006_SumSquareDifference implements IProblem {

	@Override
	public String getResult() {

		long sqrSum = 0;
		long sumSqr = 0;
		
		for (int counter = 1; counter <= 100; counter++) {
			
			// Sum for the square sum (square will be performed later).
			sqrSum += counter;

			// Sum the squared values.
			sumSqr += counter * counter;

		}

		sqrSum = sqrSum * sqrSum;

		return "" + (sqrSum - sumSqr);
	}

}
