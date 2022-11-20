import java.util.*;
public class Harshad{
	public static void main(String[] args) {
		Scanner digits=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=digits.nextInt();
		int numbe=n;
		int rem=0;
		int sum=0;
		int rev=0;
		int sum1=0;
		while(n>0){
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		int temp=sum;
		if(n%sum==0){
			
			while(sum>0){
			rem=sum%10;
			sum1=sum1*10+rem;
			sum=sum/10;
				
			}
		}
		if(temp*sum1==numbe){
			System.out.println("true");
		}
		// System.out.println(sum1);
		// String numb=String.valueOf(numb);
		// String[] digit1=numb.split("");
		// int sum=0;
		// // Int[] num=ne
		// for(int i=0;i<digit1.length;i++){
		// 	digit1[i]=Integer.parseInt(digit1[i]);
		// 	sum+=digit1[i];
		// }
		// System.out.println(sum);
	}
}