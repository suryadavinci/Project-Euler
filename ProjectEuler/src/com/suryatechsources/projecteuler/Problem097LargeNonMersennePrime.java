package com.suryatechsources.projecteuler;

public class Problem097LargeNonMersennePrime {
	public static void main(String[] args) {
		long val=28433;
		final int max=7830457;
		for(int i=1;i<=max;i++)
			{
				val*=2;
				val%=10000000000l;
			}
		System.out.println(val+1);
	}
}
