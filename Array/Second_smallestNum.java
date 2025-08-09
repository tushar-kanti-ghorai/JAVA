package Array;

import java.util.Scanner;

public class Second_smallestNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the element one by one :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
	int i= second_smallestNum(arr,arr[0],arr[0]);
	System.out.println("Second smallest element->"+i);
	sc.close();
		
	}
	
	public static int second_smallestNum(int[] arr,int s1,int s2) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==s1) continue;
			if(arr[i]<s1) {
				s2=s1;
				s1=arr[i];

		}else if(arr[i]<s2 || s1==s2) {
			s2=arr[i];
		}
			
			
	}
	return s2;
	}

}
