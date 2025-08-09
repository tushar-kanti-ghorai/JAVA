package com.java.oops;
import java.util.Scanner;
class Book{
	String Bookname;
	double price;
	public void display() {
		System.out.println(Bookname+" "+price);
	}
	
	public static Book getBook() {
		Scanner sc=new Scanner(System.in);
		Book b=new Book();
		b.Bookname=sc.next();
		b.price=sc.nextDouble();
		 sc.close();
		return b;
	}
}
public class Factory_method {
 public static void main(String[] args) {
	Book b1=Book.getBook();//copy reference
	b1.display();

}
 

}
