package com.jeevan.array;

public class CopyA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {2,4,5,1,1,2,3,4,7};
		System.out.println("Orginal Array :");
		for(int i=0;i<A.length;i++) {
			System.out.printf(A[i]+" ");
		}
		System.out.println("");
		System.out.println("duplicate elements are: ");
		for(int i=0;i<A.length;i++) {
			for(int j=i+1;j<A.length;j++) {
				if(A[i]==A[j]) {
					System.out.println(A[j]);
				
				}
			}
		}
	}

}
