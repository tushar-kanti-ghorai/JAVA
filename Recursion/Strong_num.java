package Recursion;
import java.util.*;
public class Strong_num {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter a number:");
		  int n=sc.nextInt();
		  System.out.println(isStrong(n,n,0));
		  sc.close();
		  
		  
	  }
	
	public static boolean isStrong(int n,int m,int sum) {
		if(n==0) return m==sum;
		sum+=fact(n%10);
		return isStrong(n/10,m,sum);
	}
	
	public static int fact(int n) {
		if(n==0||n==1) return 1;
		return n*fact(n-1);
	}
}
