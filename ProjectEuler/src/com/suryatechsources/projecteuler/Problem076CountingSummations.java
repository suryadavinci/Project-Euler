package com.suryatechsources.projecteuler;

import java.util.HashMap;

public class Problem076CountingSummations {
	static int count;
	static HashMap<String,Long> mem= new HashMap<String,Long>();
	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		int i=56;
		long output=0;
		while(true)
			{
			System.out.println(output=countSum(i,0));
			if(output%10000000==0)
				{
					System.out.println(i);
					break;
				}
			i++;
			
			}
			
			System.out.println("Time Taken : "+(System.currentTimeMillis()-start));
	}
	public static long countSum(int sum, int minimal){
		long temp=1;
		if(sum==1)
			{
				mem.put(sum+"-"+minimal, 1l);
				return 1;
			}
		
		if(mem.containsKey(sum+"-"+minimal))return mem.get(sum+"-"+minimal);
		
		for(int i=1;i<=sum/2;i++){
			if(i>=minimal)
				temp=temp+ countSum(sum-i,i);
		}
		mem.put(sum+"-"+minimal, temp);
		return temp;
	}
}
