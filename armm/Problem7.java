package com.armm;

public class Problem7 {


	public static void main(String[] args) {
		final int PRIME_NUMBER = 10001;
		boolean next = true;
		int number = 2;
		int count = 0;
		while(next) {
			if (isPrimeNumber(number)) {
				count++;
			}

			if (count == PRIME_NUMBER) {
				next = false;
			} else {
				number++;	
			}
		}
		
		System.out.println("NUMBER: "+number);
	}
	
	private static boolean isPrimeNumber(int value) {
		int count = 0;
		for (int i = 2; i <= value; i++) {
			if (value % i == 0) {
				count++;
			}
			if (count >= 2) {
				return false;
			}
		}
		return true;
	}
}
