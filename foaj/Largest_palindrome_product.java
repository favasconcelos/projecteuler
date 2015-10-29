package problems;

public class Largest_palindrome_product {
	public static void main(String[] args) {
		int biggest = 0;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int value = i*j; 
				int a = (value)/1000;
				int b = (value)%1000; 
				String s1 = a+"";
				String s2 = new StringBuilder(b+"").reverse().toString();
				if((s1).equals(s2)){
					if(value > biggest){
						biggest = i*j;
					}
				}
			}
		}
		System.out.println(biggest);
		
	}
}
