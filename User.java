public class User{
	public String name;
	public int age;
	public User(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return "Username : "+ this.name+"\n"+"User Age : "+age;
	}
	public User(User user){
		this.name = user.name;
		this.age = user.age;
	}
}


