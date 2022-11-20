class Rollnosplit{
	public static void main(String[] args) {
		int total=20;
		int groupnum=total/4;
		int startroll=100;
		for(int i=1;i<=4;i++){
			startroll=100+i;
			System.out.println("group"+i);
			for(int j=1;j<=groupnum;j++){
				System.out.println(startroll);
				startroll+=4;
			}
			
		}
	}
}