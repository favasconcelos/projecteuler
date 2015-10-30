import problem.IProblem;
import problem.P007_10001stPrime;

public class ProjectEulerMain {

	public static void main(String[] args) {
		String result;

		long totalTime;
		long startTime = System.nanoTime();
		
		// Get the Problem Solver.
		IProblem instance = new P007_10001stPrime(); 

		// Run the solution.
		result = instance.getResult();
		
		// Get the elapsed execution time.
		totalTime = System.nanoTime() - startTime;

		// Show the result.
		System.out.println("Result is: " + result);

		// Show the elapsed time.
		System.out.println("Execution time = " + (totalTime / Math.pow(10,9)) + " seconds.");
	}

}
