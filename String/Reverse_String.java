package String;
import java.util.Scanner;
public class Reverse_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String str=sc.nextLine();
		System.out.println("Reverse String="+rev(str));
		sc.close();
	}
	
	public static String rev(String str) {
		char[] ch=str.toCharArray();
		int s=0;
		int e=ch.length-1;
		while(s<e) {
			char temp=ch[s];
			ch[s]=ch[e];
			ch[e]=temp;
			s++;
			e--;
		}
		
		return new String(ch);
	}

}
