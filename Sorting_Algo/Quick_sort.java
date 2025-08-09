package Sorting_Algo;

import java.util.Arrays;
import java.util.Scanner;

public class Quick_sort {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int n=sc.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter the element one by one :");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	quickSort(arr);
	System.out.println("Sorted Array in ascending order:"+Arrays.toString(arr));
	sc.close();
}

private static void  quickSort(int[] arr) {
	
	int start=0,end=arr.length-1;
	
	quickSort(arr,start,end);
	
}

private static void quickSort(int[] arr,int start,int end) {
	if(start>=end) return;
	int i=start,j=end;
	int pivot=arr[(start+end)/2];
	
	while(i<=j) {
		while(arr[i]<pivot) i++;
		while(arr[j]>pivot) j--;
		 if(i<=j) {
			 int temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
			 i++;
			 j--;
		 }
	}
	
	quickSort(arr,start,j);
	quickSort(arr,i,end);
	
}

}
