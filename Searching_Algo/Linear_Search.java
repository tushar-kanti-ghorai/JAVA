package Searching_Algo;

import java.util.Scanner;

public class Linear_Search {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int n=sc.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter the element one by one :");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	
	System.out.println("Enter the element which you want to find from the given array");
	int element=sc.nextInt();
	int i=linearSearch(arr,element);
	if(i==-1) {
		System.out.print("Element not found in the array:");
	}else {
		System.out.print("Element found at position:"+(i+1));
	}
	sc.close();
	
}

public  static int linearSearch(int[] arr,int element) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==element) {
			return i;
		}
	}
	return -1;
}
}
