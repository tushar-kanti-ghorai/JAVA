package Pattern;

import java.util.Scanner;

public class Cross_Pattern {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter a number:");
		  int n=sc.nextInt();
		  if(n%2==0) n+=1;
		  for(int i=1;i<=n;i++) {
			  for(int j=1;j<=n;j++) {
				  if(j==i || j==(n+1)-i) {
				  System.out.print("* ");
				  }else {
					  System.out.print("  ");
				  }
			  } 
			  System.out.println();
		  }
		  sc.close();
	  }

}
