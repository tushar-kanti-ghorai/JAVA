package Recursion;

import java.util.Scanner;

public class Decimal_to_Binary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a decimal num:");
		int n=sc.nextInt();
		System.out.print("The decimal num of binary is:"+decTobin(n,1,0));
		sc.close();
	}
	
	public static int decTobin(int n,int p,int sum) {
		if(n==0) return sum;
		sum+=(p*(n%2));
		return decTobin(n/2, p*10, sum);
		
	}

}
 