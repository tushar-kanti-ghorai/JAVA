package Operators;

public class Uniary {
	public static void main(String[] args) {
		int a=11;
		int b=22;
		int c=a+b+ a++ + b++ + ++a + ++b;
		System.out.println(c);
	}

}
