import java.util.Scanner;
public class Vowels {

  public static int getCount(String str) {
    int count=0;
    String[] split=str.split("");
    for(String a : split){
    if(str.contains("a")||str.contains("e")||str.contains("i")||str.contains("o")||str.contains("u")){
      count++;
    }
    }
    return count;
  }
  public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    System.out.println("Enter any number");
    String num=inp.nextLine();
    int result=getCount(num);
    System.out.println(result);
  }

}