package DSA.Double_LinkedList;


public class Double_LinkedList {
	Node head;
	int count=0;

	public void add(Object ele) {
		Node n=new Node(ele);
		if(head==null) {
			head=n;
			count++;
			return;
		}
		
		Node current=head;
		while(current.next!=null) {
			current=current.next;
		}
		
		  current.next=n;
		  n.prev=current;
		count++;	
	}
	
	
	
	public int size() {
		return count;
	}

	public boolean isEmpty() {
		return count==0;
	}
	
	
	public void display() {
		Node current=head;
		while(current!=null) {
			System.out.println(current.ele);
			current=current.next;
		}
		
	}
	
	
	public void addFirst(Object ele) {
		Node n=new Node(ele);
		n.next=head;
		head.prev=n;
		head=n;
		count++;
	}
	
	public void add(Object ele, int index) {
		if(index<0 || index>=size() ) throw new IndexOutOfBoundsException();
		if(index==0) {
			addFirst(ele);
			return;
		}
		Node n=new Node(ele);
		Node current=head;
		for(int i=1;i<index;i++) {
			current=current.next;
		}
		
		n.next=current.next;
		n.prev=current;
		current.next.prev=n;
		current.next=n;
		count++;
	}
	
	
	public Object get(int index) {
	if(index<0 || index>=size() ) throw new IndexOutOfBoundsException();
	if(index==0) {
		return head.ele;
	}
	
	Node current=head;
	for(int i=1;i<=index;i++) {
		current=current.next;
	}
     return current.ele;
	}
	
	
	public void removeFirst() {
		head=head.next;
		head.prev=null;
		count--;
	}
	
	public void remove(int index) {
		if(index<0 || index>=size() ) throw new IndexOutOfBoundsException();
        if(index==0) {
        	removeFirst();
        	return;
        }
        Node current=head;
        for(int i=1;i<index;i++) {
        	current=current.next;
        }
        if(current.next.next==null) {
        	current.next=null;
        }else {
        current.next=current.next.next;
        current.next.prev=current;
        }
        count--;
	}

}
