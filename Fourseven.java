import java.util.Scanner;
public class Fourseven{
	static String Fourtoseven(int a){
		while(a==7){
			return "four";
		}
		while(a==4){
			return "seven";
		}
		return "zero";
	}
	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("Enter any number");
int num=input.nextInt();
// int i=0;
	// 		while(num==4){
// 			System.out.println(7);
// 			break;
// 			// i++;
// 		}
// 		while(num==7){
// 			System.out.println(4);
		// 	break;
		// 	// i++;
		// }
		// while(num!=4 && num!=7){
String result=Fourtoseven(num);
		System.out.println(result);
		

		}
	}
// 	}
// }