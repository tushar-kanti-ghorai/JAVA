package Recursion;
import java.util.*;
public class Disarium_Number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a num:");
	int n=sc.nextInt();
	System.out.print(isDisarium(n));
	sc.close();
}

public static boolean isDisarium(int n) {
	int count=countDigit(n);
	int sum=calDisarium(n,count,0);
	return sum==n;
}


public static int countDigit(int n) {
	if(n==0) return 0;
	return 1+countDigit(n/10);
	
}

public static int prod(int n,int exp) {
	if(exp==0) return 1;
	return n*prod(n,exp-1);
}

public static int calDisarium(int n,int count,int sum) {
	if(n==0) return sum;
	
	return prod(n%10,count)+calDisarium(n/10,count-1,sum);
}
}
