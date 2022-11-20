import java.util.*;
public class Arrayofdigits{
	public static void main(String[] args) {
		Scanner digits=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int arraylength=digits.nextInt();
		int[] digitarray=new int[arraylength];
		
		for(int i=0;i<arraylength;i++){
			System.out.println("Enter the digits of the array");
			int number=digits.nextInt();
			

			digitarray[i]=number+i+1;
			if(digitarray[i]>=10){
				digitarray[i]=digitarray[i]%10;
				// digitarray[i]=Math.abs(10-digitarray[i]);

			}

		}
		System.out.println(Arrays.toString(digitarray));
	}
}