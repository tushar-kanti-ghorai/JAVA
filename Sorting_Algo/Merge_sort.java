package Sorting_Algo;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements one by one:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr); 
        System.out.println("Sorted Array in ascending order: " + Arrays.toString(arr));
        sc.close();
    }

    private static void mergeSort(int[] arr) {
        if (arr.length <= 1) return;

        int[] left = new int[arr.length / 2];
        int[] right = new int[arr.length - left.length];

        int i = 0;
        while (i < left.length) {
            left[i] = arr[i];
            i++;
        }
        int j = 0;
        while (j < right.length) {
            right[j] = arr[i];
            i++;
            j++;
        }

        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}
