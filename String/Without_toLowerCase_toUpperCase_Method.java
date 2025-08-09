package String;

import java.util.Scanner;

public class Without_toLowerCase_toUpperCase_Method {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a String:");
	String str=sc.nextLine();
	System.out.println("Enter number->1.Convert Lower case \nEnter number->2.convert upper case");
	System.out.print("Enter the number:");
	int n=sc.nextInt();
    if(n==1)
	System.out.println("Converting String into Lowercase is="+lowerCase(str));
    else if(n==2)
    System.out.println("Converting String into Uppercase is="+upperCase(str));
    else
    System.out.println("Invalid ");

    	
	sc.close();
}

 private static String upperCase(String str) {
	 
	 char[] ch=str.toCharArray();
	    for(int i=0;i<ch.length;i++) {
	    	if(ch[i]>='a' && ch[i]<='z') {
	    		ch[i]=(char)(ch[i]-32);
	    	}
	    }
		
		return new String(ch);
}

 public static String lowerCase(String str) {
    char[] ch=str.toCharArray();
    for(int i=0;i<ch.length;i++) {
    	if(ch[i]>='A' && ch[i]<='Z') {
    		ch[i]=(char)(ch[i]+32);
    	}
    }
	
	return new String(ch);
}

}
