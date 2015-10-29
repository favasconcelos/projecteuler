package problems;

public class Even_Fibonacci_numbers {
	public static void main(String[] args) {
		long sum = 0, fib1 = 1, fib2 =1;
		while (fib2 <= 4000000) {
			if(fib2 %2 == 0){
				sum += fib2;
			}
			//System.out.println("sum "+sum);
			long aux = fib2;
			fib2 = fib1 + fib2;
			fib1 = aux;
			//System.out.println(fib1+", "+fib2);
			
		}
		System.out.println("sum "+sum);
	}
}
