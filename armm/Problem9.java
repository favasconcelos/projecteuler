package com.armm;

public class Problem9 {


	public static void main(String[] args) {
		int RESULT = 1000;
		
		String resultValue = "";
		
		int i = 1;
		boolean nextI = true;
		while (nextI) {
			for (int j = 1; j < RESULT; j++) {
				long valueA = (long)Math.pow(i, 2);
				long valueB = (long)Math.pow(j, 2);
				long valueC = (long)(valueA+valueB);
				double decimal = Math.sqrt(valueC);
				if (valueA+valueB==valueC && (decimal-(int)decimal)==0) {
					System.out.println("1 - RESULT: ["+i+"^2]"+valueA+"+["+j+"^2]"+valueB+"= ["+(int)Math.sqrt(valueC)+"ˆ2]"+valueC);
					valueA = (long)Math.sqrt(valueA);
					valueB = (long)Math.sqrt(valueB);
					valueC = (long)Math.sqrt(valueC);
					if (valueA+valueB+valueC == RESULT) { 
						resultValue = valueA+"+"+valueB+"+"+valueC+"="+(valueA+valueB+valueC);
						System.out.println("2 - RESULT: "+resultValue);
						resultValue = valueA+"*"+valueB+"*"+valueC+"="+(valueA*valueB*valueC);
						break;
					}
				}
			}
			if (!resultValue.isEmpty()) {
				nextI = false;
			};
			i++;
		}
		
		System.out.println("RESULTADO: "+resultValue);
		
	}
}
