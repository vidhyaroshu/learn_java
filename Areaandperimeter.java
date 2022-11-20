import java.util.*;
class Rectangle{
	int length;
	int breadth;
	public Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	} 
	public void area(){
		int result=length*breadth;
		System.out.println("area = "+result);
	}
	public void perimeter(){
		int result=2*(length+breadth);
		System.out.println("perimeter = "+result);
	}
}
class Square{
	int side;
	public Square(int side){
		this.side=side;
	} 
	public void area(){
		int result=side*side;
		System.out.println("area = "+result);
	}
	public void perimeter(){
		int result=4*side;
		System.out.println("perimeter = "+result);
	}
}
class Triangle{
	int length;
	int breadth;
	int height;
	public Triangle(int length,int breadth,int height){
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	} 
	public void area(){
		int result=(length*breadth)/2;
		System.out.println("area = "+result);
	}
	public void perimeter(){
		int result=2*(length+breadth);
		System.out.println("perimeter = "+result);
	}
}
class Areaandperimeter{
	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
	System.out.println("enter the number");
	int shape=num.nextInt();
	switch(shape){
		case 1:
			System.out.println("enter the length");
	int length1=num.nextInt();
	System.out.println("enter the breadth");
	int breadth1=num.nextInt();
	Rectangle obj1=new Rectangle(length1,breadth1);
	obj1.area();
	obj1.perimeter();
	break;

		
		case 2:
			System.out.println("enter the side");
	int side=num.nextInt();
	Square obj2=new Square(side);
	obj2.area();
	obj2.perimeter();
	break;

		
		case 3:
			System.out.println("enter the length");
	int length3=num.nextInt();
	System.out.println("enter the breadth");
	int breadth3=num.nextInt();
	System.out.println("enter the breadth");
	int height3=num.nextInt();
	Triangle obj3=new Triangle(length3,breadth3,height3);
	obj3.area();
	obj3.perimeter();
	break;
case 4:
	System.out.println("EXIT");

		
	}		
	}
}