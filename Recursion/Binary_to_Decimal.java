package Recursion;
import java.util.*;
public class Binary_to_Decimal {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a binary num:");
	int n=sc.nextInt();
	System.out.print("The binary num of decimal is:"+binTodec(n,1,0));
	sc.close();
}

public static int  binTodec(int n,int p,int sum) {
	if(n==0) return sum;
	sum+=(p*(n%10));
	return binTodec(n/10,p*2,sum);
}
}
