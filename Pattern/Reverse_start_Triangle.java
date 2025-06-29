package Pattern;

import java.util.Scanner;

public class Reverse_start_Triangle {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter a number:");
		  int n=sc.nextInt();
		  int sp=0;
		  int st=(2*n)-1;
		  for(int i=1;i<=n;i++) {
			  for(int j=1;j<=sp;j++) {
				  System.out.print("  ");
			  } 
			  
			  for(int k=1;k<=st;k++) {
				  System.out.print("* ");
			  }
			  System.out.println();
			  sp++;
			  st-=2;
		  }
		  sc.close();
	  }
}
