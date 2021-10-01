package com.jeevan.array;

public class EvenandOddA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[] {7,1,3,9,2,8};
		System.out.println("Given Array: ");
		for(int i = 0;i<A.length;i++) {
			System.out.printf(A[i]+" ");
		}
		System.out.println();
		System.out.println("Elements at Even position are :");
		for(int i = 0;i<A.length;i++) {
			if(i%2==0) {
			System.out.printf(A[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Elements at Odd position are :");
		for(int i = 0;i<A.length;i++) {
			if(i%2==1) {
			System.out.printf(A[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Even Numbers :");
		for(int i = 0;i<A.length;i++) {
			if(A[i]%2==0) {
			System.out.printf(A[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Odd Numbers :");
		for(int i = 0;i<A.length;i++) {
			if(A[i]%2==1) {
			System.out.printf(A[i]+" ");
			}
			
	}

}
}

