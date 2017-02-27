package com.suryatechsources.projecteuler;

import java.math.BigInteger;

public class Problem057SquareRootConvergents {
	
	
	public static void main(String[] args) {
		
		
		calculateConvergent(1000);
	}

	public static void oldMain(String[] args) {
		// TODO Auto-generated method stub

		
		
		int n=14;
		
		float[] a= new float[n];
		
		a[0]=3/2;
		
		//f(x)=1+ ( 1/(1+f(x-1)))
		
		long[] nr= new long[n];
		long[] dr= new long[n];
		
		
		nr[0]=3;
		dr[0]=2;
		
		System.out.println((float)577/408);
		System.out.println((float)1393/985);
		int count=0;
		
		int i=1;
		for(i=1;i<n;i++)
		{
		/*	a[i]=1+(1/(1+a[i-1]));
			System.out.println(a[i]);*/
			
			nr[i]=nr[i-1] + 2*dr[i-1];
			
			dr[i]=dr[i-1]+nr[i-1];
			
			if(Long.toString(nr[i]).length()>Long.toString(dr[i]).length())
				{
				System.out.println(i+1+"   "+nr[i]+"/"+dr[i]);
				count++;
				}
			
			
			
		}
		
		System.out.println(count);
	}
	
	
	
	
	
	public static void calculateConvergent(int n){
		
		int count=0;
		BigInteger[] nr= new BigInteger[n];
		BigInteger[] dr= new BigInteger[n];
		
		
		nr[0]=new BigInteger("3");
		dr[0]=new BigInteger("2");
		
		int i=1;
		for(i=1;i<n;i++)
		{
			
			nr[i]=nr[i-1].add(BigInteger.valueOf(2).multiply( dr[i-1]));
			
			dr[i]=dr[i-1].add(  nr[i-1]);
			
			if((nr[i].toString()).length()>(dr[i].toString()).length())
				{
				count++;
				System.out.println(i+1);
				
				}
			
			
			
		}
		System.out.println(count);
		
	}
	

}
