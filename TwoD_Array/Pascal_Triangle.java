package TwoD_Array;

public class Pascal_Triangle {
	public static void main(String[] args) {
		int[][] arr=new int[5][];
		isPascal(arr);
		int space=arr.length-1;
		for(int i=0;i<arr.length;i++) {
			for(int k=0;k<space;k++)
				System.out.println(" ");
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			space--;
		}
	}

	private static void isPascal(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
		    arr[i]=new int[i+1];
		    for(int j=0;j<arr[i].length;j++) {
		    	if(j==0 || j==i) {
		    		arr[i][j]=1;
		    	}else {
		    		arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
		    	}
		    }
		}
		
	}

}
