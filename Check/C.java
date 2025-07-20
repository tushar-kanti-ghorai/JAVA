package Check;

public class C {
	int b;
	static int a;
	public static void main(String[] args) {
		C c=new C();
		c.a=10;
	    c.b=1;
	    System.out.println(c.a+" "+c.b);
	    C c1=new C();
	    c1.a=20;
	    c1.b=2;
	    System.out.println(c1.a+" "+c1.b);
	    System.out.println(c.a+" "+c.b);
	    
	}

}
