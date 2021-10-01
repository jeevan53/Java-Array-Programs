package com.jeevan.array;

public class CopyA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {2,4,5,1,7};
		int[] B = new int[A.length];
		System.out.println("Orginal Array :");
		for(int i=0;i<A.length;i++) {
			System.out.printf(A[i]+" ");
			B[i]=A[i];
		}
		System.out.println("");
		System.out.println("Copied Array :");
		for(int j=0;j<B.length;j++) {
			System.out.printf(B[j]+" ");
		}
	}

}
