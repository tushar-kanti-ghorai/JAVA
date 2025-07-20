package Recursion;
import java.util.*;
public class Fibonacci_range_num {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter lower range:");
		int l=sc.nextInt();
		System.out.print("Enter upper range:");
		int u=sc.nextInt();
//		fiboRange(l,u,0,1);
		int i=0;
		while(true) {
			int current=fibo(i);
			if(current>u) break;
			if(current>=l) {
				System.out.print(current+" ");
			}
			i++;
		}
		sc.close();
	}
	
	
	public static int fibo(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return fibo(n-1)+fibo(n-2);
	}
	
//	public static void fiboRange(int l,int u,int a,int b) {
//		if(a>u) return;
//		if(a>=l) {
//			System.out.print(a+" ");
//			
//		}
//		
//		fiboRange(l,u,b,a+b);
//	}

}
