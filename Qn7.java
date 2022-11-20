class Numbercross{
	public static void main(String[] args) {
		int input=12345;
		String inp=Integer.toString(input);
		System.out.println(inp.length());
		String output="";
		for(int i=0;i<inp.length();i++){
			for(int j=0;j<inp.length();j++){
				if(i==j||j==inp.length()-i-1 ){
					int a=j+1;
					String inpu=Integer.toString(a);
					output+=inpu;
				}
				else{
					output+=" ";
				}
			}
			output+="\n";
		}
		 System.out.println(output);
	}
}