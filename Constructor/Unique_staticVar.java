package Constructor;


class Car{
	String color;
	int carNum;
	static int refno=1000;
	Car(String color){
		this.color=color;
		carNum=refno++;
	}
	
//	public void display() {
//		System.out.println("color="+color+" carNum="+carNum);
//	}
}

public class Unique_staticVar {
public static void main(String[] args) {
	Car c1=new Car("red");
	Car c2=new Car("black");
	Car c3=new Car("blue");
	c3.carNum=1011;
	System.out.println(c1.color+" "+c1.carNum+" "+Car.refno);
	System.out.println(c2.color+" "+c2.carNum +" "+Car.refno);
	System.out.println(c3.color+" "+c3.carNum+" "+Car.refno);
}
}
