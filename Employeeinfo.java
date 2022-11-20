class Employeeinfo{
	String name;
	int year;
	int salary;
	String address;
	public Employeeinfo(String name,int year,int salary,String address){
		this.name=name;
		this.year=year;
		this.salary=salary;
		this.address=address;
		
	}
	public static void main(String[] args) {
		Employeeinfo obj1=new Employeeinfo("RobertWallsStreat",1994,23452,"64C-" );
		Employeeinfo obj2=new Employeeinfo("SamWallsStreat",2000,76542,"68D-" );
		Employeeinfo obj3=new Employeeinfo("JohnWallsStreat",1999,61234,"26B-" );
		System.out.println("name            "+"year of joining      "+"Salary      "+"Address      ");
		System.out.println(obj1.name+"      "+obj1.year+"          "+obj1.salary+"      "+obj1.address);
		System.out.println(obj2.name+"        "+obj2.year+"          "+obj2.salary+"      "+obj2.address);
		System.out.println(obj3.name+"       "+obj3.year+"          "+obj3.salary+"      "+obj3.address);

	}
}