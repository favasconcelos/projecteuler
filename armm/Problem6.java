package com.armm;

public class Problem6 {

	public static void main(String[] args) {
		int squareSum = 0;
		int sumSquare = 0;
		int MAX_VALUE = 100;
		
		for (int i = 1; i <= MAX_VALUE; i++) {
			squareSum += (int)Math.pow(i, 2);
			sumSquare += i;
		}
		sumSquare = (int)Math.pow(sumSquare, 2);
		
		int result = sumSquare-squareSum;
		System.out.println("RESULTADO: "+result);
	}
	
}
