package Recursion;

import java.util.Scanner;

public class Neon_num {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sqr=n*n;
        System.out.println(isNeon(n,sqr,0));
        sc.close();
    }
	
	
	public static boolean isNeon(int n,int sqr,int sum) {
		if(sqr==0) return sum==n;
		sum+=(sqr%10);
		return isNeon(n,sqr/10,sum);
	}
}
