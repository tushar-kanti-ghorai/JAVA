package Recursion;

import java.util.Scanner;

public class Prime_SecondHighest {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the upper range:");
		int up=sc.nextInt();
		System.out.print("Enter the lower range:");
		int low=sc.nextInt();
        secondHighestPrime(up,low,0);
        sc.close();
	}
	public static void secondHighestPrime(int up,int low, int count ) {
		if(up<low) return;
		if(isPrime(up,up/2)) {
			count++;
			if(count==2) {
				System.out.println("The 2nd highest of prime num is:"+up);
				return;
			}
		}
		secondHighestPrime(up-1,low,count); 
	}
	
	
	public static boolean isPrime(int num,int i) {
		if(i==1) return true;
		if(num<=1 || num%i==0) return false;
		return isPrime(num,i-1);
	}
}
