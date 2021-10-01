package com.jeevan.array;

public class DuplicateElementsRemoveA {

	
	public static int removeDuplicates(int[] A) {
		if(A.length == 0 || A.length == 1) {
			return A.length;
		}
		int[] temp = new int[A.length];
		int j=0;
		for(int i = 0;i<A.length-1;i++) {
			if(A[i]!=A[i+1]) {
				temp[j] = A[i];
				//System.out.println(temp[j]);
				j++;
			}
			
		}
		//last element in Array
		temp[j]=A[A.length-1];
		//System.out.println(j);
		for(int i =0;i<temp.length;i++) {
			A[i]=temp[i];
		}
		return j;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] {1,2,2,5,3,4,4,9,7,9};
		int length =removeDuplicates(a);
		System.out.println("Array after Deleting Duplicate Elements: ");
		for(int i = 0;i<length;i++) {
			System.out.printf(a[i]+" ");
		}
		
		}

}
