package com.suryatechsources.projecteuler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumPathSumIIProblem67 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("p067_triangle.txt");

		Scanner s=new Scanner(file);
		
		int[][] a= new int[100][];
		for(int i=0;i<100;i++){
			
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++){
				a[i][j]=s.nextInt();
			}
			
			//System.out.println(Arrays.toString(a[i]));
		}
		
		
		int[][] xy=new int[100][];
	

		xy=Arrays.copyOf(a, a.length);

		for(int i=0;i<100;i++){
			Arrays.fill(xy[i], -1);

		}
		System.out.println(Arrays.toString(xy[99]));
		
		s.close();

	}
	
	public void findMaximumPath(int row, int col, int[][] mem){
		
	}

}
