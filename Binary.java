import java.util.*;
public class Binary{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		int a=input.nextInt();
		int quotient;
		int[] reminder=new int[8];
		int[] output=new int[8];
		System.out.println(output[9]);
		for(int i=0;i<8;i++){
			quotient=a/2;
		reminder[i]=a%2;
		a=quotient;
		}
		// String output=reminder.reverse();
		// System.out.println(output);
		for(int k=0;k<reminder.length;k++){
		output[k]=reminder[reminder.length-k-1];
		}
		System.out.println(Arrays.toString(output));
	
	}
}