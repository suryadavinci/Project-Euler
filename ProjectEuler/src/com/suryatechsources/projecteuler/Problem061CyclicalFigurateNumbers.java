package com.suryatechsources.projecteuler;

import java.util.LinkedList;

public class Problem061CyclicalFigurateNumbers {
	LinkedList<String> triangleList= new LinkedList<String>();
	LinkedList<String> squareList= new LinkedList<String>();
	LinkedList<String> pentagonList= new LinkedList<String>();
	LinkedList<String> hexagonList= new LinkedList<String>();
	LinkedList<String> heptagonList= new LinkedList<String>();
	LinkedList<String> octagonList= new LinkedList<String>();
	int value=0;
	
	LinkedList sourceList= new LinkedList();
	
	
	int flag[]={1,0,0,0,0,0};
	
	int next=1;
	
	
	String triangleString="";
	String squareString="";
	String pentagonString="";
	String hexagonString="";
	String heptagonString="";
	String octagonString="";
	
	LinkedList<String> finalList= new LinkedList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
	 new Problem061CyclicalFigurateNumbers();
	 
	 
	 
		
	}
	
	void intialise()
	{
		triangleString="";
		squareString="";
		pentagonString="";
		hexagonString="";
		heptagonString="";
		octagonString="";
		
		this.next=1;
		
		for(int i=0;i<flag.length;i++)flag[i]=0;
		
		sourceList.add(triangleList);
		sourceList.add(squareList);
		sourceList.add(pentagonList);
		sourceList.add(hexagonList);
		sourceList.add(heptagonList);
		sourceList.add(octagonList);
		finalList.clear();
		
	}
	

	Problem061CyclicalFigurateNumbers()
	{
		System.out.println("running constructor");
		fillList();
		triangleIter("");
		
	
	}
	
	
	void getNext(String current)
	{
		//next=next+1;
	//	System.out.println(next+" "+flag[0]+" "+flag[1]+" "+flag[2]+" "+flag[3]+" "+flag[4]+" "+flag[5]);
		//boolean set= false;
		//if(next>5)
		
		for(int i=0;i<flag.length;i++)
			{
			if(flag[i]==0)			
				{
				System.out.println(i+" "+flag[i]);
				
				
				
				for(int j=0;j< ((LinkedList) sourceList.get(i)).size();j++  )
				{
					//System.out.println();
					if( ((String) ((LinkedList) (sourceList.get(i))).get(j)).substring(0,2).equals(current.substring(2))  )
					{
						next=i;
						return;
						
					}
				}
					
					
			//	set= true;
				}
			}
		next=7;
		System.out.println(next+" "+flag[0]+" "+flag[1]+" "+flag[2]+" "+flag[3]+" "+flag[4]+" "+flag[5]+" "+finalList);
		
		
	}
	
	
	
	void findNext(String current,int check)
	{
		if(check==0)
			triangleIter(current);
		if(check==1)
			squareIter(current);
		if(check==2)
			pentagonIter(current);
		if(check==3)
			hexagonIter(current);
		if(check==4)
			heptagonIter(current);
		if(check==5)
			octagonIter(current);
		else
			{System.out.println("Finish "+finalList);
			
			}
		
	}
	
	void triangleIter(String current)
	{
		
		
		this.next=0;
		
		//for(int i=0; i<triangleList.size();i++)
		{

			intialise();
			flag[0]=1;
			//finalList.add(triangleList.get(i));
			finalList.add("8515");
			getNext("8515");
			
			findNext("8515",next);
			//findNext(triangleList.get(i),next);
			
		}
		
	}
	
	
	void squareIter(String current)
	{
		int currentFlag[]=flag;
		LinkedList tempList=finalList;
		for(int i=0; i<squareList.size();i++)
		{
			flag=currentFlag;
			finalList=tempList;
			if(current.substring(2).equals(squareList.get(i).substring(0, 2)))
			{
				System.out.println(current+" "+squareList.get(i));
				finalList.add(squareList.get(i));
				flag[1]=1;
				getNext(squareList.get(i));
				findNext(squareList.get(i),next);
			}
			
		}
		//getNext();
		//System.out.println("Next in square"+next);
		//findNext(current,next);
		
	}
	
	void pentagonIter(String current)
	{

		int currentFlag[]=flag;
		LinkedList tempList=finalList;
		for(int i=0; i<pentagonList.size();i++)
		{
			flag=currentFlag;
			finalList=tempList;
			if(current.substring(2).equals(pentagonList.get(i).substring(0, 2)))
			{
				finalList.add(pentagonList.get(i));
				flag[2]=1;
				getNext(squareList.get(i));
				findNext(pentagonList.get(i),next);
			}
			
		}
		//getNext();
		//System.out.println("Next in pent"+next);
		//findNext(current,next);
		
	}
	
	void hexagonIter(String current)
	{
		
		int currentFlag[]=flag;
		LinkedList tempList=finalList;
		for(int i=0; i<hexagonList.size();i++)
		{
			flag=currentFlag;
			finalList=tempList;
			if(current.substring(2).equals(hexagonList.get(i).substring(0, 2)))
			{
				finalList.add(hexagonList.get(i));
				flag[3]=1;
				getNext(squareList.get(i));
				findNext(hexagonList.get(i),next);
			}
			
		}
		//getNext();
		//System.out.println("Next in hexagon"+next);
		//findNext(current,next);
		
	}
	
	
	void heptagonIter(String current)
	{
		
		int currentFlag[]=flag;
		LinkedList tempList=finalList;
		for(int i=0; i<heptagonList.size();i++)
		{
			flag=currentFlag;
			finalList=tempList;
			if(current.substring(2).equals(heptagonList.get(i).substring(0, 2)))
			{
				finalList.add(heptagonList.get(i));
				flag[4]=1;
				getNext(squareList.get(i));
				findNext(heptagonList.get(i),next);
			}
			
		}
		//getNext();
		//System.out.println("Next in hept"+next);
		//findNext(current,next);
		
	}
	void octagonIter(String current)
	{
		
		int currentFlag[]=flag;
		LinkedList tempList=finalList;
		for(int i=0; i<octagonList.size();i++)
		{
			flag=currentFlag;
			finalList=tempList;
			if(current.substring(2).equals(octagonList.get(i).substring(0, 2)))
			{
				finalList.add(octagonList.get(i));
				flag[5]=1;
				getNext(squareList.get(i));
				findNext(octagonList.get(i),next);
			}
			
		}
		//getNext();
		//System.out.println("Next in oct"+next);
		//findNext(current,next);
		
	}
	
	
	
	
	
	

	
	void fillList()
	{
		for(int i=1;;i++)
		{
			
			value=triangle(i);
			if(value>10000)
				break;
			else if(value<10000 & value>1000)
			triangleList.add(Integer.toString(value));
			
			value=square(i);
			if(value<10000 & value>1000)
				squareList.add(Integer.toString(value));
			
			value=pentagonal(i);
			if(value<10000 & value>1000)
				pentagonList.add(Integer.toString(value));
			
			
			value=hexagonal(i);
			if(value<10000 & value>1000)
				hexagonList.add(Integer.toString(value));
			
			value=heptagonal(i);
			if(value<10000 & value>1000)
				heptagonList.add(Integer.toString(value));
			
			value=octagonal(i);
			if(value<10000 & value>1000)
				octagonList.add(Integer.toString(value));
			
			
		}

		System.out.println(triangleList);
		System.out.println(squareList);
		System.out.println(pentagonList);
		System.out.println(hexagonList);
		System.out.println(heptagonList);
		System.out.println(octagonList);
		
	}
	

	
	
	
	
	static int triangle(int n)	 	
	{
		return n*(n+1)/2;
	}
	
	static int square(int n)	 	
	{
		return n*n;
	}
	
	static int pentagonal(int n)	 	
	{
		return n*(3*n-1)/2;
	}
	static int hexagonal(int n)	 	
	{
		return n*(2*n-1);
	}
	static int heptagonal(int n)	 	
	{
		return n*(5*n-3)/2;
	}
	
	static int octagonal(int n)	 	
	{
		return n*(3*n-2);
	}
	
}
