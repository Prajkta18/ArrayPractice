package com.prowings.array;


import java.util.Arrays;
import java.util.Scanner;

public class FunctionsOnArray {

	public static double averageOfArray(int a[]) {

		int sum =0;
		for(int i =0; i<a.length; i++)
		{
			sum+= a[i];
		}

		double avg = sum/a.length;
		return avg;
	}

	public static int[] swapArray(int a[]) {

		try (Scanner sc1 = new Scanner(System.in)) {
			System.out.println("Enter 1st index which you want to swap: ");
			int index1 = sc1.nextInt();

			System.out.println("Enter 2st index which you want to swap: ");
			int index2 = sc1.nextInt();

			int temp = a[index1];
			a[index1] = a[index2];
			a[index2] = temp;
		}
		return a;
	}



	public static void main(String args[]) {

		int a [] = new int[5];         // declaring array

		Scanner sc = new Scanner(System.in);
		// storing value into array
		System.out.println("Enter 5 Values:");
		for(int i = 0 ;i< a.length ; i++)
		{

			a[i] = sc.nextInt();
		}

		System.out.println("Given Array a:");

		for(int i=0 ; i< a.length ; i++)
		{
			System.out.print("\t"+a[i]);
		}
		System.out.println();


		double avg = averageOfArray(a);
		System.out.println("Average of Array ="+avg);

		int b[] = swapArray(a);
		System.out.println("swapped array:"+Arrays.toString(a));
	}
}


