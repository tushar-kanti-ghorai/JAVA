package Loops;

import java.util.Scanner;

public class Alternative_prime_num {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int st=sc.nextInt();
		int ed=sc.nextInt();
		int count=0;
		for(int i=st;i<=ed;i++) {
			boolean flag=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			
			if(flag && i>=2) {
				count++;
				if(count%2!=0) {
					System.out.println(i);
				}
			}
		}
		
		sc.close();
	}

}
