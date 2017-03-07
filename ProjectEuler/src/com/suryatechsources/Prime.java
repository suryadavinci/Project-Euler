package com.suryatechsources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Prime {

	public static void main(String[] args) {

		System.out.println(generatePrimeSet(100));

	}

	static ArrayList<Integer> primeList = new ArrayList<Integer>();

	static {
		primeList.add(2);
		primeList.add(3);
	}

	public static Collection<Integer> generatePrimeSet(int n) {
		boolean isNotPrime;
		for (int i = 5; i < n; i += 2) {
			isNotPrime = false;
			for (int j = 0; j < primeList.size(); j++) {
				if (i % primeList.get(j) == 0) {
					isNotPrime = true;
					break;
				}
			}
			if (!isNotPrime)
				primeList.add(i);
		}

		return primeList;
	}

	public static boolean isPrime(long x) {
		// TODO Auto-generated method stub

		// long x=55;

		if (x == 1)
			return false;

		// double y=5.55;

		// System.out.println(Math.sqrt(x)+1);

		for (long i = 2; i < Math.sqrt(x) + 1; i++) {
			if (x == 2) {
				// System.out.println("prime");
				return true;

			} else if (x % i == 0) {
				// System.out.println("not prime");
				return false;
			}

		}
		// System.out.println("prime");
		return true;

	}

}
