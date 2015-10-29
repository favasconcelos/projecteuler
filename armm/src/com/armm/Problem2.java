package com.armm;

import java.util.ArrayList;

public class Problem2 {

	public static void main(String[] args) {
		int sequence = 0;
		int count = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		final int LIMIT = 4000000;
		while (sequence < LIMIT) {
			int size = list.size();
			if (size >= 2) {
				sequence =  list.get(size-2) + list.get(size-1);
			} else {
				sequence++;
			}
			if (sequence < LIMIT) {
				list.add(sequence);
				System.out.print(sequence+", ");
				if (sequence % 2 == 0) {
					count += sequence;
				}
			} else {
				sequence = LIMIT;
			}
		}
		System.out.println(" COUNT: "+count);
	}

}
