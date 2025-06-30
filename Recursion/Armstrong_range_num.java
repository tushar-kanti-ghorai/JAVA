package Recursion;
import java.util.*;
public class Armstrong_range_num {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the start range:");
		int start=sc.nextInt();
		System.out.print("Enter the end range:");
		int end=sc.nextInt();
		rangeArmstrong(start,end);
		sc.close();
	}
	
	
	public static void rangeArmstrong(int start,int end) {
		if(start>end) return;
		if(isArmstrong(start)) {
			System.out.print(start+" ");
		}
		
	    rangeArmstrong(start+1,end);
	}
	
	
	
	public static int countDigit(int n) {
		if(n==0) return 0;
		return 1+countDigit(n/10);
	}
	
	
	
	public static boolean isArmstrong(int n) {
		int count=countDigit(n);
		int sum=calArmstrong(n,count);
		return sum==n;
	}
	
	public static int power(int base ,int exp) {
		if(exp==0) return 1;
		return base*power(base,exp-1);
	}
	
	public static int  calArmstrong(int n,int count) {
		if(n==0) return 0;
		return power(n%10,count)+calArmstrong(n/10,count);
	}

}
