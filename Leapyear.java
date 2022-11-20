import java.util.Scanner; 
public class Leapyear{

	public static void main(String[] args) {
		Scanner myyear=new Scanner(System.in);
		System.out.println("Enter any year");
		short year=myyear.nextShort();
			if(year%4==0 && year % 100 != 0||year%400==0){
				
					System.out.println("LEAP YEAR");

				
			} 
			else{
				System.out.println("ORDINARY YEAR");
			
			}
	
	}
}
