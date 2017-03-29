package com.suryatechsources.projecteuler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Problem078CoinPartitions {

	static int[] pentagonals;

	static int[] partitionsBUp = new int[Integer.MAX_VALUE >> 3];
	static HashMap<Integer, Long> partitions = new HashMap<Integer, Long>();

	static {
		System.out.println(-1 / 2);
		partitions.put(0, 1l);

		System.out.println(Integer.MAX_VALUE >> 3);
	}

	public static void main(String[] args) {
		System.out.println(countPartitionsBUp());
	}

	public static void main1(String[] args) {

		pentagonals = new int[10];
		int k;
		for (int m = 0; m < pentagonals.length; m++) {

			if (m % 2 == 0)
				k = m / 2 + 1;
			else
				k = -m / 2 - 1;

			pentagonals[m] = ((k * (3 * k - 1)) / 2);
		}

	}

	public static long countPartitionsBUp() {

		int i;
		int n = 1;
		partitionsBUp[0] = 1;
		int nextPent = 0;
		int sign = 1;
		int m, k;
		while (true) {
			i = 0;
			nextPent = 1;
			while (nextPent <= n) {
				sign = (i % 4 == 0 || i % 4 == 1) ? 1 : -1;
				partitionsBUp[n] += sign * partitionsBUp[n - nextPent];
				partitionsBUp[n] %= 1000000;
				// partitionsBUp[n]%= 100;

				// System.out.println(nextPent+" "+partitionsBUp[n]);
				i++;
				k = (i % 2 == 0) ? (i / 2 + 1) : (-i / 2 - 1);
				nextPent = k * (3 * k - 1) / 2;

			}
			// System.out.println("its out "+partitionsBUp[n]);
			if (partitionsBUp[n] == 0)
				break;
			n++;
		}

		return n;

	}

	public static long countPartitions(int n) {
		int i = 0;
		long partitionCount = 0;
		int value = 0;

		if (partitions.containsKey(n))
			return partitions.get(n);

		// if(n==0)return 1;

		while (n >= pentagonals[i]) {
			value = (i % 4 == 0 || i % 4 == 1) ? 1 : -1;
			// System.out.println(value+" "+i);
			partitionCount = partitionCount + value
					* countPartitions(n - pentagonals[i]);
			partitionCount = partitionCount % 1000000;
			i++;
		}
		// System.out.println(partitionCount);
		partitions.put(n, partitionCount);
		return partitionCount;
	}

}
