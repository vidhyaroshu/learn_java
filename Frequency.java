import java.util.*;
public class Frequency{
	public static void main(String[] args) {
		Scanner length=new Scanner(System.in);
		System.out.println("Enter the arraylength");
		int arraylength=length.nextInt();
		int[] arr=new int[arraylength];
		int str=0;
		int count=-1;
		int[] arr1=new int[arraylength];
		for(int i=0;i<arraylength;i++){
			System.out.println("Enter the number");
			int number=length.nextInt();
			arr[i]=number;
		}
		for(int j=0;j<arraylength;j++){
			for(int k=0;k<arraylength;k++){
				if(arr[j]==arr[k]){
					count++;
					arr1[j]=arr[j];
					arr1[j]=count;	
				}
			}
			System.out.println(arr[j]+"-"+count);	
			count=-1;
		}
	}
}