import java.util.Scanner;
public class Trianglestar{
	public static void main(String[] args) {
		Scanner mynum=new Scanner(System.in);
		System.out.println("Enter any number");
		byte input=mynum.nextByte();
 		String output="";
 		for(byte i=0;i<input;i++){
			for(byte j=0;j<=i;j++){
 				output+="* ";
				
			}
		output+="\n";
 		}
 		System.out.print(output);
	}
}