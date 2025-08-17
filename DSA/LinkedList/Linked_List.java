package DSA.LinkedList;

public class Linked_List {
Node head;
int count=0;

public void add(Object ele) {
	if(head==null) {
		head=new Node(ele);
		count++;
		return;
	}
	
	Node current=head;
	while(current.next!=null) {
		current=current.next;
	}
	
	current.next=new Node(ele);
	 
	count++;	
}

public Object get(int index) {
	if(index<0 || index>=size() ) throw new IndexOutOfBoundsException();
	if(index==0) return head.ele;
	Node curr=head;
	for(int i=1;i<=index;i++) {
		curr=curr.next;
	}
	
	return curr.ele;
		

}


public void addFirst(Object ele) {
	Node n=new Node(ele);
	n.next=head;
	head=n;
	count++;
}


public void add(Object ele,int index) {
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
current.next=n;
count++;

}


public void removeFirst() {
  head=head.next;
  count--;
}


public void remove(int index) {
if(index<0 || index>=size() ) throw new IndexOutOfBoundsException();
if(index==0) {
	removeFirst();
	return;
}
Node current=head;
for(int i=1;i<index;i++)
   current=current.next;

current.next=current.next.next;
count--;
}



public void display() {
	Node current=head;
	while(current!=null) {
		System.out.println(current.ele);
		current=current.next;
	}
	
}




public int size() {
	return count;
}

public boolean isEmpty() {
	return count==0;
}



}
