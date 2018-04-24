import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagram_groups {
public static void main(String args[]){
	String[] words={"dog","god","ogd","cat", "tac"};
	char[][] words1 = null;
	int n=words.length;
	words1=new char[n][];
	for(int i=0;i<n;i++)
	{	words1[i]=new char[words[i].length()];
		words1[i]=words[i].toCharArray();
		Arrays.sort(words1[i]);
		System.out.println(words1[i]);
	}
	String wordee1=String.valueOf(words1[1]);
	String wordee2=String.valueOf(words1[2]);
	if(wordee1.equals(wordee2)){
		System.out.println("yes");
	}
	HashMap<String,ArrayList<Integer>> hs=new HashMap<String,ArrayList<Integer>>();
	ArrayList<Integer> nums=new ArrayList<Integer>();
	for(int i=0;i<n;i++){
			nums=new ArrayList<Integer>();
			if(hs.get(String.valueOf(words1[i]))!=null)
			nums=hs.get(String.valueOf(words1[i]));
			System.out.println(nums);
			nums.add(i);
			hs.put(String.valueOf(words1[i]), nums);
	}
	System.out.println(hs.values());
}
}
