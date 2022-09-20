package com.prowings.array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {


	public static int [] removeElement(int arr[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter index of element to be removed:");
		int index = sc.nextInt();

		if(arr == null || index < 0 || index >= arr.length) {
			System.out.println("Invalid array or index.");
			return arr;
		}


		int temp[]= new int[arr.length -1];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if(i == index) {
				continue;
			}
			temp[j++] = arr[i];
		}

		return temp;
	}


	public static void main(String[] args) {

		int arr[]= {10,20,30,40,50};
		int newarr[] = removeElement(arr);
		System.out.println("Original array:"+Arrays.toString(arr));
		System.out.println("After deleting element array:"+Arrays.toString(newarr));
	}
}


