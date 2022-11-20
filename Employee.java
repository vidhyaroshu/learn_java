class Employee{
	private int salary;
	private double hoursperday;
	 int sal;
	 double hours;
	 int finsal;
	public Employee(int salary,double hoursperday){
		this.salary=salary;
		this.hoursperday=hoursperday;
	}
		void getInfo(){
			sal=salary;
			hours=hoursperday;
		}
		void addwork(){
			if(sal<500){
				finsal=salary+10;
				System.out.println(finsal);
			}
			
		}
	void addsal(){
		if(hours>6){
			finsal=salary+5;
			System.out.println(finsal);
		}
	}
	

	public static void main(String[] args) {
		Employee obj=new Employee(400,4);
		obj.getInfo();
		obj.addsal();
		obj.addwork();

	}
}
