public class Teacher{
	Teacher(){
		System.out.println("Object is created");
	}
	protected void finalize(){
		System.out.println("Object is destroyed");
	} 
	public static void main(String[] args) {
	Teacher a=new Teacher();
	a=null;
	Teacher b=new Teacher();
	Teacher c=new Teacher();
	b=c;
	new Teacher();
	System.gc();
}
}
