package com.suryatechsources.projecteuler;

public class Problem052PermutedMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem052PermutedMultiples pm = new Problem052PermutedMultiples();

		int flag = 0;

		String out, curr;

		for (int i = 125874;; i++) {

			curr = pm.arrayToString(pm.sort(pm.saveToArray(i)));

			for (int j = 1; j <= 6; j++) {
				out = pm.arrayToString(pm.sort(pm.saveToArray(i * j)));
				// System.out.println(out);
				if (!out.equals(curr))
					break;
				if (out.equals(curr) && j == 6) {
					System.out.println("Success " + i + " " + curr);
					flag = 1;
					break;
				}

			}

			if (flag == 1)
				break;
		}

		

	}

	int[] saveToArray(int num) {

		String numToStr = Integer.toString(num);
		int length = numToStr.length(), i = 0;

		int numArray[] = new int[length];
		while (i < length) {
			numArray[i] = Integer.parseInt(numToStr.substring(i, i + 1));
			i++;

		}

		return numArray;

	}

	int[] sort(int[] numArray) {
		int temp = 0;
		// System.out.println(numArray.length+" length");
		for (int i = 0; i < numArray.length; i++) {
			for (int j = i + 1; j < numArray.length; j++) {
				if (numArray[i] > numArray[j]) {
					// System.out.println(numArray[i]+" "+numArray[j]);
					temp = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = temp;

				}

			}

		}

		return numArray;
	}

	String arrayToString(int[] numArray) {

		int length = numArray.length;
		String out = "";
		int i = 0;
		while (i < length) {

			out = out + numArray[i];

			i++;
		}

		return out;
	}
	
	
	boolean isAPermutation(int num1, int num2)
	{
		
		if(arrayToString(sort(saveToArray(num1))).equals(arrayToString((sort(saveToArray(num2))))))
		return true;
		else		
		return false;
	}

}
