package com.suryatechsources.projecteuler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumPathSumIIProblem67 {

	static int[][] a;
	static int[][] mem;
	
	
	
	public static void hackerRankProblem(){
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		
	}
	
	
	
	public static void projectEulerProblem(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("p067_triangle.txt");

		Scanner s=new Scanner(file);
		
		a= new int[100][];
		for(int i=0;i<100;i++){
			
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++){
				a[i][j]=s.nextInt();
			}
			
			System.out.println(Arrays.toString(a[i]));
		}
		
		
		mem=new int[100][100];
	

		//mem=Arrays.copyOf(a, a.length);
		
		for(int i=0;i<100;i++){
			Arrays.fill(mem[i], -1);

		}
		
		s.close();
		
		
		System.out.println(findMaximumPath(0,0));

	}
	
	public static int findMaximumPath(int row, int col){
		
		if(row>=a.length || col>=a.length){
			//System.out.println("hello");
			return 0;
		}
		else{
			if(mem[row][col]!=-1)
			{
				return mem[row][col];
			}
			else
			{
				
				mem[row][col]=a[row][col]+Math.max(findMaximumPath(row+1,col), findMaximumPath(row+1,col+1));
				//System.out.println(row+" "+col+" "+mem[row][col]);
				return mem[row][col];
			}
		}
		
		
	}

}
