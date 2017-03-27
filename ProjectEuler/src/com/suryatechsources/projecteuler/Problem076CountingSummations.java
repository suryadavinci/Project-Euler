package com.suryatechsources.projecteuler;

import java.util.HashMap;

public class Problem076CountingSummations {
	static int count;
	static HashMap<String,Integer> mem= new HashMap<String,Integer>();
	public static void main(String[] args) {
		System.out.println(countSum(5,0));
		
	}
	
	public static int countSum(int eSum, int current){
		int val;
		if(mem.containsKey(eSum+"-"+current))
			return mem.get(eSum+"-"+current);
		
		
		for(int i=1;i<=eSum/current;i++){
			val=eSum-i*current;
			if(val==0)
				{
				mem.put(eSum+"-"+current,1);
				}
			else if(val>0)
				count=1+countSum(val,count);
		}
		return count;
	}
}
