package TypeClass;
class Single{
	static Single a;
	private Single() {
		
	}
	
   static public Single get() {//Factory method
		if(a==null) {
			a=new Single();
		}
		return a;
	}
}
public class Singleton_class {

 public static void main(String[] args) {
	 Single s=Single.get();
	 Single s1=Single.get();
	 System.out.println(s);
	 System.out.println(s1);
	 
System.out.println(	Single.get());
System.out.println(	Single.get());
}   
}
