package DSA.Double_LinkedList;

public class UserProg {
	public static void main(String[] args) {
		Double_LinkedList list=new Double_LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
//		list.addFirst(1);
//		list.add(25,2);
//		list.add(1,0);
//		list.removeFirst();
//		list.remove(3);
		
		list.display();
		System.out.println(list.size());
		System.out.println(list.get(0));
	}
	
	
	

}
