package problems;

public class Largest_prime_factor {
	public static void main(String[] args) {
		for (double i = Math.floor(Math.sqrt(600851475143.0)); i > 0; i--) {
			if(isPrime(i)){
				double result = 600851475143.0 % i; 
				if(result == 0){
					System.out.println(i);
					break;
				}
			}
		}
	}
	static boolean isPrime(double num){
		if(num == 0){
			return false;
		}
		if(num == 1 || num == 2){
			return true;
		}
		if(num % 2 == 0){
			return false;
		}
		double limit = Math.sqrt(num);
		for (int i = 3; i <= limit;) {
			if(num % i == 0){
				return false;
			}
			i+=2;
		}
		return true;
	}
}
