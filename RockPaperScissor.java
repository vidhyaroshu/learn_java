import java.util.Scanner;
public class RockPaperScissor{
 static String winner(String play1,String play2){
		if(play1.equals("rock")&&play2.equals("scissors")){
		return "player1";
		}
		if(play1.equals("paper")&&play2.equals("scissors")){
		return "player2";
		}
		if(play1.equals("rock")&&play2.equals("paper")){
		return "player2";
		}
		if(play1.equals("scissors")&&play2.equals("paper")){
		return "player1";
		}
		if(play1.equals("paper")&&play2.equals("rock")){
		return "player1";
		}
		if(play1.equals("scissors")&&play2.equals("rock")){
		return "player2";
		
		}else{
			return "Draw";
		}

}

	public static void main(String[] args) {
		Scanner player1=new Scanner(System.in);
		System.out.println("Enter your choice");
		String play1=player1.nextLine();
		System.out.println("Enter your choice");
		String play2=player1.nextLine();
		// System.out.println(play1);
		// System.out.println(play1);

		String won=RockPaperScissor.winner(play1,play2);
		System.out.println(won+"won");
		
	}
}