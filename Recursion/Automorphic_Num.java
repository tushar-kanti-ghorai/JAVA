package Recursion;
import java.util.*;
public class Automorphic_Num {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a num:");
	int n=sc.nextInt();
	int sqr=n*n;
	System.out.print(isAutomorphic(n,sqr));
	sc.close();
}


public static boolean isAutomorphic(int n ,int sqr) {
	if(n==0) return true;
	if((n%10)!=(sqr%10)) {
		return false;
	}
	return isAutomorphic(n/10,sqr/10);
}
}
