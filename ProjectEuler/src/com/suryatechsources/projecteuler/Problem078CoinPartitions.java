package com.suryatechsources.projecteuler;

import java.math.BigInteger;
import java.util.Arrays;

public class Problem078CoinPartitions {

	static int[] pentagonals;
	static int[] values = new int[1000];

	public static void main(String[] args) {

		values[0] = 1;

		pentagonals = new int[2000];
		int k;
		for (int m = 0; m < pentagonals.length; m++) {

			if (m % 2 == 0)
				k = m / 2 + 1;
			else
				k = -m / 2 - 1;

			pentagonals[m] = ((k * (3 * k - 1)) / 2);

		}

		System.out.println(Arrays.toString(pentagonals));

		System.out.println(countPartitions(3));

	}

	public static int countPartitions(int n) {
		int i = 0;
		int partitionCount = 0;
		int value = 0;

		if (n == 0)
			return 1;

		while (n >= pentagonals[i]) {
			value = (i % 4 == 0 || i % 4 == 1) ? 1 : -1;
			System.out.println(value + " " + i);
			partitionCount = partitionCount + value * countPartitions(n - pentagonals[i]);
			i++;
		}
		System.out.println(partitionCount);
		return partitionCount;
	}

}
