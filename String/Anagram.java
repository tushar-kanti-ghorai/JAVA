package String;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.print(anagram(s1,s2));
		sc.close();
	}

	private static boolean anagram(String s1, String s2) {
		while(s1.length()==s2.length()) {
			if(s1.length()==0 && s2.length()==0) return true;
			char c=s1.charAt(0);
			s1=s1.replace(c+"","");
			s2=s2.replace(c+"","");
		}
		
		
		return false;
	}

}
