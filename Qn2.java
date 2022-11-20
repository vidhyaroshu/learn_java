import java.util.*;
class Lettertoz{
	public static void main(String[] args) {
		Scanner letter=new Scanner(System.in);
	System.out.println("enter any number");
	char charact=letter.next().charAt(0);
	int asci=charact;
	String str="";
	char letters;
	if(asci>=97 && asci<=122){
		for(int i=asci;i<=122;i++){
			letters=(char)i;
			str+=letters;
			
		}
		System.out.println(str);
}
else if(asci>=65 && asci<=90){
		for(int i=asci;i<=90;i++){
			letters=(char)i;
			str+=letters;
		}
		System.out.println(str);
}
else{
	System.out.println("invalid letter");
	}
}
}