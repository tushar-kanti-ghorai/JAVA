package Pattern;

import java.util.Scanner;

public class AlphaNumeric_Triangle_Pattern {
		public static void main(String[] args) {
			  Scanner sc=new Scanner(System.in);
			  System.out.print("Enter a number:");
			  int n=sc.nextInt();
			  int sp=n-1;
			  int st=1;
			  char ch='A';
			  int num=1;
			  for(int i=1;i<=n;i++) {
				  for(int j=1;j<=sp;j++) {
					  System.out.print("  ");
				  }
				  
				  for(int k=1;k<=st;k++) {
					  if(k==1 || k==st || i==n) {
						  System.out.print(ch+" ");
						  ch++;
					  }else {
						  System.out.print(num +" ");
						  num++;
					  }
				  }
				  System.out.println();
				  
				  sp--;
				  st+=2;
			  }
			  sc.close();
		  }}


