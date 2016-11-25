package projecteuler;

public class PrimeDigitReplacementsProblem51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(replaceInt(12345, 1, 2, 5));
		
		
	}
	
	
	
	public static int replaceInt(int x, int index1, int index2, int replacementDigit)
	{
		char[] replacedString= Integer.toString(x).toCharArray();
		
		replacedString[index1]=  (char) (replacementDigit+48);
		replacedString[index2]= (char) (replacementDigit+48);
		return Integer.parseInt(String.valueOf(replacedString));
		
	}
	
	
	public static int primeCount(int x, int index1, int index2)
	{
		int count=0;
		for(int i=0;i<=9;i++)
		{
			
			if(Prime.isPrime((long) replaceInt(x, index1, index2, i))) 
					count++;
			
		}
		
		return count;
		
		
	}
	
	
	

}
