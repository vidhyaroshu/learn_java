class Animal{
	int noOfLegs=4;
	String typeOfEating="nonveg";
	boolean isgivingBirth=true;
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
	boolean isPetAnimal=true;
}
class Cat extends Dog{

} 
class Multilevel{
	public static void main(String[] args) {
		Cat obj=new Cat();
		System.out.println(obj.noOfLegs);
		System.out.println(obj.typeOfEating);
		System.out.println(obj.isgivingBirth);
		System.out.println(obj.isPetAnimal);
		System.out.println(obj.run(40));
		System.out.println(obj.sleep(7));
	}
}