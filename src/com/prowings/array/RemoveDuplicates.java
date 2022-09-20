package com.prowings.array;
import java.util.Arrays;
public class RemoveDuplicates {

	public static int[] removeDuplicate(int a[]) {

		int index = 1;
		for(int i =1; i < a.length ;i++) {

			int element = a[i];


			for(int j = 0 ; j< index; j++){
				{
					if (a[j] == element)
						break;
				}


				if(j == index-1)
				{
					a[index++] = element;
					break;
				}
			}
		}

		return Arrays.copyOf(a, index);
	}

	public static void main(String[] args) {

		int a[] = {10,20,30,30,30,10,20};
		System.out.println("Original Array:"+Arrays.toString(a));


		int b[] = removeDuplicate(a);
		System.out.println("Unique Array:"+Arrays.toString(b));
	}



}

