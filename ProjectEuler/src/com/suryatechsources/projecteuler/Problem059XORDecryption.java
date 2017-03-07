package com.suryatechsources.projecteuler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem059XORDecryption {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("p059_cipher.txt");

		Scanner s = new Scanner(file);

		String x = s.next();

		List<String> l = Arrays.asList(x.split(","));

		int[] array = new int[1201];

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(l.get(i));
		}
		System.out.println(array[1200]);

		for (int i = 97; i <= 122; i++) {

			int[] a = new int[1201];

			for (int j = 0; j < 1201; j++) {
				a[j] = array[j] ^ i;
				System.out.print((char) a[j]);
			}
			System.out.println();

		}

	}

}
