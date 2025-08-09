package Sorting_Algo;

import java.util.Arrays;
import java.util.Scanner;

public class Selection_sort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the element one by one :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Sorted Array in ascending order:"+selectionSort(arr));
		sc.close();
	   
	}

	private static String selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int index=i;
			for(int j=index+1;j<arr.length;j++) {
				if(arr[j]<arr[index]) {
					index=j;
				}
			}
			
			if(i!=index) {
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
			}
		}
		return Arrays.toString(arr);
	}

}
