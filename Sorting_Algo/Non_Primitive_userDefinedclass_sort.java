package Sorting_Algo;

import java.util.Arrays;
import java.util.Scanner;

/*
 * interface Comparable{
 * int compareTo(Object o);
 * }*/

class Student implements Comparable<Object>{
	int roll_no;
	Student(int roll_no){
		this.roll_no=roll_no;
	}
	
	@Override
	public int compareTo(Object o) {
		return roll_no-((Student)o).roll_no;
		
	}
	@Override
	public String toString() {
		return "Student [roll_no="+roll_no+"]";
	}
}

public class Non_Primitive_userDefinedclass_sort {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Student[] s=new Student[5];
	for(int i=0;i<s.length;i++) {
		int n=sc.nextInt();
		s[i]=new Student(n);
	}
	
	Arrays.sort(s);
	for(Student s1:s) {
		System.out.println(s1);
	}
	sc.close();
}
}


/*
 * Internally how to sort method work
 * only dummy creates for understand
 * public static void sort(Object[] a){
 * for(int i=0;i<a.length-1;i++){
 * for(int j=0;j<a.length-1-i;j++){
 *    Comparable c1=(Comparable)a[j];
 *    Comparable c2=(Comparable)a[j+1];
 *    if(c1.compareTo(c2)){
 *    swap(c1,c2);
 *    } 
 *   }
 *  }
 * }
 *  */
