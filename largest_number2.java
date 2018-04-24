import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class largest_number2 {
	private static int getFirstDigit(int number) {
        int digit = number;
        while (number > 0) {
            digit = number % 10;
            number = number / 10;
        }
        return digit;
    }
public static void main(String args[]){
	int[] input={3, 30, 34, 5, 9};
	HashMap<Integer,ArrayList<Integer>> hs=new HashMap<Integer,ArrayList<Integer>>();
	
	for(int i=0;i<input.length;i++){
		//((List<Integer>) hs).add(getFirstDigit(input[i]),input[i]);
		ArrayList<Integer> al=hs.get(getFirstDigit(input[i]));
		System.out.println(al);
		if(al==null){
			System.out.println("mine null");;
			al=new ArrayList<Integer>();
			al.add(input[i]);
			System.out.println(al);
			//al.add(input[i]);
		}
		else{
			System.out.println(" mine not null");;
			al.add(input[i]);
			System.out.println(al);
		}
		hs.put(getFirstDigit(input[i]),al);
		System.out.println("List" + hs);
	}
	
	System.out.println(hs);
	for(int i=9;i>=0;i--){
		if(hs.get(i)!=null){
			Collections.reverse(hs.get(i));
			System.out.print(hs.get(i));
		}
	}
}
}
