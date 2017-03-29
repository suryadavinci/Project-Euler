package com.suryatechsources.projecteuler;

import java.util.ArrayList;

import com.suryatechsources.Prime;

public class Problem071OrderedFractions {

	public static void main(String[] args) {
		final int upper = 1000000;
		long r = 0, s = 1, p = 0, q = 0;
		for (q = upper; q > 2; q--) {
			p = ((3 * q - 1) / 7);

			if (p * s > q * r) {
				r = p;
				s = q;
			}
		}
		System.out.println(r + " " + s);
	}

	/*
	 * public static boolean isRPF(int n, int m){
	 * 
	 * 
	 * if(( m%2==0 && n%2==0 ) || ( m%3==0 && n%3==0 ) ||(n!=1 && m%n==0))
	 * return false;
	 * 
	 * 
	 * for(int i=0;i<n && i<primeList.size() && primeList.get(i)<n;i++) { if((
	 * n%primeList.get(i)==0 && m%primeList.get(i)==0 ) ) return false;
	 * 
	 * }
	 * 
	 * return true; }
	 */
}
