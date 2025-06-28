package Recursion;
import java.util.*;
public class Prime_numRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the start range:");
		int start=sc.nextInt();
		System.out.print("Enter the end range:");
		int end=sc.nextInt();
        rangePrime(start,end);
        sc.close();
		
	}
	
	
	public static void rangePrime(int start,int end) {
		if(start>end) return ;
		
		if(isPrime(start,start/2)) {
			System.out.print(start+" ");
			
		}
		
		rangePrime(start+1,end);
	}
	
	public static boolean isPrime(int num,int i) {
		if(i==1) return true;
		if(num<=1 || num%i==0) return false;
		return isPrime(num,i-1);
	}

}
