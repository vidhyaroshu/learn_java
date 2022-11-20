import java.util.*;
class Alphabetpattern{
	public static void main(String[] args) {
		Scanner letter=new Scanner(System.in);
		System.out.println("enter any number");
		char charact=letter.next().charAt(0);
		int asci=charact;
		String str="";
		
		// System.out.println(lett);
		int n=(asci-97)+1;
		for(int i=0;i<n;i++){
			
			for(int j=0;j<n-i;j++){
			char lett=(char)asci;
				str+=lett;
				

			}
			asci--;
			str+="\n";
		}
		System.out.print(str);

	}
}