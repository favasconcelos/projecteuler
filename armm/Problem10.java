package com.armm;

import java.util.ArrayList;

public class Problem10 {

	private static long sum = 0L;
	public static void main(String[] args) {
		int LIMIT = 2000000;

		long value = 2L;
		ArrayList<Long> list = new ArrayList<Long>();
		while (value <= LIMIT) {
			if (isPrimeNumber(value)) {
				list.add(value);
				sum += value; 
				if (list.size() == 1)
					System.out.println(value);
				else 
					System.out.println("+"+value);
			}
			
			value++;
		}
		System.out.println("RESULTADO = "+sum);

	}
	
	private static boolean isPrimeNumber(double num){
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
