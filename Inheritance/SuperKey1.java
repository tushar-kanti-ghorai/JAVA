package Inheritance;


class A{
	int i=10;
	int j=20;
	public void m1() {
		System.out.println("A-m1()");
	}
}
	class B extends A{
		
		int i=30;
		int j=40;
		@Override
		public void  m1() {
			super.m1();
			System.out.println(i+" "+j);
			System.out.println(super.i+" "+super.j);
			}
}
	
	class C extends B{
		
		int i=50;
		int j=60;
		public void m3() {
			super.m1();
			System.out.println(i+" "+j);
			System.out.println(super.i+" "+super.j);
		}
		
	}
public class SuperKey1 {
public static void main(String[] args) {
	C c=new C();
	c.m3();
}

}
