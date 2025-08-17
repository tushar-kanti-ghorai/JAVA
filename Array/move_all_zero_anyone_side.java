package Array;

import java.util.Arrays;
import java.util.Scanner;

public class move_all_zero_anyone_side {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the element one by one :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
	move_all_zero(arr);
	sc.close();
	}

	private static void move_all_zero(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				if((i+1)<arr.length) {
			      int temp=arr[i+1];
			      arr[i+1]=arr[i];
			      arr[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
