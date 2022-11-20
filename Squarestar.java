import java.util.Scanner;
public class Squarestar{
	public static void main(String[] args) {
		Scanner myinput=new Scanner(System.in);
		System.out.println("Enter any number");
		byte input=myinput.nextByte();
 		String output="";
 		for(byte i=0;i<input;i++){
			for(byte j=0;j<input;j++){
 				output+="* ";
				
			}
		output+="\n";
 		}
 		System.out.print(output);
	}
}