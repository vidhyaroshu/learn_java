import java.util.*;
class Mulandsub{

public static void main(String[] args) {
	Scanner num=new Scanner(System.in);
	System.out.println("enter any number");
	int number=num.nextInt();
	for(int i=0;i<=10;i++){
		int mul=number*i;
		System.out.println(number+"*"+i+"="+mul);
	}
	for(int i=0;i<=10;i++){
		int sub=number-i;
		System.out.println(number+"-"+i+"="+sub);
	}
	
}
}