package com.suryatechsources.projecteuler;

import java.math.BigInteger;
import java.util.HashMap;

public class Problem076CountingSummations {
	static int count;
	static HashMap<String, Long> mem = new HashMap<String, Long>();
	static HashMap<String, BigInteger> memBig = new HashMap<String, BigInteger>();

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int i = 1;
		long output;
		for( i=0;i<100;i++)
			System.out.println(i+ " " + (output = countSum(i, 0)));
		System.out.println("Time Taken : "
				+ (System.currentTimeMillis() - start));
	}

	public static long countSum(int sum, int minimal) {
		long temp = 1;
		if (sum == 1) {
			mem.put(sum + "-" + minimal, 1l);
			return 1;
		}
		if (mem.containsKey(sum + "-" + minimal))
			return mem.get(sum + "-" + minimal);
		for (int i = 1; i <= sum / 2; i++) {
			if (i >= minimal)
				temp = temp + countSum(sum - i, i);
		}
		mem.put(sum + "-" + minimal, temp);
		return temp;
	}

	public static BigInteger countSumBig(int sum, int minimal) {
		BigInteger temp = BigInteger.ONE;
		if (sum == 1) {
			memBig.put(sum + "-" + minimal, BigInteger.ONE);
			return BigInteger.ONE;
		}
		if (mem.containsKey(sum + "-" + minimal))
			return memBig.get(sum + "-" + minimal);
		for (int i = 1; i <= sum / 2; i++) {
			if (i >= minimal)
				temp = temp.add(countSumBig(sum - i, i));
		}
		memBig.put(sum + "-" + minimal, temp);
		return temp;
	}
}