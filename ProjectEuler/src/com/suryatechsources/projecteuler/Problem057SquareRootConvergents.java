package com.suryatechsources.projecteuler;

import java.math.BigInteger;

public class Problem057SquareRootConvergents {

	public static void main(String[] args) {

		calculateConvergent(1000);
	}

	public static void calculateConvergent(int n) {

		int count = 0;
		BigInteger[] nr = new BigInteger[n];
		BigInteger[] dr = new BigInteger[n];

		nr[0] = new BigInteger("3");
		dr[0] = new BigInteger("2");

		int i = 1;
		for (i = 1; i < n; i++) {

			nr[i] = nr[i - 1].add(BigInteger.valueOf(2).multiply(dr[i - 1]));

			dr[i] = dr[i - 1].add(nr[i - 1]);

			if ((nr[i].toString()).length() > (dr[i].toString()).length()) {
				count++;

				System.out.println(i + 1 + " " + nr[i].toString() + " "
						+ dr[i].toString());

			}

		}
		System.out.println(count);

	}

}
