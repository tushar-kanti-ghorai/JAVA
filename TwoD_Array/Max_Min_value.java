package TwoD_Array;

public class Max_Min_value {
public static void main(String[] args) {
	int[][]arr= {{17,4,5},{20,2,2},{8,15,3}};
	int max_value=max(arr);
	int min_value=min(arr);
	
   System.out.println("Max_value="+max_value);
   System.out.println("Min value="+min_value);
}

private static int min(int[][] arr) {
	int min=arr[0][0];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			if(arr[i][j]<min) {
				min=arr[i][j];
			}
		}
	}
	return min;
}

private static int max(int[][] arr) {
	int max=arr[0][0];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			if(arr[i][j]>max) {
				max=arr[i][j];
			}
		}
	}
	return max;
}
}
