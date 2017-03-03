package com.suryatechsources.projecteuler;

import java.util.ArrayList;


public class Problem069TotientMaximum {

	

	static ArrayList<Integer> primeList= new ArrayList<Integer>();
	
	
	
	static{
		primeList.add(2);
		primeList.add(3);
	}
	public static void main(String[] args) {
		
		int prod=1;
		for(int i=2;i<200;i++)
			if(isPrime(i))
				if(prod*i<1000000)
					prod=prod*i;
				
		System.out.println(prod);
		
		
	}
	
	
	public static boolean isPrime(int n){
		
		
		if(n==2)
			return true;
		
		if(primeList.contains(n))
			return true;
		
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0)
				return false;
		}
		
		primeList.add(n);
		return true;
		
	}
	
	

}
