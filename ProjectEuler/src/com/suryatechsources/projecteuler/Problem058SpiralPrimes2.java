package com.suryatechsources.projecteuler;

import com.suryatechsources.Prime;

public class Problem058SpiralPrimes2 {

	public static void main(String[] args) {

		long primes = 0, n = 3;
		long diag1 = 0, diag2 = 0, diag3 = 0, diag4 = 0, ini = 0, count = 0;
		float percentage = 15, newPercentage = 20;

		for (n = 1; percentage > 0.1; n = n + 2) {
			ini = n * n;
			diag1 = ini + n + 1;
			diag2 = ini + 2 * (n + 1);
			diag3 = ini + 3 * (n + 1);
			diag4 = ini + 4 * (n + 1);

			// System.out.println(diag1+" "+diag2+" "+diag3+" "+diag4);
			if (Prime.isPrime(diag1))
				count++;
			if (Prime.isPrime(diag2))
				count++;
			if (Prime.isPrime(diag3))
				count++;
			if (Prime.isPrime(diag4))
				count++;
			// System.out.println(count);

			percentage = (float) count / (2 * (n + 2) - 1);
			// System.out.println("current "+(n+2)+" "+percentage);

			if (percentage < newPercentage) {
				newPercentage = percentage;
				System.out.println((n + 2) + " " + percentage);
			}

		}
		// System.out.println(count);

	}

}
