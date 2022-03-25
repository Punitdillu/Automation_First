package com.Array;

public class Arrayrev {
	public static void main(String[] args) {
		int x[]= {22,32,43,34};
		int rev[]=new int[x.length];
		int count=0;
		for(int i=x.length-1;i>=0;i--) {
			rev[count++]= x[i];
		}
		for(int j=0;j<=x.length-1;j++)
		{
			System.out.print(rev[j]+" ; ");
		}
		System.out.println();
		
	}

}
