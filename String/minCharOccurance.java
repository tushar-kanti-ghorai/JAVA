package String;

import java.util.Scanner;

public class minCharOccurance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String:");
	    String s=sc.nextLine();
	    int check=Integer.MAX_VALUE;
	    char ch1=' ';
	    char[] ch=s.toCharArray();
	    for(int i=0;i<ch.length;i++) {
	    	if(ch[i]==' ') continue;
	    	int count=1;
	    	for(int j=i+1;j<ch.length;j++) {
	    		if(ch[i]==ch[j]) {
	    			count++;
	    			ch[j]=' ';
	    		}
	    		
	    	}
	    	if(count<=check) {
	    	   check=count;
	    	   ch1=ch[i];
	    	}
	    	
	    }
	    
	    System.out.println("Minimum "+ch1+" character occurence="+check);
		sc.close();
	}
}
