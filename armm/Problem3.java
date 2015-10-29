package com.armm;

public class Problem3 {

	public static void main(String[] args) {
		long LIMIT = 600851475143L;
		long primeFactor = 13195L;
		long value = LIMIT;
		
		int number = 2;
		int largest = 0;
		while (value != 1) {
			if (isPrimeNumber(number) && value%number==0) {
				value = value/number;
				largest = number;
			}
			number++;
		}
		System.out.println("largest: "+largest);
		
	}
	
	private static boolean isPrimeNumber(int value) {
		int count = 0;
		for (int i = 2; i <= value; i++) {
			if (value % 2 == 0) {
				count++;
			}
			if (count > 3) {
				return false;
			}
		}
		return true;
	}

}
