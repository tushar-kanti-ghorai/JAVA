package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_duplicate_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements one by one:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        remove_duplicate_element(arr);
        sc.close();
    }

    private static void remove_duplicate_element(int[] arr) {
        Arrays.sort(arr);
        int i=0;
        for(int j=1;j<arr.length;j++) {
        	if(arr[i]!=arr[j]) {
        		arr[i+1]=arr[j];
        		i++;
        	}
        	
        }

        i=i+1;
        System.out.print("Array without duplicates: ");
        for (int k = 0; k<i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
