class Student{
	String name;
	long phonenum;
	int rollno;
	String address;
	public Student(String name,long phonenum,int rollno,String address){
		this.name=name;
		this.phonenum=phonenum;
		this.rollno=rollno;
		this.address=address;
		System.out.println("name : "+name);
		System.out.println("phonenumber : "+phonenum);
		System.out.println("rollno : "+rollno);
		System.out.println("address : "+address);
	}
	public static void main(String[] args) {
		Student obj1=new Student("Sam",9876543234l,36,"Sam /34-56, hg" );
		Student obj2=new Student("John",8798093234l,63,"John 38-87, g/jh" );

	}
}