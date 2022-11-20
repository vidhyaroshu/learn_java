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
class Cat extends Animal{
} 
class Heirarchial{
	public static void main(String[] args) {
		Dog obj1=new Dog();
		Cat obj2=new Cat();
		System.out.println(obj1.noOfLegs);
		System.out.println(obj1.typeOfEating);
		System.out.println(obj1.isgivingBirth);
		System.out.println(obj1.isPetAnimal);
		System.out.println(obj1.run(50));
		System.out.println(obj1.sleep(6));
		System.out.println(obj2.noOfLegs);
		System.out.println(obj2.typeOfEating);
		System.out.println(obj2.isgivingBirth);
		System.out.println(obj2.run(40));
		System.out.println(obj2.sleep(7));
	}
}