package com.suryatechsources.projecteuler;

import java.math.BigInteger;

public class Problem078CoinPartitions {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int i = 1;
		BigInteger output;
		BigInteger div = new BigInteger("1000000");
		while (true) {
			System.out.println(i
							+ " "
							+ (output = Problem076CountingSummations
									.countSumBig(i, 0)));
			if (output.mod(div) == BigInteger.ZERO) {
				System.out.println(i);
				break;
			}
			i++;
		}
		System.out.println("Time Taken : "
				+ (System.currentTimeMillis() - start));
	}
}
