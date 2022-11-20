public class Prime{
	public static void main(String[] args) {
		byte input=5;
		byte count=0;
	for(byte i=1;i<=input;i++){
		if(input%i==0){
			count++;
		}
	}
	if(count==2){
		System.out.println("is prime");
	}
	else{
		System.out.println("not prime");
	}

	}
}