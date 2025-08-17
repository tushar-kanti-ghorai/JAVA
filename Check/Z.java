package Check;

public class Z {
public static void main(String[] args) {
	String s="A5B37C";
	String s1=" ";
	for(int i=0;i<s.length();i+=2) {
		if(s.charAt(i)>'0' && s.charAt(i)<'9') {
			char ch=s.charAt(i+1);
			int count=s.charAt(i)-'0';
			for(int j=1;j<=count;j++) {
				s1+=ch;
			}
			
		}else {
			char ch=s.charAt(i);
			 int count=s.charAt(i+1)-'0';
			 for(int j=1;j<=count;j++) {
					s1+=ch;
				}
			}
			
		
	
	}
	
	System.out.println(s1);
}
}
