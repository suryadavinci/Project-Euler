package com.suryatechsources.projecteuler;

import java.util.HashSet;

import com.suryatechsources.Prime;

public class Problem060PrimePairSets {

	static HashSet<Integer> primes= new HashSet<Integer>();
	public static void main(String[] args) {

		primes.addAll(Prime.generatePrimeSet(10000));
		System.out.println(primes);
		
		
		
	}

	
	
	
}
