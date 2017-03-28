package com.suryatechsources.projecteuler;

import java.math.BigInteger;

public class Problem078CoinPartitions {

	public static void main(String[] args) {

		int pentagonal;
		int k;
		for(int m=0;m<10;m++){
			
			if(m%2==0)
				k=m/2+1;
			else
				k=-m/2-1;
			
			System.out.println(k+"\t"+(pentagonal=(k*(3*k-1))/2));
			
		}
		
		
		
	}
}
