class Animal{
	int noOfLegs=4;
	String typeOfEating="nonveg";
	boolean givingBirth=true;
	double sleep(double hours){
		double hoursOfSleep=hours;
		return hoursOfSleep;
	}
	double run(double speed){
		double speedperHour=speed;
		return speedperHour;
	}

}
class Dog extends Animal{
	
}
class Singlelevel{
	public static void main(String[] args) {
		Dog obj=new Dog();
		System.out.println(obj.noOfLegs);
		System.out.println(obj.typeOfEating);
		System.out.println(obj.givingBirth);
		System.out.println(obj.run(40));
		System.out.println(obj.sleep(7));
	}
}