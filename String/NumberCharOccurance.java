package String;

import java.util.Scanner;

public class NumberCharOccurance {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a String:");
	String s=sc.nextLine();
	String s1="";
	System.out.print(ncr(s,s1));
	sc.close();
}

public static String ncr(String s,String s1) {
	for(int i=0;i<s.length();) {
		char ch=s.charAt(i);
		int count=1;
		i++;
		while(i<s.length() && ch==s.charAt(i)) {
			count++;
			i++;
		}
		
		s1=s1+count+ch;
		
	}
	return s1;
}
}
