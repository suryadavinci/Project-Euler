package com.suryatechsources.projecteuler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem092SquareDigitChains {

	
	static HashMap<Integer, Integer> lookUp =new HashMap<Integer, Integer>();
	
	static HashSet<Integer> is89LookUp= new HashSet<Integer>();
	static HashSet<Integer> is1LookUp= new HashSet<Integer>();
	
	static HashSet<Integer> valList;
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		long start= System.currentTimeMillis();
		int k=s.nextInt();
		
		int count=0;
		int val=0;
		int ini;
		int firstVal=0;
		for(int i=2;i<Math.pow(10,k);i++){
		//for(int i=2;i<100;i++)
		//int i=4;
		
			ini=i;
			val=i;
			valList=new HashSet<Integer>();
			if(ini<700)
			valList.add(ini);
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
				//System.out.println(count);
				val=sumOfSquares(val);

				
				if(val==89){
					
					is89LookUp.addAll(valList);

					//System.out.println("Adding to 89 "+firstVal);
					//System.out.println("Adding to 89 list "+valList);

					/*if(ini<1000)
						{
							//System.out.println("Adding to 89  ini "+firstVal);
	
							is89LookUp.add(ini);
						}*/
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
					//is1LookUp.add(firstVal);
					is1LookUp.addAll(valList);
					//System.out.println("Adding to 1 "+firstVal);
					//System.out.println("Adding to 1 list "+valList);

					/*if(ini<1000)
						{
							//System.out.println("Adding to 1  ini "+firstVal);
							is1LookUp.add(ini);
						}*/
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
	
	
	public static int sumOfSquares(int n){
		
		if(lookUp.containsKey(n)){
			return lookUp.get(n);
		}
		
		char[] c= Integer.toString(n).toCharArray();
		
		
		int sum=0;
		int val=0;
		for(int i=0;i<c.length;i++){	
			val=c[i]-48;
			sum=  (int) (sum+Math.pow(val,2));
		}
			
		lookUp.put(n,sum);
		return sum;
	}
	

}
