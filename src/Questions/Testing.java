package Questions;
import java.util.*;
import java.util.Map.Entry;

public class Testing {
    public static void main(String[] args) {
        // HashMap<Integer, Integer> map = new HashMap<>();

        // map.put(2, 5);
        // map.put(1, 4);
        // map.put(10, 6);
        // map.put(7, 1);
        // map.put(5,7);
        // System.out.println(map.keySet());
        // System.out.println(map.entrySet());

        // for(var pair: map.entrySet()){
        //     System.out.println(pair);
        //     System.out.println(pair.getKey()+" : "+pair.getValue());
        // }
        // for(Entry<Integer,  Integer> entry: map.entrySet()){
        //     System.out.println(entry);
        // }




        // Write code here
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		if(n < 0) System.out.println("Error");
		
		System.out.println(factorial(n));
    }

	private static int factorial(int n){
		if(n <= 1){
			return 1;
		}

		return n * factorial(n-1);
	}
}
