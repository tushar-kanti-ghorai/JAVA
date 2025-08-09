package Sorting_Algo;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_sort {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int n=sc.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter the element one by one :");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	
	System.out.println("Sorted Array in ascending order:"+bubbleSort(arr));
	sc.close();
   
}


public static String bubbleSort(int[] arr) {
	boolean swapped;
	for(int i=0;i<arr.length-1;i++) {
		swapped=false;
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j+1]<arr[j]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				swapped=true;
			}
			
			
		}
		
		if(!swapped) {
			break;
		}
	}
	
	return Arrays.toString(arr);
}
}
