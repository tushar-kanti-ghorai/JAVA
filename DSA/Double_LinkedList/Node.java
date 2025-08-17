package DSA.Double_LinkedList;
public class Node {
	Node next;
	Object ele;
	Node prev;
	
	
	
	public Node(Object ele) {
		this.ele=ele;
	}
	
	public Node(Node next,Object ele, Node prev) {
		this.next = next;
		this.ele = ele;
		this.prev=prev;
	}
}
