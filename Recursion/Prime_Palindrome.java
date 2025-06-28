package Recursion;
import java.util.*;
public class Prime_Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter a number:");
	    int n=sc.nextInt();
	    System.out.println(isPrime_palindrome(n));
	    sc.close();
	}
	
	public static boolean isPrime_palindrome(int n) {
		return (isPrime(n,n/2)&& isPalindrome(n,n,0)) ;
	}
	
	public static boolean isPrime(int n,int i) {
		if(i==1) return true;
		if(n<=1 || n%i==0) return false;
		return isPrime(n,i-1);
	}
	
	public static boolean isPalindrome(int n,int m, int rev) {
		if(n==0)return rev==m;
		rev=(rev*10)+(n%10);
		return isPalindrome(n/10,m,rev);
	}
	

}
