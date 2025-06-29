package Pattern;

import java.util.Scanner;

public class Palindromic_Number_Triangle {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter a number:");
		  int n=sc.nextInt();
		  int sp=n-1;
		  int st=1;
		  int p=0;
		  for(int i=1;i<=n;i++) {
			  for(int j=1;j<=sp;j++) {
				  System.out.print("  ");
			  } 
			  
			  for(int k=1;k<=st;k++) {
				  if(k<=i) {
					  System.out.print(k+" ");
					  p=k;
				  }else {
					 System.out.print(--p+" "); 
				  }
				  
			  }
			  System.out.println();
			  sp--;
			  st+=2;
		  }
		  sc.close();
	  }

}
