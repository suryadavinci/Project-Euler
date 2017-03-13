package com.suryatechsources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Prime {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int n = 100000;
		generatePrimeSet(n);
		long first = System.currentTimeMillis();
		System.out.println("Hash " + (first - start));
		for (int i = 0; i < n; i++) {
			isPrime(i);
		}
		long second = System.currentTimeMillis();
		System.out.println("Formulae " + (second - first));
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
		if (x <= 1)
			return false;
		if (x == 2 || x == 3)
			return true;
		if (x % 2 == 0 || x % 3 == 0)
			return false;
		for (long i = 5; i * i < x + 1; i += 6) {
			if (x % i == 0 || x % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}
}