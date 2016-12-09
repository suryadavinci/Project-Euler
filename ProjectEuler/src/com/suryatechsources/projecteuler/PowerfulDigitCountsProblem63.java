package com.suryatechsources.projecteuler;

public class PowerfulDigitCountsProblem63 {

	public static void main(String[] args) 
	{
		
		
		
		long x=0,count=0;
		
		
		
		double n=3;
		double a=5;
		
		System.out.println(n*Math.log10(a));
		
		double a1=1;
		for(n=1;;n++)
		{	
		//	a=a1;
			for(a=1;a<=9;a++)
			{
				if(n*Math.log10(a) >= (n-1) & n*Math.log10(a)<n)
					{count++;
					//System.out.println("Success : "+a+" "+n);
					System.out.println(count+" "+a+" "+n+" "+n*Math.log10(a)+" "+n*Math.log10(a));
					}
				if(n*Math.log10(a) > n){	
					//count++;
				System.out.println(count+" fail "+a+" "+n+" "+n*Math.log10(a)+" "+n*Math.log10(a));
				break;
				}
				
				
				
				
			}
			
		
		}
		
		
		

	}
	
	
	public static int digitCount(long x)
	{
		return Long.toString(x).length();
	}

}
