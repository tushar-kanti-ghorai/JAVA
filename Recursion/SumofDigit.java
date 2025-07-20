package Recursion;

import java.util.Scanner;

public class SumofDigit {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter a number:");
		  int n=sc.nextInt();
		  System.out.println(isSumofDigit(n,0));
		  sc.close();
		  
		  
	  }
	
	public static int isSumofDigit(int n,int sum) {
		if(n==0) return sum;
		sum+=n%10;
		return isSumofDigit(n/10,sum);
	}

}
