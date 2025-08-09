package Recursion;

import java.util.Scanner;

public class SingleDigit {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter a number:");
		  int n=sc.nextInt();
		  System.out.println(isSingleDigit(n,0));
		  sc.close();
		  
		  
	  }

	private static int isSingleDigit(int n, int sum) {
		if(n==0 && sum>9) {
			n=sum;
			sum=0;
		}
		if(n==0) return sum;
		sum+=(n%10);
		
		return isSingleDigit(n/10,sum);
	}
}
