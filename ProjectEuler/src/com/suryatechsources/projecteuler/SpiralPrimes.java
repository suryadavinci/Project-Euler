package com.suryatechsources.projecteuler;

import java.util.Arrays;

public class SpiralPrimes {


	public static void main(String[] args) 
	{
		//SpiralPrimes sp=new SpiralPrimes();

		
		//SpiralPrimes sp =new SpiralPrimes();
		//System.out.println(sp.getMatrix(3));
		
		//System.out.println(sp.intialiseMatrix(3));
		
		
		
		//sp.displayMatrix(sp.intialiseMatrix(3));
		int n=5199;
		int primes=1291;
		float percentage=0, minPercentage=20;
		System.out.println(SpiralPrimes.countDiagPrimes(SpiralPrimes.getMatrix(5201)));
	while(true)
	{
	//primes=primes+SpiralPrimes.countDiagPrimes(SpiralPrimes.getMatrix(n));
		primes=SpiralPrimes.countPrimes(SpiralPrimes.getMatrix(n));
	
	//System.out.println((float)primes/(n*2-1));
	
	percentage=(float)primes/(n*2-1);
	
	if(percentage<minPercentage)
	{
		minPercentage=percentage;
		System.out.println(n+" "+primes+" "+minPercentage);
	}
	
	if((float)primes/(n*2-1)<=0.10)
	{	System.out.println("gotit"+" "+n+" "+primes+" \n ");
	break;
	}
	
	n=n+2;
	
	}
	
	}
	
	public static int[][] getMatrix(int n)
	{
		int matrix[][]=new int[n][n], i=n/2,j=n/2,count=1,v=0,h=1, data=1, iter=1,round=0;
		
		int[] alternate={0,1};
		
		int ind=1;
		
		matrix=SpiralPrimes.intialiseMatrix(n);
		
		matrix[n/2][n/2]=count;
		
		for(int p=0;p<n;p++)
		{
		for(int k : alternate)
		{
			
			
			for(int m=0;m<iter;m++)
			{
				
				if(k==0)
				{
					j=j+ind;
				}
				else
				{
					i=i+ind;
				}
				
				//System.out.println(i+" "+j);
				count++;
				matrix[i][j]=count;
				
				if(count==n*n)
				{
					return matrix;
				}
			}
			
			
		}
		iter++;
		ind=ind* (-1);
	}

		
		
		
		
		return matrix;
		
		
	}
	
	
	
	static int[][] intialiseMatrix(int n)
	{
		int i=0,j=0;
		int[][] matrix= new int[n][n];
		
		
		
		for(i=0;i<n;i++)
			{
			for(j=0;j<n;j++)
			{
				matrix[i][j]=0;
			}
			}
		
		return matrix;
			
		
	}
	
	static void displayMatrix(int[][] matrix)
	{
		int size=matrix.length,i=0,j=0;
		
		//System.out.println(size);
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
			{
				System.out.print(matrix[i][j]+" \t");
			}
			System.out.println();
		}
		
		
		
	}
	
	
	static int countPrimes(int[][] matrix)
	{
		int count=0,n=matrix.length;
		for(int i=0;i<n;i++)
		{
			if(Prime.isPrime((long) matrix[i][i]) )
				{count++;
				//System.out.println(matrix[i][i]);
				}
			
			if(Prime.isPrime((long) matrix[i][n-i-1]) )
				{count++;
				//System.out.println(matrix[i][n-i-1]);
				}
			
			
		}
		
		//System.out.println(count);
		return count;
		
	}
	
	
	static int countDiagPrimes(int[][] matrix)
	{
		int count=0,n=matrix.length;
		/*for(int i=0;i<n;i++)
		{
			if(Prime.isPrime((long) matrix[i][i]) )
				{count++;
				//System.out.println(matrix[i][i]);
				}
			
			if(Prime.isPrime((long) matrix[i][n-i-1]) )
				{count++;
				//System.out.println(matrix[i][n-i-1]);
				}
			
			
		}*/
		
		if(Prime.isPrime ((long)   matrix[0][0] ))
			count++;
		
		if(Prime.isPrime ((long)   matrix[0][n-1] ))
			count++;
		
		if(Prime.isPrime ((long)   matrix[n-1][0] ))
			count++;
		if(Prime.isPrime ((long)   matrix[n-1][n-1] ))
			count++;
		
		
		//System.out.println(count);
		return count;
		
	}
	
	
	

}

