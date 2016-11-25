package projecteuler;

public class PrimePermutationsProblem49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PermutedMultiplesProblem52 pm =new PermutedMultiplesProblem52();
		
		//System.out.println(pm.isAPermutation(1234, 1324));
		
		int i=1000,j=1000;
		
		//i=1487;
		for(i=1000;i<=10000;i++)
		{
			//System.out.println(Prime.isPrime(i));
			if(Prime.isPrime(i))
			{
			//	j=3330;
			for(j=1000;j<=10000;j++)
				
			{
			//System.out.println(pm.isAPermutation(i, i+j));
			//System.out.println(pm.isAPermutation(i, i+2*j));
			//System.out.println(Prime.isPrime(i+j));
			//System.out.println(Prime.isPrime(i+2*j));
			
				
				if(pm.isAPermutation(i, i+j) & pm.isAPermutation(i, i+2*j) )
					{
					if(Prime.isPrime(i+j) & Prime.isPrime(i+2*j) )
						System.out.println(i+" "+(i+j)+ " "+(i+2*j));
					}
				
				
			}
			}
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	

}
