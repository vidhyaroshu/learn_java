import java.util.*;
public class Endexclamatory{
	public static void main(String[] args) {
		Scanner phrase=new Scanner(System.in);
		System.out.println("Enter the phrase");
		String words=phrase.nextLine();
		String[] word=words.split(" ");
		for(int i=0;i<word.length;i++){
			int j;
			for(j=word[i].length()-1;j>=0;j--){

				if (word[i].charAt(j)!='!'){
					break;
				}
			}
			System.out.println(word[i].substring(0, j+1));
		}
	}
}