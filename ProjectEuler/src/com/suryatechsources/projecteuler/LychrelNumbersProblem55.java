package com.suryatechsources.projecteuler;

public class LychrelNumbersProblem55 {

	
	
	
	public static void main(String args[])
	{
		
		
		//System.out.println(reverse("hello"));
		
		
		long iter=0, i=4994, currentSum=0, count=0;
		
		//for (i=1;i<=10000;i++)
		
		i=197;
		{
		
			try{
		currentSum=i;
		iter=0;
		//for(iter=0;iter<50;iter++)
		while(iter<50){
			//System.out.println(currentSum);
			
			currentSum=currentSum+Long.parseLong(reverse(Long.toString(currentSum)));
			if(isPalindrome(Long.toString(currentSum)))
				{
				System.out.println(count+" "+iter+" "+i+" "+currentSum);
				break;
				}
			
			
			if(!isPalindrome(Long.toString(currentSum)) && iter==49)
			{
				++count;
				//break;
				System.out.println(count+"th licheral: "+i);
			}
			
			++iter;
		}
		
			}catch(Exception e)
			{
				count++;
				System.out.println("Exception "+i);
				
			}
		}
		
		
		
		
	}
	
	
	
	
	public static String reverse(String input)
	{
		return new StringBuilder(input).reverse().toString();
	}
	
	public static boolean isPalindrome(String input)
	{
		if(input.equals(reverse(input)))
			return true;
		else return false;
		
	}
	
}
