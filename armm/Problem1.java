package com.armm;

public class Problem1 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 1000; i++) {
			if (i%3==0 || i%5==0) {
				count += i; 
			}
		}
		System.out.println("Problem1: "+count);
	}

}
