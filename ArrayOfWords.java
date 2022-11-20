import java.util.Scanner;
public class ArrayOfWords{
	public static void main(String[] args) {
		Scanner myinput=new Scanner(System.in);
		System.out.println("Enter a phrase");
		String input=myinput.nextLine();
		String[] output;
		output=input.split(" ");
		for (String a : output){
            System.out.println(a);
		}
		// System.out.print(output);
    }
		
    }
