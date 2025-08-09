package String;

import java.util.Scanner;

public class Reverse_word_Split {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a String:");
	String str=sc.nextLine();
	String[] s1=str.split(" ");
	String s2="";
	for(int i=0;i<s1.length;i++) {
		char[] ch=s1[i].toCharArray();
		for(int j=0;j<ch.length/2;j++) {
			char temp=ch[j];
			ch[j]=ch[ch.length-j-1];
			ch[ch.length-j-1]=temp;
		}
		
		for(int k=0;k<ch.length;k++) {
			s2+=ch[k];
		}
		
		
		if(i<s1.length-1) s2+=" ";
	}
	
	System.out.println(s2);
	sc.close();
}
}

