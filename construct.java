import java.util.Scanner;
public class Construct{
	public static void addAge(User user){
		user.age += 1;
	}

	public static void main(String[] args) {
		Scanner user=new Scanner(System.in);
		String userName=user.nextLine();
		int userAge=user.nextInt();
		User user1=new User(userName,userAge);
		User user2 = new User(user1);
		
		addAge(user1);


		System.out.println("user1");
		System.out.println(user1);
		System.out.println("user2:");
		System.out.println(user2);
	}

}