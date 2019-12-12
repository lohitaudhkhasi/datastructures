package com;

public class LongetBinary {

	public int solution(int N) {
		int counter = 0;
		int max = 0;
		boolean start = false;
		// System.out.println(number >> 1);
		for (int i = N; i > 0; i = i >> 1) {
			int mod = i % 2;
			if (mod == 1) {
				if (start && counter > max) {
					max = counter;
				} else {
					start = true;
				}
				counter = 0;
			} else {
				if (start) {
					counter++;
				}
			}
		}
		return max;
	}
}
