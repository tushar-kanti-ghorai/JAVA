package Searching_Algo;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the element one by one :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println("Enter the element which you want to find from the given array");
		int element=sc.nextInt();
		int i=binarySearch(arr,element);
		if(i==-1) {
			System.out.print("Element not found in the array:");
		}else {
			System.out.print("Element found at position:"+(i+1));
		}
		sc.close();
		
	}
	
	
	public static int binarySearch(int[] arr,int element) {
		int start=0;int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==element) return mid;
			if(arr[mid]>element) end=mid-1;
			else start=mid+1;
		}
		return -1;
	}

}
