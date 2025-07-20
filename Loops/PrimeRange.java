package Loops;
import java.util.Scanner;
public class PrimeRange {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the start Range:");
	int start=sc.nextInt();
	System.out.print("Enter the end Range:");
	int end=sc.nextInt();

	
	for(int i=start;i<=end;i++) {
		boolean flag=true;
		for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
				flag=false;
				break;
			}
			
		}
		
		if(flag && i>=2) {
			System.out.print(i+" ");
		}
	}
	
	sc.close();
	
}

}
