package com.armm;

public class Problem5 {

	public static void main(String[] args) {
		boolean next = true;
		int number = 1;
		while (next) {
			boolean isOk = true;
			for (int i = 1; i < 20; i++) {
				if (number%i!=0) {
					isOk = false;
					break;
				}
			}
			if (isOk) {
				System.out.println("NUMBER: "+number);
				next = false;
			} else {
				number++;
			}
		}
	}
	
}
