package String;

import java.util.Scanner;

public class First_letter_capital {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String:");
		String str=sc.nextLine();
		
		System.out.println(isFirstCapitalLetter(str));
//		String[] s1=str.split(" ");
//		String s2="";
//		for(int i=0;i<s1.length;i++) {
//			char[] ch=s1[i].toCharArray();
//			if(ch[0]>='A' && ch[0]<='Z') {
//			s2+=s1[i]; 
//			}
//			else{
//			ch[0]=(char)(ch[0]-32);
//			for(int k=0;k<ch.length;k++) {
//				s2+=ch[k];
//			}
//			}
//			if(i<s1.length-1) s2+=" ";
//			
//			
//		}
//		
//		
//		System.out.print(s2);
//		
//		
		
		
		sc.close();
		
	}

	private static String isFirstCapitalLetter(String str) {
		String[] s1=str.split(" ");
		String s2="";
		for(int i=0;i<s1.length;i++) {
			char[] ch=s1[i].toCharArray();
			if(ch[0]>='A' && ch[0]<='Z') {
			s2+=s1[i]; 
			}
			else{
			ch[0]=(char)(ch[0]-32);
			for(int k=0;k<ch.length;k++) {
				s2+=ch[k];
			}
			}
			if(i<s1.length-1) s2+=" ";
			
			
		}
		return s2;
	}

}
