package DSA.ArrayList;

public class ArrayList {
Object[] obj=new Object[10];
int count=0;
public void add(Object ele) {
	obj[count++]=ele;
	if(count==obj.length) {
		increase();
	}
}
private void increase() {
	Object[] b=new Object[obj.length+5];
	System.arraycopy(obj,0,b,0,obj.length);
	obj=b;	
}


public int size() {
	return count;
}

public boolean isEmpty() {
	return count==0;
}

public Object get(int index) {
	if(index<0 || index>=size()){
		throw new ArrayIndexOutOfBoundsException();
	}
	
	return obj[index];
}

public void remove(int index) {
	if(index<0 || index>=size()){
		throw new ArrayIndexOutOfBoundsException();
	}
	
	for(int i=index;i<size();i++) {
		obj[i]=obj[i+1];
	}
	
	count--;
}


}
