import java.util.*;
public class Reversesum{
	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
	System.out.println("enter any number");
	int n=num.nextInt();
	int temp=n;
	int rev=0;
	int rem=0;
		while(n>0){
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		int dif=temp-rev;
		System.out.println(dif);
	}
}