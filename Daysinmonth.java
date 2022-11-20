import java.util.Scanner;
public class Daysinmonth{
	public static void main(String[] args) {
		Scanner mynum = new Scanner(System.in);
    byte monthNum;
    System.out.println("Enter month number"); 
    monthNum = mynum.nextByte();
		Scanner myyear=new Scanner(System.in);
		
		System.out.println("Enter year");
		int year=myyear.nextInt();				
			if(1<=monthNum&&monthNum<=12){
				switch(monthNum){
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						System.out.println("31 days");
						break;
					case 2:
						if(year%4==0 && year % 100 != 0||year%400==0){
							
								System.out.println("29Days");
						} 
						else{
							System.out.println("28Days");
						
						}
						break;
					default:
						System.out.println("30 days");
						break;
				}
			}
			else{
				System.out.println("Invalid month");
			}
	}
}

		