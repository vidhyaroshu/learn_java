import java.util.*;
class Compound{
	public void monthly(int principal,int rate,int year){
	
	}
	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
	System.out.println("enter the principal");
	double principal=num.nextDouble();
	System.out.println("enter the rate");
	double rate=num.nextDouble();
	System.out.println("enter the year");
	double year=num.nextDouble();
	Compound obj=new Compound();
	double result;
		for(int i=1;i<=year;i++){
			double r=(rate/12)/100;
			double r1=1+r;
			double power=i*12;
			double value=Math.pow(r1,power);
			result=value*principal;
			System.out.println("year"+"      "+"Futurevalue");
	System.out.println(i+"      "+result);
		}
	
	// obj.monthly(principal,rate,year);
	// System.out.println(Math.pow(1.0083333333333,12)*1000);
	}
}
