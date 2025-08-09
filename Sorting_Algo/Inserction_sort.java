package Sorting_Algo;

import java.util.Arrays;
import java.util.Scanner;

public class Inserction_sort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the element one by one :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Sorted Array in ascending order:"+inserctionSort(arr));
		sc.close();
	}

	private static String inserctionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=key;
		}
		return Arrays.toString(arr);
	}

}
