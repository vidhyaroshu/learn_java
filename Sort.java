public class Sort{
	public static void main(String[] args) {
		int[] input={12,23,11,6,44,8};
		for(int i=0;i<input.length;i++){
			for(int j=i+1;j<input.length;j++){
				int temp=0;
				if(input[i]>input[j]){
					temp=input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
			System.out.println(input[i]);
		}
	}
}