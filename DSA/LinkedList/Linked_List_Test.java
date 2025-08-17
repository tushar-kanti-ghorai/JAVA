package DSA.LinkedList;

public class Linked_List_Test {
public static void main(String[] args) {
	Linked_List list=new Linked_List();
	list.addFirst('a');
	list.add(30);
	list.add(30.88);
	list.add("Tushar");
//    list.removeFirst();
    list.remove(3);
//    list.add(true,2);
    
	
	list.display();
	System.out.println( list.size());
//	System.out.println(list.isEmpty());
	System.out.println(list.get(0));
	
}

}
