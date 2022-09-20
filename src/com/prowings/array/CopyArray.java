package com.prowings.array;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {

		int a []= new int [5];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 values:");

		for(int i=0; i<=4 ; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Original array:"+Arrays.toString(a));


		int b[] = shallowCopy(a);
		System.out.println(Arrays.toString(b));

		int arr [] = deepCopy(a);
		System.out.println(Arrays.toString(arr));

	}

	private static int[] shallowCopy(int a []) {

		System.out.println("shallow copy using assignment operator:");
		int b [] = a;
		return b;
	}

	public static int[] deepCopy(int a[])
	{ 
		int arr[] = new int [a.length];
		System.out.println("Deep copy of Array:");
		for(int i =0; i< a.length ; i++ )
			arr[i] = a[i];
		return arr;
	}
}



