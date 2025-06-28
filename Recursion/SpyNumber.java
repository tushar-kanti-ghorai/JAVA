package Recursion;
import java.util.*;
public class SpyNumber {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter a number:");
    	int n=sc.nextInt();
    	System.out.print(spy(n,0,1));
    	sc.close();
    }
    
    public static boolean spy(int num,int sum,int pro) {
    	if(num==0) return sum==pro;
    	return spy(num/10,sum+(num%10),pro*(num%10));
    }
}
