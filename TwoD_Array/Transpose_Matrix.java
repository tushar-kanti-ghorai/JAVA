package TwoD_Array;

import java.util.Arrays;

public class Transpose_Matrix {
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] trans=new int[arr.length][arr.length];
		transposeMatrix(arr,trans);
		for(int[] n:trans) {
			System.out.println(Arrays.toString(n));
		}
		
	}

	private static void transposeMatrix(int[][] arr, int[][] trans) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				trans[j][i]=arr[i][j];
			}
		}
		
	}

}
