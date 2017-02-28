package com.suryatechsources.projecteuler.archive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Problem092SquareDigitChains {

	
	static HashMap<Long, Long> lookUp =new HashMap<Long, Long>();
	
	static HashSet<Long> is89LookUp= new HashSet<Long>();
	static HashSet<Long> is1LookUp= new HashSet<Long>();
	
	static ArrayList<Long> valList;
	public static void main(String[] args) {
		
		long start= System.currentTimeMillis();


		Scanner s= new Scanner(System.in);
		int k=s.nextInt();
		
		long count=0;
		long val=0;
		long ini;
		long firstVal=0;
		for(long i=2;i<Math.pow(10,k);i++){
		//for(long i=2;i<100;i++)
		//long i=4;
		
			ini=i;
			val=i;
			firstVal=sumOfSquares(val);
			valList=new ArrayList<Long>();
			while(true){
				
				//valList.add(val);

				
				
				
				if(is1LookUp.contains(val)){
					//is1LookUp.add(ini);
					//System.out.println(val+" is present in 1 lookup");
					is1LookUp.addAll(valList);
					//System.out.println("Adding to 1 11111111111 "+valList);
					break;
				}
					
				if(is89LookUp.contains(val))
				{
					//is89LookUp.addAll(valList);
					//System.out.println(val+" is present in 89 lookup");
					//System.out.println("Adding to 89 sdjflskd "+valList);
					is89LookUp.addAll(valList);
					count++;
					break;
				}
				val=sumOfSquares(val);

				
				if(val==89){
					
					is89LookUp.add(firstVal);
					is89LookUp.addAll(valList);

					//System.out.println("Adding to 89 "+firstVal);
					//System.out.println("Adding to 89 list "+valList);

					if(ini<1000)
						{
							//System.out.println("Adding to 89  ini "+firstVal);
	
							is89LookUp.add(ini);
						}
					//is89LookUp.add(ini);
					//System.out.println("89 val list "+ valList);
					//is89LookUp.addAll(valList);
					count++;
					//System.out.println(i+" "+count);
					break;
				}
				else if(val==1){
					//is1LookUp.add(ini);
					//System.out.println("1 val list "+ valList);
					is1LookUp.add(firstVal);
					is1LookUp.addAll(valList);
					//System.out.println("Adding to 1 "+firstVal);
					//System.out.println("Adding to 1 list "+valList);

					if(ini<1000)
						{
							//System.out.println("Adding to 1  ini "+firstVal);
							is1LookUp.add(ini);
						}
					//is1LookUp.addAll(valList);

					break;
				}
				valList.add(val);
				//System.out.println("curent val List "+valList);
			}
			
			
		}
		
		System.out.println(count);
		//System.out.println(is1LookUp);
		//System.out.println(is89LookUp);
		System.out.println(System.currentTimeMillis()-start);
		
		
	}
	
	
	public static long sumOfSquares(long n){
		
		if(lookUp.containsKey(n)){
			return lookUp.get(n);
		}
		
		char[] c= Long.toString(n).toCharArray();
		
		
		long sum=0;
		int val=0;
		for(int i=0;i<c.length;i++){	
			val=c[i]-48;
			sum=  (long) (sum+Math.pow(val,2));
		}
			
		lookUp.put(n,sum);
		return sum;
	}
	

}
