package com.Array;

public class Arraycode {
	public static void main(String[] args) {
		int x[]=new int[4];
		x[0]=20;
		x[1]=23;
		
		x[3]=21;
		for(int i : x) {
			System.out.println(i);
		}
		for(int i=1;i<x.length;i++) {
			System.out.println(x[i]);
		}
		



	}

}
