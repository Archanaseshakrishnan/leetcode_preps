import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class two_sum {
public static void main(String args[]){
	int array[];
	int n;
	Scanner reader=new Scanner(System.in);
	System.out.println("Enter n:");
	n=reader.nextInt();
	array=new int[n];
	List<Integer> num_array=new ArrayList<Integer>();
	System.out.println("Enter array: ");
	for(int i=0;i<n;i++){
		array[i]=reader.nextInt();
		//num_array.add(array[i]);
	}
	/*for(int e : num_array){
		System.out.println("Numbers: "+e);
	}
	num_array.sort(c);*/
	Arrays.sort(array);
	for(int e : array){
		System.out.println("Numbers: "+e);
	}
	int target;
	System.out.println("enter target: ");
	target=reader.nextInt();
	int[] a=twoSum(array,target);
	for(int e : a){
		System.out.println("Numbers: "+array[e]);
	}
}
public static int[] twoSum(int[] nums, int target) {
    if(nums==null || nums.length<2)
        return new int[]{0,0};
 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i=0; i<nums.length; i++){
        if(map.containsKey(nums[i])){
            return new int[]{map.get(nums[i]), i};
        }else{
            map.put(target-nums[i], i);
        }
    }

    return new int[]{0,0};
}
}
