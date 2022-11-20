public class Extend{
	public static void main(String[] args) {
	
		Student obj=new Student();
		Student student;
	System.out.println(name,age);

}
	

}
class User{
	String name;
	int age;
	public User(String name,int age){
		this.name=name;
		this.age=age;
	}
}
class Student extends User{
	public Student(String name,int age){
		name="hbnm";
		age=6;
		super(name, age);
	}
}
