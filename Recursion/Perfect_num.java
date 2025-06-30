package Recursion;
import java.util.*;
public class Perfect_num {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter a number:");
	  int n=sc.nextInt();
	  System.out.println(isPerfect(n,n/2,0));
	  sc.close();
	  
	  
  }
  
  public static boolean isPerfect(int num,int i,int sum) {
	  if(i==0) return sum==num;
	  if(num%i==0) {
		  sum+=i;
	  }
	  return isPerfect(num,i-1,sum);
  }
}
