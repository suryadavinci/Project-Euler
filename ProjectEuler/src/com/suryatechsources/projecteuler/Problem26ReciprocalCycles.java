package com.suryatechsources.projecteuler;

public class Problem26ReciprocalCycles {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int nr, dr, quo, rem, out,length=0, maxLength=0,count=0;
		int[] values={2,4,2,2};
		String output="";
		boolean repeat=false,firstTime = true;

		int j=0,i=0;
		//i=11;
		for(i=3;i<1000;i=i+values[j%4])
		{
			j++;
			nr=1;
			dr=i;
			
			
			System.out.println(i);
			
			
			//System.out.println(i+" "+j+" "+values[j%4]);
			firstTime=true;
			repeat=false;
			output="";
			count=0;
				while(!repeat)
				{
					
					quo=nr/dr;
					rem=nr%dr;
					
					output=output+quo;
					count++;
					//System.out.println(nr+" "+dr+" "+quo+" "+rem);
					if(!firstTime && rem==1)
					{
						//System.out.println(output);
						length=output.substring(1, count).length();
						//System.out.println(i+" "+output);
						
						if(length>maxLength)
						{
							maxLength=length;
							System.out.println("MaxCycle : value : " +i+" "+output+" MaxLength :"+length);
						}
						
						break;
							
					}
					firstTime=false;
					
					nr=rem*10;
					
				}
			
			
			
		}
		
		System.out.println("MaxCycle : value : " +i+" "+output+" MaxLength :"+length);
		
		
		
		
		
		

	}

}
