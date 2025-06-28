package Recursion;
import java.util.*;

public class Alternative_PrimeNum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the start range:");
	int start=sc.nextInt();
	System.out.print("Enter the end range:");
	int end=sc.nextInt();
	alternative_prime(start,end,0);
	sc.close();
}

public static void alternative_prime(int start,int end,int count) {
	if(start>end) return;
	if(isPrime(start,start/2)) {
		count++;
		if(count%2!=0) {
			System.out.print(start+" ");
		}
		
	}
	 alternative_prime(start+1,end,count);
}


public static boolean isPrime(int num,int i) {
	if(i==1) return true;
	if(num<=1 || num%i==0) return false;
	return isPrime(num,i-1);
}
}
