package Polymorphism;
class A{
	public void m1(int i) {
		System.out.println("A");
	}
	

}

 class B extends A{
	 @Override
	 public void m1(int i) {
		 System.out.println("B");
	 }
	
	 public void m1(int i,int j) {
		 System.out.print("B-overloaded");
	 }
 }
public class Overriding_overloaded {
public static void main(String[] args) {
	B b=new B();
	b.m1(10);
	b.m1(10,20);
}
}
