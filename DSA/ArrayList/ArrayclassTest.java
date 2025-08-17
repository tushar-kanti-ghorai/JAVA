package DSA.ArrayList;

public class ArrayclassTest {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		
	   for(int i=0;i<a.size();i++) {
        System.out.print(a.get(i)+" ");
	   }
		
	   a.remove(1);
	   
	   for(int i=0;i<a.size();i++) {
	        System.out.print(a.get(i)+" ");
		   }
	}

}
