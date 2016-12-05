package com.suryatechsources.projecteuler;

import java.math.BigInteger;
import java.util.LinkedList;

public class DistinctPowersProblem29 {
	public static void main(String arg[])
	{
			LinkedList<String> list= new LinkedList();
			
			BigInteger output= BigInteger.ZERO;
			
			BigInteger input=BigInteger.ZERO;
			int count=0;
			for(long i=2;i<=100;i++)
			{
				input=BigInteger.valueOf(i);				
				
				for(int j=2;j<=100;j++)
				{
					
					
					output=input.pow(j);
					
					
					if(!list.contains(output.toString()))
					{
						list.add(output.toString());
						count++;
						System.out.println(count+" "+i+" "+j+" "+output );
						
					}
							
					
				}
				
			}
			
	}

}
