import java.util.*;
public class List{
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("enter any value");
		String carname=inp.nextLine();
		ArrayList<String> cars = new ArrayList<String>();
		cars.add(carname);
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	   System.out.println( cars.add("Mazda"));
	    cars.add(5,"Rollsroyce");
	    System.out.println(cars);
	    Collections.sort(cars);
	    System.out.println(cars);
	   System.out.println(cars.clone());
	   System.out.println(cars.contains("BMW"));
		int n=6;
		ArrayList<Integer> arr=new ArrayList<Integer>(n);
		 for (int i = 1; i <= n; i++){
            arr.add(i);
        }
        System.out.println(arr.toArray());
        arr.remove(3);
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i) + " ");
        }
        arr.forEach((e) -> {
      e = e * e;
      System.out.print(e + " ");
    });
    }

	
}+