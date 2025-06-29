package Pattern;
import java.util.*;
public class FirstLetter_MyName {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter an number:");
	 int n=sc.nextInt();
	 for(int i=1;i<=n;i++) {
		 for(int j=1;j<=n;j++) {
			 if(i==1 || j==((n/2)+1)) {
				 System.out.print("*");
			 }else {
				 System.out.print(" ");
			 }
		 }
		 System.out.println();
	 }
	 sc.close();
 }
}
