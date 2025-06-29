package Pattern;

import java.util.Scanner;

public class Reverse_Right_Half_Pyramid {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter a number:");
		  int n=sc.nextInt();
		  for(int i=1;i<=n;i++) {
			  for(int j=i;j<=n;j++) {
				  System.out.print("* ");
			  }
			  System.out.println();
		  }
		  sc.close();
	  }
}
