import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;

//bucket sort
public class first_k_elts {
public static void main(String args){
	int[] arra = {5,5,5,5,4,3,3,3,2,2};
	System.out.println(k_elts(arra));
}

private static ArrayList<Integer> k_elts(int[] arr) {
	// TODO Auto-generated method stub
	HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
	int i;
	for(i=0;i<arr.length;i++){
		if(hs.containsKey(arr[i])){
			int count=hs.get(arr[i]);
			count++;
			hs.put(arr[i], count);
		}
		else{
			hs.put(arr[i], 1);
		}
	}
	HashMap<Integer,Integer> hs1=new HashMap<Integer,Integer>();
	
		Set<Integer> val=hs.keySet();
		Object[] vals=val.toArray();
		for(i=0;i<val.size();i++){
			int key=hs.get(vals[i]);
			hs1.put(key, (Integer) vals[i]);
		}
		ArrayList<Integer> keys=(ArrayList<Integer>) hs1.keySet();
		Comparator c=Collections.reverseOrder();
		keys.sort(c);
		ArrayList<Integer> res=new ArrayList<Integer>(); 
		for (Integer i1:keys)
		{
			Integer arr2=hs1.get(i1);
			res.add(arr2);
		}
	
	return res;
}
}
