package com.prowings.array;

import java.util.Arrays;

public class FunctionsOnArray2 {

	public static int[] additionOfArray(int[] a, int[] b) {

		int c[] = new int[a.length];
		if(a.length != b.length)
			System.out.println("Both array have different no. of elements.");

		else

			for(int i =0 ; i< a.length ; i++)
				c [i] = a[i] + b[i];
		return c;

	}


	public static int[] concatArray(int a[], int b[])
	{
		int d[] =  new int[a.length + b.length];

		int pos = 0;

		for(int elements : a) {
			d[pos] = elements;
			pos++;
		}

		for(int elements : b) {
			d[pos] = elements;
			pos++;
		}
		return d;

	}

	public static void compareTwoArray(int a[], int b[]) {


		if(a == null || b == null)
			System.out.println("One of the array is null.");

		if(a.length != b.length) {
			System.out.println("Length of both arrays are different.");
		}

		else {
			int count = 0;


			for(int i =0; i<a.length ; i++) {
				if(a[i] != b[i])

					count++;
			}

			if(count == 0) {
				System.out.println("Elements of both arrays are same.");

			}

			else {

				System.out.println("Elements of both arrays are different.");

			}
		}



	}

	public static void main(String[] args) {

		int a[] = {1,2,3,4};
		int b[] = {5,6,7,8};

		System.out.println("Array a ="+Arrays.toString(a));
		System.out.println("Array b ="+Arrays.toString(b));

		int c[] = additionOfArray(a,b);
		System.out.println("Addition of a+b  ="+Arrays.toString(c));


		int d[] = concatArray(a,b);
		System.out.println("Concatination of a+b  ="+Arrays.toString(d));

		System.out.println("Comparision of 2 array:");
		compareTwoArray(a,b);

	}


}

