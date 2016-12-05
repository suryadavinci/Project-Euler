package com.suryatechsources.projecteuler;


public class Prime {

	public static boolean isPrime(long x) {
		// TODO Auto-generated method stub

		
		//long x=55;
		
		
		//double y=5.55;
		
		
		
		//System.out.println(Math.sqrt(x)+1); 
		
		for(long i=2;i<Math.sqrt(x)+1;i++)
		{
			if(x==2)
			{
			//	System.out.println("prime");
				return true;
				
			}
			else if(x%i==0)
			{
			//	System.out.println("not prime");
				return false;
			}
			
			
		}
		//System.out.println("prime");
		return true;
		
			
		
		
	}
	
	
	public static void main(String arg[])
	{
		
		for (int x=2;x<100;x++)		
		System.out.println(x+" "+isPrime(x));
	}
	
	

}
