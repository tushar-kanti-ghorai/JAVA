package com.java.oops;

 class A{
	 int i;
	 int j;
 }
class B{
	int i=100;
	int j=200;
}
public class Passing_objref {
public static void m1(A a){
	System.out.println(a.i+" "+a.j);
}

public static void m1(B b){
	System.out.println(b.i+" "+b.j);
}



public static void main(String[] args) {
	m1(new A());
	m1(new B());
}
}
