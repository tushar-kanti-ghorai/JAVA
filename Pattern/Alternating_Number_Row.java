package Pattern;

import java.util.Scanner;

public class Alternating_Number_Row {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter a number:");
		  int n=sc.nextInt();
		  for(int i=1;i<=n;i++) {
			  if(i%2!=0) {
			  for(int j=1;j<=n;j++) 
				  System.out.print(j+" ");
			  }else {
				  for(int j=n;j>=1;j--) 
					  System.out.print(j+" ");
			  }
			  System.out.println();
		  }
		  sc.close();
	  }
}
