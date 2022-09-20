package com.prowings.array;

import java.util.Arrays;

public class SortArray {

	public static int[] descendingOrder(int arr[]) {

		for(int i =0; i< arr.length; i++)
		{
			for(int j =i+1; j<arr.length; j++)
			{
				if(arr[i] < arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}


	public static int[] ascendingOrder(int arr[]) {

		for(int i =0; i< arr.length; i++)
		{
			for(int j =i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}


	public static int secondHighestElement(int a []) {

		int largest = a[0];
		int secondlargest = a[0];

		for(int i =0; i<a.length; i++) {

			if(a[i] > largest) {
				secondlargest = largest;
				largest = a[i];
			}
			else if(a[i] > secondlargest)
			{
				secondlargest = a[i];
			}
		}

		return secondlargest;
	}


	public static void main(String[] args) {

		int arr[] = {1,7,8,9,3,5};
		System.out.println("Original Array:"+Arrays.toString(arr));

		int descendingarr[] = descendingOrder(arr);
		System.out.println("Descending order:"+Arrays.toString(descendingarr));

		int ascendingarr[] = ascendingOrder(arr);
		System.out.println("Ascending order:"+Arrays.toString(ascendingarr));

		int secondlargest = secondHighestElement(arr);
		System.out.println("Second Highest element:"+secondlargest);


	}
}
