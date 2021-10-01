package com.jeevan.array;

public class ReverseA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[] {1,2,3,4,5};
		int length = A.length;
		int R[]= new int[length];
		System.out.println("Orginal Array: ");
		for(int i = 0;i<A.length;i++) {
			System.out.printf(A[i]+" ");
			R[length-1-i]= A[i];
		}
		System.out.println();
		System.out.println("Reverse Array: ");
		for(int j=0;j<R.length;j++) {
			System.out.printf(R[j]+" ");
		}
	}

}
