import problem.IProblem;
import problem.P004_LargestPalindromeProduct;

public class ProjectEulerMain {

	public static void main(String[] args) {
		String result;

		// Get the Problem Solver.
		IProblem instance = new P004_LargestPalindromeProduct(); 

		// Run the solution.
		result = instance.getResult();

		// Show the result.
		System.out.println("Result is: " + result);
	}

}
