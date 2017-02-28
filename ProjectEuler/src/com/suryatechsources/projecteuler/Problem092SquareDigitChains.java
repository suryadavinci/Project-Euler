package com.suryatechsources.projecteuler;

import java.util.Scanner;

public class Problem092SquareDigitChains {

	static int[] lookUp;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long start = System.currentTimeMillis();
		int k = s.nextInt();
		lookUp = new int[9 * 9 * k + 1 + 89];
		int count = 0;
		int[] digit;
		int dig = 0;
		for (int i = 2; i < Math.pow(10, k); i++) {
			int val = i;
			while (val != 89 && val != 1) {
				val = sumOfSquares(val);
				if (lookUp[val] == 89) {
					val = 89;

					break;
				} else if (lookUp[val] == 1) {
					val = 1;
					break;
				}

			}
			if (val == 89) {
				if (i < 9 * 9 * k + 1) {
					lookUp[i] = 89;
				}
				count += 1;
			} else {

				if (i < 9 * 9 * k + 1) {
					lookUp[i] = 1;
				}
			}
		}
		System.out.println(count);
		System.out.println((System.currentTimeMillis() - start)/1000+"s");
	}

	public static int sumOfSquares(int n) {
		int sum = 0;
		while (n != 0) {
			sum = sum + ((n % 10) * (n % 10));
			n = n / 10;
		}
		return sum;
	}

}
