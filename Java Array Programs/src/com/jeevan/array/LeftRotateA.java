package com.jeevan.array;

public class LeftRotateA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[] {2,4,5,1,7};
		System.out.println("Original Array :");
		for(int i=0;i<A.length;i++) {
			System.out.printf(A[i]+" ");
		}
		System.out.println("");
		int n =3;
		//Left Rotate
		int first;
		for(int j =1;j<=n;j++) {
			
			first = A[0];
			int i;
			for(i=0;i<A.length-1;i++) {
				A[i] = A[i+1];
			}
			//add first element at end
			A[i] = first;
		}
		System.out.println("Left rotate array with "+n+" positions");
		for(int i=0;i<A.length;i++) {
			System.out.printf(A[i]+" ");
		}
		//Right Rotate
				int End;
				for(int j =1;j<=n;j++) {
					
					End = A[A.length-1];
					int i;
					for(i=A.length-1;i>0;i--) {
						A[i] = A[i-1];
					}
					//add first element at end
					A[i] = End;
				}
				System.out.println("");
				System.out.println("Right rotate array with "+n+" positions");
				for(int i=0;i<A.length;i++) {
					System.out.printf(A[i]+" ");
				}
	}
}

