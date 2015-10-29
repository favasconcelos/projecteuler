package com.armm;

public class Problem4 {

	public static void main(String[] args) {
		int result = 0;
		for (int i = 0; i <= 999; i++) {
			for (int j = 0; j <= 999; j++) {
				String value = String.valueOf(i*j);
				int length = value.length(); 
				if (length%2==0) {
					String value1 = value.substring(0, (length/2));
					String value2 = value.substring(length/2, length);
					String value2reverse = new StringBuilder(value2).reverse().toString();
					if (value1.equalsIgnoreCase(value2reverse) && Integer.valueOf(value) > result) {
						result = Integer.valueOf(value);
					}
				}
			}	
		}
		System.out.println("RESULT: "+result);
	}
	
}
