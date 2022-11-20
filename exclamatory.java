import java.util.*;
public class Exclamatory{
	public static void main(String[] args) {
		Scanner phrase=new Scanner(System.in);
		System.out.println("Enter the phrase");
		String words=phrase.nextLine();
		String[] word=words.split(" ");

		String a="";
		int b=0;
		String c="";
		for(int i=0;i<words.length;i++){
			String[] word1=words[i].split(" ");
			for(int j=word1.length-1;j>0;j--){
				if (word1[j]=="!"){
					c= word1[j].replace("!","");
				}
				 // a=word[i];
				 // b=a.lastIndexOf("!");
				 
				
			}
			System.out.println(c);
			System.out.println(b);
			
			;
			

			// System.out.println(word[word.length-1][word.length-1]);
		}
	}
}