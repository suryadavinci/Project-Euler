package com.suryatechsources.projecteuler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Problem099LargestExponential {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("p099_base_exp.txt");
		if (file.exists())
			System.out.println("wow");
		Scanner s = new Scanner(file);
		StringBuilder input;
		int m;// Integer.parseInt((String) input.subSequence(0,
				// input.indexOf(",")));
		int n;// Integer.parseInt( input.substring(input.indexOf(",")+1));
		double current = 1;
		int currentM = 1;
		int currentN = 1;
		double newVal;
		while (s.hasNext()) {
			input = new StringBuilder(s.next());
			m = Integer.parseInt((String) input.subSequence(0,
					input.indexOf(",")));
			n = Integer.parseInt(input.substring(input.indexOf(",") + 1));
			newVal = n * Math.log10(m);
			if (newVal > current) {
				current = newVal;
				currentM = m;
				currentN = n;
			}
		}
		System.out.println(current + " " + currentM + " " + currentN);
		s.close();
	}

}
