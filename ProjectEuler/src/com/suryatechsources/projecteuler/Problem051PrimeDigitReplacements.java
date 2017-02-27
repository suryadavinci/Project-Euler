package com.suryatechsources.projecteuler;

import java.util.Arrays;

import com.suryatechsources.Prime;

public class Problem051PrimeDigitReplacements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		doPrimeDigitReplacement();

		
	}

	
	
	public static void doPrimeDigitReplacement(){
		
		String str;
		int count=0;
		int n=56003;
		for( n=896979; ;n+=2)
		{
			count=0;
			str=Integer.toString(n);
			for(int i=0;i<str.length();i++){

				for(int j=i+1;j<str.length();j++){
					
					if(i!=j){
						
						count=getPrimeCount(str,i,j);
						
						if(count>=7)
						{
							System.out.println("count for "+str+" "+i+" "+j+" is "+count);
							//break;
							if(count==8)
								System.exit(0);
								
						}

					}
				}
				
			}
				
				
		}
	}



	private static int getPrimeCount(String str, int i, int j) {
		
		char[] newStr= str.toCharArray();
		
		Integer newInt;
		int count=0;
		
		//if(i!=0  && j!=newStr.length-1)
		{
		
		for(int k=0;k<=9;k++){
				if(j==newStr.length-1 && (k%2)==0){
					k++;
				}
			newStr[i]= (char) (k+48);
			newStr[j]= (char) (k+48);
			newInt= Integer.parseInt(String.valueOf(newStr));
			if(Prime.isPrime(newInt)){
				
				//System.out.println("replacing "+String.copyValueOf(newStr)+" "+i+" "+j+" by "+k+" prime Int "+newInt);

				count++;
			}
		}
		}
		return count;
	}
	
		
}
