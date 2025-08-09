package String.Basic_method;

public class Check_object {
	public static void main(String[] args) {
		Object o1=new String("Java");
		System.out.println(o1);//late binding for overridden toString().
		System.out.println(o1.equals("Java"));
	}

}
