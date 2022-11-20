import java.util.*;
public class Userarray{
	static int[] numbers;
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the length of the array");
		int length=input.nextInt();
		numbers=new int[length];
		for(int i=0;i<length;i++){
			System.out.println("enter the number");
		int number=input.nextInt();
		numbers[i]=number;	
	}
			System.out.println(Arrays.toString(numbers));

	}
}