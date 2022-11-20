import java.util.Scanner;
public class ZeroOne{
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter any number");
		String num=inp.nextLine();
		String[] split=num.split("");
		String output="";
		for(String a : split){
 			int i=Integer.parseInt(a);
			if(i<5){
				output+=0;
			}
			else{
				output+=1;
			}
		}
		System.out.println(output);

	}
}